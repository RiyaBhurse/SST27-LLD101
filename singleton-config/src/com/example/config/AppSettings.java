package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * A proper, thread-safe, and immutable Singleton.
 */
public final class AppSettings implements Serializable {

    // volatile is crucial for thread safety
    private static volatile AppSettings INSTANCE;
    private final Properties props = new Properties();

    // Private constructor to prevent direct instantiation
    private AppSettings(Path file) {
        if (INSTANCE != null) {
            throw new IllegalStateException("Singleton already initialized. Use getInstance() method.");
        }
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    // Public entry point to initialize the singleton (called once)
    public static void initialize(Path configFilePath) {
        if (INSTANCE == null) {
            synchronized (AppSettings.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AppSettings(configFilePath);
                }
            }
        }
    }

    // Public access point to retrieve the single instance
    public static AppSettings getInstance() {
        if (INSTANCE == null) {
            throw new IllegalStateException("AppSettings has not been initialized. Call initialize() first.");
        }
        return INSTANCE;
    }

    // Method to preserve singleton on deserialization
    protected Object readResolve() throws ObjectStreamException {
        return getInstance();
    }

    // Get method for properties
    public String get(String key) {
        return props.getProperty(key);
    }
}
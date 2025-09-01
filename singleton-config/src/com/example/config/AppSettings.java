package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * A correct, thread-safe, and immutable Singleton for application settings.
 */
public final class AppSettings implements Serializable {
    private final Properties props = new Properties();

    private static volatile AppSettings instance;

    private AppSettings(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static void initialize(Path configFilePath) {
        if (instance == null) {
            synchronized (AppSettings.class) {
                if (instance == null) {
                    instance = new AppSettings(configFilePath);
                }
            }
        }
    }

    public static AppSettings getInstance() {
        if (instance == null) {
            throw new IllegalStateException("AppSettings has not been initialized. Call initialize() first.");
        }
        return instance;
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}
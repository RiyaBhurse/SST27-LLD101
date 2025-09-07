package com.example.config;

import java.nio.file.Path;

/** Thin wrapper for getting the singleton instance. */
public class SettingsLoader {
    public AppSettings load(Path file) {
        // Now this method just gets the single instance
        // It no longer creates a new one.
        return AppSettings.getInstance();
    }
}
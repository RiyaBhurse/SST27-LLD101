package com.example.config;

import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws Exception {
        String path = args.length > 0 ? args[0] : "app.properties";

        // Initialize the Singleton once at startup
        AppSettings.initialize(Path.of(path));

        // Now, get the instance whenever needed
        System.out.println("app.name=" + AppSettings.getInstance().get("app.name"));
        System.out.println("instance=" + System.identityHashCode(AppSettings.getInstance()));
    }
}
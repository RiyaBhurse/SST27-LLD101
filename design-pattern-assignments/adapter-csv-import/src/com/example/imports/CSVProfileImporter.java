package com.example.imports;

import java.nio.file.Path;

public class CSVProfileImporter implements ProfileImporter {
    NaiveCsvReader reader;
    ProfileService service;

    public CSVProfileImporter(NaiveCsvReader reader, ProfileService service) {
        this.reader = reader;
        this.service = service;
    }

    @Override
    public int importFrom(Path p) {
        int count = 0;
        for (String[] row : reader.read(p)) {
            // Skip rows with insufficient columns
            if (row.length < 2) {
                continue;
            }

            String id = row[0].trim();
            String email = row[1].trim();
            String displayName = (row.length > 2) ? row[2].trim() : null;

            // Skip rows with invalid data
            if (id.isEmpty() || email.isEmpty() || !email.contains("@")) {
                System.out.println("Skipped invalid row: " + String.join(",", row));
                continue;
            }

            service.createProfile(id, email, displayName);
            count++;
        }
        return count;
    }
}

package com.example.profiles;

import java.util.Objects;

/**
 * Assembles profiles with scattered, inconsistent validation.
 */
public class ProfileService {
    public static ProfileService svc;
    private ProfileService() {
        svc = this;
    }
    public static ProfileService getInstance() {
        if (svc == null) {
            svc = new ProfileService();
        }
        return svc;
    }
    // returns a fully built profile but mutates it afterwards (bug-friendly)
    public UserProfile createMinimal(String id, String email) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("bad id");
        if (email == null || !email.contains("@")) throw new IllegalArgumentException("bad email");
        UserProfile p = UserProfile.buildUserProfile().setId(id).setEmail(email).build();
        // UserProfile p = UserProfile.buildUserProfile().setId(id).setEmail(email);
        // later code keeps mutating...
        return p;
    }

    public void updateDisplayName(UserProfile p, String displayName) {
        Objects.requireNonNull(p, "profile");
        if (displayName != null && displayName.length() > 100) {
            // silently trim (inconsistent policy)
            displayName = displayName.substring(0, 100);
        }
        p.setDisplayName(displayName); // mutability leak
    }
}

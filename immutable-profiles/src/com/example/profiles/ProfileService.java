package com.example.profiles;

import java.util.Objects;

/**
 * Assembles profiles using the UserProfile.Builder.
 */
public class ProfileService {

    public UserProfile createMinimal(String id, String email) {
        // The builder now centralizes validation, so we can remove it here
        return new UserProfile.Builder(id, email).build();
    }

    public UserProfile createWithPhone(String id, String email, String phone) {
        // A more complex example using the builder's fluent interface
        return new UserProfile.Builder(id, email)
            .withPhone(phone)
            .build();
    }

    // This method is now invalid because UserProfile is immutable.
    // It should be removed or changed to return a new object.
    /*
    public void updateDisplayName(UserProfile p, String displayName) {
        Objects.requireNonNull(p, "profile");
        if (displayName != null && displayName.length() > 100) {
            displayName = displayName.substring(0, 100);
        }
        p.setDisplayName(displayName); // This mutability is now gone
    }
    */
}
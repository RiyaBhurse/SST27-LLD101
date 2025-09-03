package com.example.profiles;

import java.util.Objects;

/**
 * Immutable UserProfile built with a static inner Builder.
 */
public final class UserProfile {
    private final String id;
    private final String email;
    private final String phone;
    private final String displayName;
    private final String address;
    private final boolean marketingOptIn;
    private final String twitter;
    private final String github;

    private UserProfile(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.phone = builder.phone;
        this.displayName = builder.displayName;
        this.address = builder.address;
        this.marketingOptIn = builder.marketingOptIn;
        this.twitter = builder.twitter;
        this.github = builder.github;
    }

    // Getters for all fields
    // They are supposed to return the copy of the objects
    public String getId() { return id; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getDisplayName() { return displayName; }
    public String getAddress() { return address; }
    public boolean isMarketingOptIn() { return marketingOptIn; }
    public String getTwitter() { return twitter; }
    public String getGithub() { return github; }

    /**
     * The static inner Builder class.
     */
    public static class Builder {
        // Required parameters
        private final String id;
        private final String email;

        // Optional parameters
    
        private String phone;
        private String displayName;
        private String address;
        private boolean marketingOptIn = false;
        private String twitter;
        private String github;

        public Builder(String id, String email) {
            this.id = id;
            this.email = email;
        }

        // Methods for optional parameters (fluent interface)
        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withMarketingOptIn(boolean marketingOptIn) {
            this.marketingOptIn = marketingOptIn;
            return this;
        }

        public Builder withTwitter(String twitter) {
            this.twitter = twitter;
            return this;
        }

        public Builder withGithub(String github) {
            this.github = github;
            return this;
        }

        // The build method centralizes validation and returns the immutable object
        public UserProfile build() {
            return new UserProfile(this);
        }
    }
}
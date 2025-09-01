package com.example.profiles;

/**
 * Mutable and confusing. Multiple constructors + setters.
 */
public class UserProfile {
    private class subUserProfile{
        private String id;
        private String email;
        private String phone;
        private String displayName;
        private String address;
        private boolean marketingOptIn;
        private String twitter;
        private String github;
        private subUserProfile(){}

        public UserProfile build(subUserProfile subUserProfile){
            UserProfile profile = new UserProfile();
            profile.id = subUserProfile.id;
            profile.email = subUserProfile.email;
            profile.phone = subUserProfile.phone;
            profile.displayName = subUserProfile.displayName;
            profile.address = subUserProfile.address;
            profile.marketingOptIn = subUserProfile.marketingOptIn;
            profile.twitter = subUserProfile.twitter;
            profile.github = subUserProfile.github;
            return profile;
        }

        public subUserProfile setId(String id) { this.id = id; return this; }
        public subUserProfile setEmail(String email) {
            this.email = email; return this;
        }
        public subUserProfile setPhone(String phone) { this.phone = phone; return this; }
        public subUserProfile setDisplayName(String displayName) { 
            this.displayName = displayName; return this; 
        }
        public subUserProfile setAddress(String address) { this.address = address; return this; }
        public subUserProfile setMarketingOptIn(boolean marketingOptIn) { this.marketingOptIn = marketingOptIn; return this; }
        public subUserProfile setTwitter(String twitter) { this.twitter = twitter; return this; }
        public subUserProfile setGithub(String github) { this.github = github; return this; }


    }

    private String id;
    private String email;
    private String phone;
    private String displayName;
    private String address;
    private boolean marketingOptIn;
    private String twitter;
    private String github;

    public UserProfile() { }

    public static UserProfile buildUserProfile(){
        UserProfile userProfile = new UserProfile();
        return userProfile;
    }

    // public UserProfile(String id, String email) {
    //     this.id = id;
    //     this.email = email;
    // }

    // public UserProfile(String id, String email, String phone) {
    //     this(id, email);
    //     this.phone = phone;
    // }

    // many setters — mutability leaks
    // public UserProfile setId(String id) { this.id = id; return this; }
    // public UserProfile setEmail(String email) {
    //     this.email = email; return this;
    // }
    // public UserProfile setPhone(String phone) { this.phone = phone; return this; }
    // public UserProfile setDisplayName(String displayName) { 
    //     this.displayName = displayName; return this; 
    // }
    // public UserProfile setAddress(String address) { this.address = address; return this; }
    // public UserProfile setMarketingOptIn(boolean marketingOptIn) { this.marketingOptIn = marketingOptIn; return this; }
    // public UserProfile setTwitter(String twitter) { this.twitter = twitter; return this; }
    // public UserProfile setGithub(String github) { this.github = github; return this; }

    // getters
    public String getId() { return id; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getDisplayName() { return displayName; }
    public String getAddress() { return address; }
    public boolean isMarketingOptIn() { return marketingOptIn; }
    public String getTwitter() { return twitter; }
    public String getGithub() { return github; }
}

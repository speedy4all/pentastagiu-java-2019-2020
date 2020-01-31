package com.pentalog.pentastagiu.week4.nested;

public class User {
    private int id;
    private String firstName;
    private String familyName;
    private String email;

    // private constructor, which means that noone except someone from my class can create instances of it
    private User() {

    }

    // nested class used to create instances of User
    public static class Builder {
        private int id;
        private String firstName;
        private String familyName;
        private String email;

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withFamilyName(String familyName) {
            this.familyName = familyName;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            User user = new User();
            user.id = this.id;
            user.email = this.email;
            user.firstName = this.firstName;
            user.familyName = this.familyName;

            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    /*    public User(int id, String firstName, String familyName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.familyName = familyName;
        this.email = email;
    }*/
}

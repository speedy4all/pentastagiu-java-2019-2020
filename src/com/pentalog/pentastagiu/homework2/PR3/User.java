package com.pentalog.pentastagiu.homework2.PR3;

public class User {
    private String name, email,password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
///these things cannot be changed


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}

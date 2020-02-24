package com.pentalog.pentastagiu.homework2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String name;
    private String username;
    private String email;

    Pattern pattern = Pattern.compile("^(.+)@(.+)$");
    boolean matches;

    public User(String name, String username, String email) {
        this.name = name;
        this.username = username;
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(("Invalid email"));
        }
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(("Invalid email"));
        }
        this.email = email;
    }
}

package com.pentalog.pentastagiu.homework2;

public class User {
    static int id;
    String username;
    String password;

    public User(String username, String password) {
        this.id++;
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

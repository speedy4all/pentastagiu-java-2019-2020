package com.pentalog.pentastagiu.homework3.ex3;

public class User {
    private String username;
    private String email;

    public User(String user, String email) {
        super();
        this.username = user;
        this.email = email;
    }

    private void sendMessage(String message) {
        System.out.println("From: " + this.username + "\nText: " + message + "\n");
    }

    public static void main(String[] args) {
        User user1 = new User("user1", "user1@yahoo.com");
        User user2 = new User("user2", "user2@yahoo.com");
        User user3 = new User("user3", "user3@yahoo.com");

        user1.sendMessage("aaaa");
        user2.sendMessage("bbb");
        user1.sendMessage("ccc");
        user3.sendMessage("ddd");
    }
}


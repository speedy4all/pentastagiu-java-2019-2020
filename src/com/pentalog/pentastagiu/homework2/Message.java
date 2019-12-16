package com.pentalog.pentastagiu.homework2;

public class Message {

    private String message;
    private String description;
    private User user;

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Message(String message, String description, User user) {
        this.message = message;
        this.description = description;
        this.user = user;
    }
}

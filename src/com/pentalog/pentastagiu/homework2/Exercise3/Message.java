package com.pentalog.pentastagiu.homework2.Exercise3;

public class Message {
    private String description;
    private User author;

    public Message(String description, User author) {
        this.description = description;
        this.author = author;
    }

    public User getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }
}

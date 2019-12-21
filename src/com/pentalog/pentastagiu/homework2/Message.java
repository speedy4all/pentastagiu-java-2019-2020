package com.pentalog.pentastagiu.homework2;

public class Message {
    private int id;
    private String description;
    private User author;

    public Message(int id, String description, User author) {
        this.id = id;
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

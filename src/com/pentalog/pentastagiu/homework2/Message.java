package com.pentalog.pentastagiu.homework2;

public class Message {
    private static int id;
    private String description;
    private String author;

    public Message(String description, String author) {
        this.id++;
        this.description = description;
        this.author = author;
    }

    public String getDescription() {
        return description;
    }
}

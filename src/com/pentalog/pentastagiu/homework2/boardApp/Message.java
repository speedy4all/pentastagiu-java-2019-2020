package com.pentalog.pentastagiu.homework2.boardApp;

public class Message {
    private String author;
    private String description;

    public Message(String author, String description) {
        this.author = author;
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

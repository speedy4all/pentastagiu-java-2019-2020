package com.pentalog.pentastagiu.homework2.problema3;

public class Message {
    private String description;
    private String author;

    public Message(String description, String author) {
        this.description = description;
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}

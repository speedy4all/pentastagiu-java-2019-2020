package com.pentalog.pentastagiu.homework2;

public class Message {
    private String description;
    private User author;

    public Message(String description, User author) {
        this.description = description;
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void sendMessage(){
        System.out.println("This message: \n" + author + ": "+description + "\nwas sent by " + author.getName());
    }
}

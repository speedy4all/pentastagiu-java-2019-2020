package com.pentalog.pentastagiu.homework2;

public class Message {
    private String description;
    private String author;
    private User user;

    public Message (User user){
        this.user = user;
    }
    public User getUser() {
        return user;
    }

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

    public void sendMessage(){
        System.out.println("This message: \n" + author + ": "+description + "\nwas sent by " + user.getName());
    }
}

package com.pentalog.pentastagiu.homework2.displayMessages;

public class Message {
    private String message;
    private User author;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Message(){
        System.out.println("write author and message");
    }

    public Message(User user, String message){
        this.author = user;
        this.message = message;
        System.out.println("Author:" + this.author.getName() + "\nMessage: " + this.message + '\n');
    }

}

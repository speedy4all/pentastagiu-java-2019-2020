package com.pentalog.pentastagiu.homework2.PR3;

public class Message {
    private String description,author,subject,id;

    public Message(String description, String author, String subject,String id) {
        this.description = description;
        this.author = author;
        this.subject = subject;
        this.id=id; ///the email of the user
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAuthor() {
        return author;
    }


    public void printM() ///all messages
    {

        System.out.println("Subject: "+subject+"\n"+description+"\nWritten by "+ author+ "\n\n");
    }


    public void print() ///messages written by the current user
    {

        System.out.println("Subject: "+subject+"\n"+description+"\n\n");
    }

    public String getId() {
        return id;
    }
}

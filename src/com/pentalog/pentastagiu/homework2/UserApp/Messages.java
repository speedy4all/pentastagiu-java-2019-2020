package com.pentalog.pentastagiu.homework2.UserApp;

public class Messages {
    private String Description;
    private String Author;


    Messages(String Description, String Author){
        this.Description=Description;
        this.Author=Author;
    }

    public String getDescription() {
        return Description;
    }

    public String getAuthor() {
        return Author;
    }
}

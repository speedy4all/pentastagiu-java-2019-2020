package com.pentalog.pentastagiu.homework2.registration;

import java.util.ArrayList;
import java.util.List;

public class Message {
    private String description;
    private String author;

    public static List<String> messageList = new ArrayList<>();

    public Message(String description, String author){
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

    public static List<String> getMessageList() {
        return messageList;
    }

    public static void setMessageList(List<String> messageList) {
        Message.messageList = messageList;
    }
}

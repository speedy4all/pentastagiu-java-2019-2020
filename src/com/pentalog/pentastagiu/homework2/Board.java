package com.pentalog.pentastagiu.homework2;

import java.util.LinkedList;
import java.util.List;

public class Board {
    private int id;
    private List<Message> messages;

    public Board() {
        this.messages = new LinkedList<>();
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public void printMessages() {
        for (Message message : messages) {
            System.out.println(message.getAuthor().getUsername() + ": " + message.getDescription());
        }
    }
}

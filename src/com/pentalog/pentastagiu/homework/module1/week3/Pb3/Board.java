package com.pentalog.pentastagiu.homework.module1.week3.Pb3;

import java.util.ArrayList;

public class Board {
    private ArrayList<Message> allMessages = new ArrayList<Message>();

    void AddMessage(Message message)
    {
        allMessages.add(message);
    }

    void printAllMessages()
    {
        for (Message m : allMessages) {
            System.out.println(m.getAuthor() + ": " + m.getDescription());
        }
    }
}

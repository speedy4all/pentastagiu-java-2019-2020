package com.pentalog.pentastagiu.homework2.exercise3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Board {
    private Set<User> loggedUsers = new HashSet<>();
    private List<Message> messages = new ArrayList<>();

    public void addUserToBoard(User user) {
        loggedUsers.add(user);
    }

    public void postMessage(Message message) {
        if (loggedUsers.contains(message.getAuthor())) {
            messages.add(message);
        } else {
            System.out.println("User with name '" + message.getAuthor().getName() + "' is not allowed to post here.");
        }
    }

    public void printAllMessages() {
        messages.forEach(msg -> System.out.println(msg.getAuthor().getName() + " posted: " + msg.getDescription()));
    }
}

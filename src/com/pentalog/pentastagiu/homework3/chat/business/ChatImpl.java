package com.pentalog.pentastagiu.homework3.chat.business;

import com.pentalog.pentastagiu.homework3.chat.domain.Users;

import javax.swing.*;
import java.util.*;

public class ChatImpl implements Chat {

    private List<Users> usersList = new ArrayList<>();
    private Map<String, List<Users>> Conversation = new HashMap<>();

    @Override
    public void addUser() {
        Users u = new Users();
        u.setName(JOptionPane.showInputDialog("Name: "));
        u.setEmail(JOptionPane.showInputDialog("Email: "));
        usersList.add(u);
        Conversation.put(u.getEmail(), usersList);
        System.out.println("New user has joined: " + u.getName());
    }

    @Override
    public void conversation() {
        Iterator<Users> it = usersList.iterator();
        boolean yesUser = false;
        String input = JOptionPane.showInputDialog("Type the email account you want to access:");
        while (it.hasNext()) {
            Users users = it.next();
            if (users.getEmail().equals(input)) {
                yesUser = true;
                users.setMessage(JOptionPane.showInputDialog("Chat: "));
                System.out.println(users.getName() + ": " + users.getMessage());
            }
        }
        if (!yesUser) System.out.println("The email is not valid or non existent!");
    }
}

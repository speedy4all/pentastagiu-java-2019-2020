package com.pentalog.pentastagiu.homework2.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Board {
    private static Map<String, char[]> board;
    private static Map<String, String> registeredUsers;

    private Board() {
    }

    public static void registerUser(String name, String mail) {
        if (registeredUsers == null)
            registeredUsers = new HashMap<>();
        if (registeredUsers.containsKey(mail)) {
            System.out.println("This mail is already used!");
            return;
        }
        registeredUsers.put(mail, name);
        System.out.println(name + " is now registered!");
    }

    public static void writeOnTheBoard(String name, String mail) {
        try {
            if (board == null)
                board = new LinkedHashMap<String, char[]>();
            if (registeredUsers == null) {
                System.out.println("This account isn't registered!");
                return;
            }

            if (checkUser(name, mail)) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter your text below also when you want to submit enter \"submit\" on the next line ");
                StringBuilder message = new StringBuilder();
                String line;
                while (!"submit".equals(line = reader.readLine())) {
                    message.append(line);
                }
                message.append('\n');
                message.append("Author: " + name);
                board.put(mail, message.toString().toCharArray());
            } else
                System.out.println("This account doesn't exist");


        } catch (IOException e) {

        }
    }

    public static void displayBoard() {
        Iterator<Map.Entry<String, char[]>> boardIterator = board.entrySet().iterator();
        System.out.println("[Board]");
        while (boardIterator.hasNext()) {
            System.out.println();
            System.out.println(boardIterator.next().getValue());
        }
    }

    public static boolean checkUser(String name, String mail) {
        if (registeredUsers.containsKey(mail) && registeredUsers.get(mail).equals(name))
            return true;
        return false;
    }
}

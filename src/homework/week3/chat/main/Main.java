package homework.week3.chat.main;

import homework.week3.chat.business.ChatImpl;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ChatImpl chat = new ChatImpl();

        int option;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("OPTIONS\nPlease select from the options below:" + "\n1. Add a new user" + "\n2. Chat" + "\n3. Exit"));
            switch (option) {
                case 1:
                    chat.addUser();
                    break;
                case 2:
                    chat.conversation();
                    break;
                case 3:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid action!");
                    break;
            }
        } while (option != 3);
    }
}

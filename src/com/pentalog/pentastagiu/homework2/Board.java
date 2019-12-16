package com.pentalog.pentastagiu.homework2;

import java.util.*;


public class Board {

    //Create a console application from the following requirements:
    //We have some users that can register into an app with name & email
    //Users are able to post messages on a board
    //Each message has a description and an author
    //The board can display messages from all the users

    public Board() {

    }
    private String username;
    private String message;
    private String title;

    // static String fileName = "board.txt";


    public String getUsername() {
        return username;
    }

    public String getMessage() {
        return message;
    }

    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, register first!");
        System.out.println("Enter username:");
        username = sc.nextLine();

        System.out.println("Enter e-mail:");
        String email = sc.nextLine();

    }

    //public Vector<String> allMessages = new Vector();

    public void createMessage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a title:");
        title = sc.nextLine();
        System.out.println("Enter a message:");
        message = sc.nextLine();

    }

    public void showBoard() {
        System.out.println("A new message from " + username);
        System.out.println("Press 1 to view message.");
    }

    public void showMessage() {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        switch(input) {
            case 1:
                System.out.println("Title: " + title);
                System.out.println(message);
                break;
            default:
                break;

        }

    }









}





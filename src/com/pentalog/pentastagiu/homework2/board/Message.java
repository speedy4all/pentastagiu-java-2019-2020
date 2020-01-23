package com.pentalog.pentastagiu.homework2.board;

import java.util.Scanner;

public class Message {
    private String userName;
    private String description;
    Scanner scan=new Scanner(System.in);

    public Message() {
    }

    public Message(String userName, String description) {
        super();
        this.userName = userName;
        this.description = description;
    }

    public void postMessage(String userName, String description) {
        System.out.println("Post a messagee as \"" + userName+"\"");
        System.out.println("Post your message:  " );


    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}

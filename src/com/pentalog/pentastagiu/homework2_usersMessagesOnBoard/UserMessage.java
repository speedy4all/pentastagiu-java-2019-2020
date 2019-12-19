package com.pentalog.pentastagiu.homework2_usersMessagesOnBoard;

public class UserMessage {
    private String userName;
    private String description;

    //constructors
    public UserMessage() {
    }

    public UserMessage(String userName, String description) {
        this.userName = userName;
        this.description = description;
    }

    //post message
    public void postMessage(String userName) {
        System.out.println("Post a messagee as \"" + userName+"\"");
        System.out.println("Post your message:  " );


    }
    //getters and setters
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

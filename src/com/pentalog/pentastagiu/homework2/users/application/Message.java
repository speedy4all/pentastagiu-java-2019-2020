package com.pentalog.pentastagiu.homework2.users.application;

public class Message {

    private String description;
    private UserChat userChat;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserChat getUserChat() {
        return userChat;
    }

    public void setUserChat(UserChat userChat) {
        this.userChat = userChat;
    }

    public Message(String description, UserChat userChat) {
        this.description = description;
        this.userChat = userChat;
    }
}

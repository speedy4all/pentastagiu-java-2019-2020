package com.pentalog.pentastagiu.homework2.problema3;

public class User {
    private String mail;
    private String name;
    private boolean isRegistering = false;
    private boolean isSendingMessage = false;
    private Message message = null;
    public User(String mail, String name) {
        this.mail = mail;
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRegistering() {
        return isRegistering;
    }

    public void setRegistering(boolean registering) {
        isRegistering = registering;
    }

    public void SendMessage(String message)
    {
        this.message = new Message(message,name);
        isSendingMessage = true;
    }

    public String getMessage() {
        String user_message =  message.getAuthor() +message.getDescription();
        return user_message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public boolean isSendingMessage() {
        return isSendingMessage;
    }

    public void setSendingMessage(boolean sendingMessage) {
        isSendingMessage = sendingMessage;
    }
}

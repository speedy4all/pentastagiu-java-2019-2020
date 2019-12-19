package com.pentalog.pentastagiu.homework2.boardApp;

public class Users{
    private String name;
    private String email;
    private boolean isRegistered;
    private Message message;

    public Users(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void registerUser(){
        this.isRegistered = true;
    }

    public String postMessage(Message message){
        if (isRegistered){
            return "Message from:" + message.getAuthor() + " : " + message.getDescription();
        }
        else {
            return this.name + " not registered";
        }
    }


}

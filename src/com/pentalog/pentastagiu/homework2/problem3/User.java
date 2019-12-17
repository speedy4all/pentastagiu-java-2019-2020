package com.pentalog.pentastagiu.homework2.problem3;

public class User {

    private String name;
    private String email;
    private boolean isRegistered = true;
    private Message message;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String postMessage(Message message){
        if(isRegistered) {
            return "From " + message.getAuthor() + " : " + message.getDescription();
        }else{
            return this.name + " is not registered!";
        }
    }

    public void Register(){
        this.isRegistered = true;
    }

}

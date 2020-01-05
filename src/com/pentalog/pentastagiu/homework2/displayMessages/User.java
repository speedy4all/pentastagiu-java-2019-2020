package com.pentalog.pentastagiu.homework2.displayMessages;

public class User {
    private String name;
    private String email;

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

    public User(){
        System.out.println("Enter the name and email");
    }

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public static String returnName(){
        return returnName();
    }

    public static void WriteMessage(String message){
        System.out.println(message);
        System.out.println();
        //return message;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", email: " + this.email;
    }
}

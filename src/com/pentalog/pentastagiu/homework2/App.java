package com.pentalog.pentastagiu.homework2;

public class App {

    private String name;
    private String email;
    private String description;
    private String author;

    public void register(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void publishMessage(String message, String description) {
        System.out.println("========================================================");
        System.out.println("Author: " + name + " ------ " + "Description: " + description);
        System.out.println(message);
        System.out.println("========================================================");
    }


}

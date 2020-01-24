package com.pentalog.pentastagiu.homework5;

public class ClientNotFoundException extends RuntimeException {
    private Integer account;

    public ClientNotFoundException(Integer account) {
        this.account = account;
    }

    public void printMessage(){
        System.out.println("Client with account " + account + " was not found!");
    }
}

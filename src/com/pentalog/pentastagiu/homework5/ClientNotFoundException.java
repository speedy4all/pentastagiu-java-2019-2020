package com.pentalog.pentastagiu.homework5;

public class ClientNotFoundException extends RuntimeException {
    private int account;

    public ClientNotFoundException(int account){
        this.account = account;
    }

    public String getMessage(){
        return String.format("Client %1s was not found !", account);
    }
}

package com.pentalog.pentastagiu.homework.module1.week6;

public class ClientNotFoundException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Client does not exist";
    }
}

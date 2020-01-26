package com.pentalog.pentastagiu.homework6;

public class ClientNotFoundException extends RuntimeException {
    public String getMessage() {
        return "Client not found";
    }
}

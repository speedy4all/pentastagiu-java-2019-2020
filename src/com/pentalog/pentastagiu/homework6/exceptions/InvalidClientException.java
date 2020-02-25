package com.pentalog.pentastagiu.homework6.exceptions;

public class InvalidClientException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Client invalid.";
    }
}

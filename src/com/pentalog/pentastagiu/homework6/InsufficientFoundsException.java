package com.pentalog.pentastagiu.homework6;

public class InsufficientFoundsException extends RuntimeException {
    public String getMessage() {
        return "You do not have enough money";
    }
}

package com.pentalog.pentastagiu.homework5;

public class InsufficientFoundsException extends RuntimeException {
    private double amount;

    public InsufficientFoundsException(double amount){
        this.amount = amount;
    }

    public String getMessage(){
        return String.format("\nSorry, but you are short %1s RON", amount);
    }
}

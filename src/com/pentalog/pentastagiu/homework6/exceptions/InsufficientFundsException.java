package com.pentalog.pentastagiu.homework6.exceptions;

public class InsufficientFundsException extends RuntimeException {
    private double amount;

    public InsufficientFundsException(double amount){
        this.amount = amount;
    }

    public String getMessage(){
        return String.format("\nSorry, but you are short %1s RON", amount);
    }
}

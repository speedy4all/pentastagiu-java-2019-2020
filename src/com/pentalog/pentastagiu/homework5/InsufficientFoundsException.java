package com.pentalog.pentastagiu.homework5;

public class InsufficientFoundsException extends RuntimeException {
    private double amount;

    public InsufficientFoundsException(double amount){
        this.amount = amount;
    }

    public void printMessage(){
        System.out.println("Insufficient funds");
    }
}

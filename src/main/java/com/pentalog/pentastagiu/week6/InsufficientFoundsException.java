package com.pentalog.pentastagiu.week6;

public class InsufficientFoundsException extends Exception {
    private double amount;

    public InsufficientFoundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

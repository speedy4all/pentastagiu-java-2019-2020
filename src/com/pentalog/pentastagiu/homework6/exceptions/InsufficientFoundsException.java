package com.pentalog.pentastagiu.homework6.exceptions;

public class InsufficientFoundsException extends RuntimeException {
    private Double amount;

    public InsufficientFoundsException(Double amount) {
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return String.format("\nSorry, but you are short %1s RON", amount);
    }
}

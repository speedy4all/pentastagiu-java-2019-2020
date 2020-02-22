package com.pentalog.pentastagiu.homework6;

public class InssuficientFoundException extends RuntimeException{
    private Double amount;

    public InssuficientFoundException(Double amount) {
        this.amount = amount;
    }
    public String getMessage() {
        return String.format("\nSorry, but you are short %1s RON", amount);
    }
}

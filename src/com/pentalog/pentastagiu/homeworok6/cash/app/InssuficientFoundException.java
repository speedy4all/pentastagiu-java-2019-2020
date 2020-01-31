package com.pentalog.pentastagiu.homeworok6.cash.app;

public class InssuficientFoundException extends RuntimeException {
    private Double amount;

    public InssuficientFoundException(Double amount) {
        this.amount = amount;
    }

    @Override
    public String getMessage() {
        return String.format("\nWe are sorry, but you do not have enough money: %1s RON", amount);
    }
}

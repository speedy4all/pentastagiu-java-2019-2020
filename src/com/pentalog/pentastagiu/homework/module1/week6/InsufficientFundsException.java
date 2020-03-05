package com.pentalog.pentastagiu.homework.module1.week6;

public class InsufficientFundsException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Client does not have enough funds";
    }
}

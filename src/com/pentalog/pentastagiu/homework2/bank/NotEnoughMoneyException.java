package com.pentalog.pentastagiu.homework2.bank;

public class NotEnoughMoneyException extends  Exception {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}

package com.pentalog.pentastagiu.homework6.exceptions;

public class InvalidAccountException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Amount or account are invalid";
    }

}

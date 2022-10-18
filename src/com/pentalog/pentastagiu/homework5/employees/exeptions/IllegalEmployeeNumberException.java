package com.pentalog.pentastagiu.homework5.employees.exeptions;

public class IllegalEmployeeNumberException extends RuntimeException{
    public IllegalEmployeeNumberException(String message){
        super(message);
    }
}

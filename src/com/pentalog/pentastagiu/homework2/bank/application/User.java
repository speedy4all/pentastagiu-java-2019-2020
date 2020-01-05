package com.pentalog.pentastagiu.homework2.bank.application;

public class User {
    private String firstName;
    private String lastName;
    private Integer pin;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public User(String firstName, String lastName, Integer pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }
}

package com.pentalog.pentastagiu.homework2.atm;

public class Card {
    private String number;
    private Integer pin;
    private User user;

    //constructors
    public Card(String number, Integer pin, User user) {
        this.number = number;
        this.pin = pin;
        this.user = user;
    }

    //getters and setters
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Integer getPin() {
        return pin;
    }
    public void setPin(Integer pin) {
        this.pin = pin;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}

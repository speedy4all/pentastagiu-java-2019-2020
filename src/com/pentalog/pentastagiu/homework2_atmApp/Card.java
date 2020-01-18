package com.pentalog.pentastagiu.homework2.atm;

public class Card {
    private String numerCard;
    private Integer pinCard;
    private User user;

    //constructors
    public Card() {

    }

    public Card(String numerCard, Integer pinCard, User user) {
        this.numerCard = numerCard;
        this.pinCard = pinCard;
        this.user = user;
    }

    //getters and setters
    public String getNumerCard() {
        return numerCard;
    }
    public void setNumerCard(String numerCard) {
        this.numerCard = numerCard;
    }
    public Integer getPinCard() {
        return pinCard;
    }
    public void setPinCard(Integer pinCard) {
        this.pinCard = pinCard;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}

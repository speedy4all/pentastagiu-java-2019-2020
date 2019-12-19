package com.pentalog.pentastagiu.homework2_atmApp;

public class Card {
    private String numerCard;
    private Integer pinCard;
    private UserDetails user;

    //constructors
    public Card() {

    }

    public Card(String numerCard, Integer pinCard, UserDetails user) {
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
    public UserDetails getUser() {
        return user;
    }
    public void setUser(UserDetails user) {
        this.user = user;
    }

}

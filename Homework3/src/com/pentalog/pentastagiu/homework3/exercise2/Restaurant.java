package com.pentalog.pentastagiu.homework3.exercise2;

public class Restaurant{

    protected int numberOfGuests = 0;
    protected double income = 0;
    protected double priceOfFixedMenu = 25;
    protected double tax ;

    public void accomodateGuests(int numberOfNewGuests){
        numberOfGuests += numberOfNewGuests;
        while(numberOfNewGuests != 0){
            income += priceOfFixedMenu;
            numberOfNewGuests--;
        }
        System.out.println("The income is: " + income + "$");
    }



}

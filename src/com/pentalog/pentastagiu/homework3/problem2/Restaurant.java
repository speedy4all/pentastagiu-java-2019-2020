package com.pentalog.pentastagiu.homework3.problem2;

public  class Restaurant {
    protected int currentNumberGuests;
    protected double income;
    protected double priceMenu;

    Restaurant(int currentNumberGuests, double priceMenu){
        if (currentNumberGuests <=0 || priceMenu <= 0){
            throw new IllegalArgumentException();
        }
        this.currentNumberGuests = currentNumberGuests;
        this.priceMenu = priceMenu;
    }





}

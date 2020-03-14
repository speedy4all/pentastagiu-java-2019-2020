package com.pentalog.pentastagiu.homework3.App2;

public class Restaurant {
    private int numberOfGuests;
    private double income;
    final double PRICE_PER_MENU = 33.5;

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getPricePerMenu() {
        return PRICE_PER_MENU;
    }

    public double calculateNewIncome (int numberOfNewGuests){
        numberOfGuests += numberOfNewGuests;
        income += numberOfNewGuests * PRICE_PER_MENU;
        return income;
    }
}

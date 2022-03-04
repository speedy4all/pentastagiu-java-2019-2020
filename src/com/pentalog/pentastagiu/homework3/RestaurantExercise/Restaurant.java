package com.pentalog.pentastagiu.homework3.RestaurantExercise;

public abstract class Restaurant {
    private int numberOfGuests;
    private int income;
    private int priceOfMenu;
    private double tax=0.2;

    public abstract double getTax();

    public  void newGuest()
    {
        this.numberOfGuests=numberOfGuests++;
        this.income+=priceOfMenu;
    }


    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getPriceOfMenu() {
        return priceOfMenu;
    }

    public void setPriceOfMenu(int priceOfMenu) {
        this.priceOfMenu = priceOfMenu;
    }
}

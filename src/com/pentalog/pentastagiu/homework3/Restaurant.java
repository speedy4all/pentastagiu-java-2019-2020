package com.pentalog.pentastagiu.homework3;

public abstract class Restaurant {
    private int guestsNo;
    private double income;
    private String restaurantType;

    public Restaurant(String restaurantType) {
        this.guestsNo = 0;
        this.income = 0;
        this.restaurantType = restaurantType;
    }

    public double getIncome() {
        return income;
    }

    public int getGuestsNo() {
        return guestsNo;
    }

    public void setGuestsNo(int guestsNo) {
        this.guestsNo = guestsNo;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public abstract double calculateIncomeTax();


}

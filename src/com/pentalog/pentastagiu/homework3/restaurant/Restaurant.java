package com.pentalog.pentastagiu.homework3.restaurant;

public abstract class Restaurant {
    private int numberOfGuest = 0;
    private int income = 0;
    private int priceForFixedMenu;
    private int totalNumberOfGuest;

    public int getNumberOfGuest() {
        return numberOfGuest;
    }

    public void setNumberOfGuest(int numberOfGuest) {
        this.numberOfGuest = numberOfGuest;
    }

    public int getTotalNumberOfGuest() {
        return totalNumberOfGuest;
    }

    public int getPriceForFixedMenu() {
        return priceForFixedMenu;
    }

    public void setPriceForFixedMenu(int priceForFixedMenu) {
        this.priceForFixedMenu = priceForFixedMenu;
    }

    public int getIncome() {
        return income;
    }

    public Restaurant(int priceForFixedMenu) {
        this.priceForFixedMenu = priceForFixedMenu;
    }

    public void accommodateGuest(int numberOfGuest) {
        totalNumberOfGuest = totalNumberOfGuest + numberOfGuest;
        income=priceForFixedMenu*totalNumberOfGuest;
    }

    public abstract void calculateIncomeAndTaxes();

}

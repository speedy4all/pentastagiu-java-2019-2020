package com.pentalog.pentastagiu.homework3.problem2;

public  class Restaurant {
    protected int currentNumberGuests;
    protected double income;
    protected double priceMenu;

    Restaurant(int currentNumberGuests, double priceMenu){
        this.currentNumberGuests = currentNumberGuests;
        this.priceMenu = priceMenu;
    }

    public int getCurrentNumberGuests() {
        return currentNumberGuests;
    }

    public void setCurrentNumberGuests(int currentNumberGuests) {
        this.currentNumberGuests = currentNumberGuests;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getPriceMenu() {
        return priceMenu;
    }

    public void setPriceMenu(double priceMenu) {
        this.priceMenu = priceMenu;
    }



}

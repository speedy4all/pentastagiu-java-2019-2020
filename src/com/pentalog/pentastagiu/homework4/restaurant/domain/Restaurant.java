package com.pentalog.pentastagiu.homework4.restaurant.domain;

public class Restaurant {
    private int numberOfGuests;
    private int income;
    private int menuPrice;
    private boolean healthyFood;
    private String Name;

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public int setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
        return numberOfGuests;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public boolean isHealthyFood() {
        return healthyFood;
    }

    public void setHealthyFood(boolean healthyFood) {
        this.healthyFood = healthyFood;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Restaurant " + Name +
                " has a menu of " + menuPrice + "$" +
                ", " + numberOfGuests + " guests, "+
                "an income of " + income + ".\n But does it have healthy food ?" +
                "\n Answer: " + healthyFood;
    }
}

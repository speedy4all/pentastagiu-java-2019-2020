package com.pentalog.pentastagiu.homework3.exercise2;

public abstract class Restaurant {
    public final static double TAX = 0.2;
    private int numberOfGuests = 0;
    private double income = 0;
    private double menuPrice;

    public Restaurant(double menuPrice) {
        this.menuPrice = menuPrice > 0 ? menuPrice : 0;
    }

    public void welcomeGuests(int amount) {
        if (amount > 0) {
            numberOfGuests += amount;
            income = menuPrice * amount;
            System.out.println(amount + " person(s) arrived at the restaurant");
            System.out.println("The guest(s) ordered " + amount + " fixed menus");
        }
    }

    public abstract double calculateTax();

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public double getIncome() {
        return income;
    }

    public double getMenuPrice() {
        return menuPrice;
    }
}

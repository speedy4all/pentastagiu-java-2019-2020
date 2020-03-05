package com.pentalog.pentastagiu.homework.module1.week4.pb2;

public abstract class Restaurant {

    final int TAXES_PERCENTAGE = 20;

    protected double income = 0;
    private double menuPrice;
    private int currentNumberOfGuests = 0;

    public Restaurant(double menuPrice) {
        this.menuPrice = menuPrice;
    }

    public void newGuests(int numberOfNewGuests)
    {
        currentNumberOfGuests += numberOfNewGuests;
        income += numberOfNewGuests*menuPrice;
    }

    protected abstract double calculateTaxes();
}

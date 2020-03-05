package com.pentalog.pentastagiu.homework.module1.week4.pb2;

public class Vegetarian extends Restaurant {
    protected static int discountPercentage = 0;

    public Vegetarian(double menuPrice) {
        super(menuPrice);
    }

    @Override
    protected double calculateTaxes() {
        return income * (TAXES_PERCENTAGE*(100d-discountPercentage)/100) / 100;
    }

    public static void setDiscountPercentage(int discountPercentage) {
        Vegetarian.discountPercentage = discountPercentage;
    }
}

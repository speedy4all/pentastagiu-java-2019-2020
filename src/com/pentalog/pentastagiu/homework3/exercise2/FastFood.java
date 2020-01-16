package com.pentalog.pentastagiu.homework3.exercise2;

public class FastFood extends Restaurant {

    public FastFood(double menuPrice) {
        super(menuPrice);
    }

    @Override
    public double calculateTax() {
        return getIncome() * TAX;
    }
}

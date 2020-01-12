package com.pentalog.pentastagiu.homework3.exercise2;

public class VegetarianRestaurant extends Restaurant {
    private final static double HEALTHY_TAX_DISCOUNT = 0.3;

    public VegetarianRestaurant(double menuPrice) {
        super(menuPrice);
    }

    @Override
    public double calculateTax() {
        double tax = getIncome() * TAX;
        double discount = tax * HEALTHY_TAX_DISCOUNT;
        return tax - discount;
    }
}

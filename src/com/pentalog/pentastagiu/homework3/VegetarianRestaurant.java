package com.pentalog.pentastagiu.homework3;

import java.text.DecimalFormat;

public class VegetarianRestaurant extends Restaurant {
    private double menuPrice;

    public VegetarianRestaurant(String restaurantType, double menuPrice) {
        super(restaurantType);
        this.menuPrice = menuPrice;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    @Override
    public double calculateIncomeTax() {
        DecimalFormat df = new DecimalFormat("#.##");

        double taxWithoutDiscount = (20*getIncome())/100;
        double finalTax = taxWithoutDiscount - ((30*taxWithoutDiscount)/100);

        return Double.parseDouble(df.format(finalTax));
    }
}

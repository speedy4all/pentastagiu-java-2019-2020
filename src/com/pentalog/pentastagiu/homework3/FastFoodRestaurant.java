package com.pentalog.pentastagiu.homework3;

import java.text.DecimalFormat;

public class FastFoodRestaurant extends Restaurant {
    private double menuPrice;

    public FastFoodRestaurant(String restaurantType, double menuPrice) {
        super(restaurantType);
        this.menuPrice = menuPrice;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    @Override
    public double calculateIncomeTax() {
        DecimalFormat df = new DecimalFormat("#.##");

        return Double.parseDouble(df.format((20*getIncome())/100));
    }
}

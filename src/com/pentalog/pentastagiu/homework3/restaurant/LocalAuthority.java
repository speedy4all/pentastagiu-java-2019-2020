package com.pentalog.pentastagiu.homework3.restaurant;

import com.pentalog.pentastagiu.homework3.restaurant.Restaurant;

public class LocalAuthority {
    private double incomeTaxPercentage;

    public LocalAuthority(double incomeTaxPercentage) {
        this.incomeTaxPercentage = incomeTaxPercentage;
    }

    public double calculateTax(Object obj) {
        double tax = 0;
        if (obj instanceof Restaurant) {
            Restaurant restaurant = (Restaurant) obj;
            tax = (restaurant.getIncome() * incomeTaxPercentage / 100) * (100 - restaurant.getRestaurantType().getDiscountPercentage())/100;
        }
        return tax;
    }
}

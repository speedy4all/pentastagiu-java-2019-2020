package com.pentalog.pentastagiu.homework3.restaurants.impl;

import com.pentalog.pentastagiu.homework3.restaurants.Restaurant;

import static com.pentalog.pentastagiu.homework3.HomeworkApp.TAXPERCENT;

public class VeganRestaurant extends Restaurant {

    public VeganRestaurant(String name, double taxDiscount) {
        super(name, taxDiscount);
    }

    @Override
    public double payTaxesIncome() {
        double taxDiscount = getTaxDiscount();
        double income = getIncome();
        return income - (income * TAXPERCENT / 100 -  income * TAXPERCENT / 100 * taxDiscount);
    }
}

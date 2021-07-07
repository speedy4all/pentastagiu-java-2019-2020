package com.pentalog.pentastagiu.homework3.restaurant;

public class FastFoodRestaurant extends Restaurant {


    public FastFoodRestaurant(int priceForFixedMenu) {
        super(priceForFixedMenu);
    }

    @Override
    public void calculateIncomeAndTaxes() {
        System.out.println("Income are " + (getIncome()*0.8));
        System.out.println("Taxes are " +(getIncome()*0.2));
    }
}

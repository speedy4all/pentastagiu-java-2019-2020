package com.pentalog.pentastagiu.homework3.restaurant;

public class VegetarianRestaurant extends Restaurant {


    public VegetarianRestaurant(int priceForFixedMenu) {
        super(priceForFixedMenu);
    }

    @Override
    public void calculateIncomeAndTaxes() {
        double interIncome=getIncome()*0.8;
        double interTaxes=getIncome()*0.2;
        double refund =interTaxes*0.3;
        double finalIncome=interIncome+refund;
        double finalTaxes=interTaxes-refund;
        System.out.println("Income are " + finalIncome);
        System.out.println("Taxes are " +finalTaxes);
    }
}

package com.pentalog.pentastagiu.homework3.problem2;

public class FastFoodRestaurant extends Restaurant implements ManageRestaurant{

    public FastFoodRestaurant(int numberOfGuests, double priceMenu){
        super(numberOfGuests, priceMenu);
    }

    @Override
    public void accommodateGuests(int newGuests) {
        currentNumberGuests = currentNumberGuests + newGuests;
        income = currentNumberGuests * priceMenu;
        System.out.println("The income for FAST FOOD restaurant is:" + income);
    }

    @Override
    public void calculateTaxes() {
        double taxesToPay = (income * 20)/100;
        System.out.println("Taxes to pay for FAST FOOD restaurant: " + taxesToPay);
    }
}

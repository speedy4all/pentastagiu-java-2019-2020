package com.pentalog.pentastagiu.homework3.problem2;

public class VegetarianRestaurant extends Restaurant implements ManageRestaurant {

    public VegetarianRestaurant(int numberOfGuests, double priceMenu){
        super(numberOfGuests, priceMenu);
    }

    @Override
    public void accommodateGuests(int newGuest) {
        currentNumberGuests = currentNumberGuests + newGuest;
        income = currentNumberGuests * priceMenu;
        System.out.println("The income for VEGETARIAN restaurant is: " + income);

    }

    @Override
    public void calculateTaxes() {
        double taxesToPay = (income * 20) / 100 ;
        double discountTaxes = (30 * taxesToPay)/100;
        System.out.println("Taxes to pay for VEGETARIAN restaurant : " + (taxesToPay - discountTaxes));


    }
}


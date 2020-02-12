package com.pentalog.pentastagiu.homework4.restaurants;

public class VegetarianRestaurant extends Restaurants{
    VegetarianRestaurant(int guests, float income, float priceForMenu) {
        super(guests, income, priceForMenu);
    }

    @Override
    public float calculateTax() {
        return super.calculateTax()*70/100;
    }
}

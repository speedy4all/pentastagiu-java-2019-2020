package com.pentalog.pentastagiu.week4.homework3.RestaurantApp;

public class RestaurantApp {

    public static void main(String[] args) {

        VegetarianRestaurant vegRestaurant1 = new VegetarianRestaurant(30, 5);
        FastFood fastFood1 = new FastFood(100, 28);


        System.out.println("Taxes due for this vegetarian restaurant are:" + vegRestaurant1.calculateTaxes());

        System.out.println("Taxes due for this fast-food restaurant are:" + fastFood1.calculateTaxes());
    }


}
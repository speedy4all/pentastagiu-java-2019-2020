package com.pentalog.pentastagiu.homework3.problem2;

public class MainApp {
    public static void main(String[] args) {

        FastFoodRestaurant fastFoodRestaurant = new FastFoodRestaurant(3, 10);
        fastFoodRestaurant.accommodateGuests(2);
        fastFoodRestaurant.calculateTaxes();

        System.out.println("-------------------------------");

        VegetarianRestaurant vegetarianRestaurant = new VegetarianRestaurant(2, 20);
        vegetarianRestaurant.accommodateGuests(3);
        vegetarianRestaurant.calculateTaxes();


    }
}

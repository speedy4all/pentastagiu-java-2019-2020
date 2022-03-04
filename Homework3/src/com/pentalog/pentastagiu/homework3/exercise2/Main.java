package com.pentalog.pentastagiu.homework3.exercise2;

public class Main {
    public static void main(String[] args) {
        FastFoodRestaurant fastFoodRestaurant = new FastFoodRestaurant();
        fastFoodRestaurant.accomodateGuests(50);
        fastFoodRestaurant.calculateTax();
        VegetarianRestaurant vegetarianRestaurant = new VegetarianRestaurant();
        vegetarianRestaurant.accomodateGuests(50);
        vegetarianRestaurant.calculateTax();
    }
}

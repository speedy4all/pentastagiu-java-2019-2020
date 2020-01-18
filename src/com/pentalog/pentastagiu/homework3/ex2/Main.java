package com.pentalog.pentastagiu.homework3.ex2;

public class Main {

    public static void main(String[] args) {
        VegetarianRestaurant vegetarianRestaurant= new VegetarianRestaurant();
        vegetarianRestaurant.accomodateNewGuests(25);
        vegetarianRestaurant.calculateTax();
        FastFoodRestaurant fastFoodRestaurant=new FastFoodRestaurant();
        fastFoodRestaurant.accomodateNewGuests(25);
        fastFoodRestaurant.calculateTax();

    }
}

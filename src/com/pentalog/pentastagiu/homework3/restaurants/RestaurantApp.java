package com.pentalog.pentastagiu.homework3.restaurants;

public class RestaurantApp {
    public static void main(String[] args) {
        FastFoodRestaurant fastFood1 = new FastFoodRestaurant(20, 100, 10);
        VegetarianRestaurant vegetarianRestaurant1 = new VegetarianRestaurant(20, 100, 10);

        vegetarianRestaurant1.addGuest("ion");
        vegetarianRestaurant1.addGuest("Emil");
        System.out.println("People in Vegetarian Restaurant: " + vegetarianRestaurant1.getGuests());

        fastFood1.addGuest("Vasile");
        fastFood1.addGuest("Maria");
        System.out.println("People in Fast Food Restaurant: " + fastFood1.getGuests());


        System.out.println("The income of vegetarian Restaurant: " + vegetarianRestaurant1.calculateIncome());
        System.out.println("The Tax of vegetarian Restaurant: " + vegetarianRestaurant1.calculateTax());
        System.out.println("The income of Fast Food Restaurant: " + fastFood1.calculateIncome());
        System.out.println("The Tax of Fast Food Restaurant: " + fastFood1.calculateTax());
    }
}

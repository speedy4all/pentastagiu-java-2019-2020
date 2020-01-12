package com.pentalog.pentastagiu.homework4.ex2;

public class Program {

    public static void main(String[] args) {
        Restaurant restaurantVegetarian = new Restaurant(RestaurantType.Vegetarian, 150);
        Restaurant restaurantFastFood = new Restaurant(RestaurantType.FastFood, 150);

        restaurantVegetarian.addNewGuest();
        restaurantVegetarian.addNewGuest();
        restaurantVegetarian.addNewGuest();
        restaurantVegetarian.addNewGuest();

        restaurantFastFood.addNewGuest();
        restaurantFastFood.addNewGuest();
        restaurantFastFood.addNewGuest();
        restaurantFastFood.addNewGuest();


        restaurantVegetarian.getInfo();
        restaurantFastFood.getInfo();
    }
}


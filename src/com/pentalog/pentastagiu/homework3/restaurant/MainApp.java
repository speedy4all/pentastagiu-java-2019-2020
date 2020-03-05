
//Create a console application that works with restaurants
//Each restaurant will have info about the current number of guests, the  income, the price for a fixed menu
//Each restaurant will have a method that accommodates new guest in which the number of current guests has to increase with the number of new guests and the income also will increase accordingly(each new guest will consume a fixed price menu).
//We will also have the option of calculating the taxes that each restaurant has to pay to the local authorities, but each restaurant will have a different way of calculating this
//Let's consider that we will have 2 types of restaurants: vegetarian restaurant and fast food restaurant.
// Each restaurant will have to pay taxes to the local authorities, which represent 20% of their income. Also the local authorities from the town where we have restaurants,
// that want to encourage a healthy life, decided that the vegetarian restaurant will receive a discount of 30% for the taxation.
//Implement for each restaurant a method that calculates the tax that it has to pay.

package com.pentalog.pentastagiu.homework3.restaurant;

public class MainApp {
    public static void main(String[] args) {
        FastFoodRestaurant fast1=new FastFoodRestaurant(10);
        fast1.accommodateGuest(5);
        System.out.println("FastFood Restaurant");
        System.out.println(fast1.getTotalNumberOfGuest());
        fast1.calculateIncomeAndTaxes();

        VegetarianRestaurant veg1=new VegetarianRestaurant(10);
        veg1.accommodateGuest(5);
        System.out.println("Vegetarian Restaurant");
        System.out.println(veg1.getTotalNumberOfGuest());
        veg1.calculateIncomeAndTaxes();

    }
}

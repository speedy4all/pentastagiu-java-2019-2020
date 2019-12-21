package com.pentalog.pentastagiu.homework3.restaurant;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Restaurant implements RestaurantInterface {
    private int currentGuests;
    private double income;
    private double menuPrice;

    public Restaurant(int currentGuests, double menuPrice) {
        this.currentGuests = currentGuests;
        this.income = currentGuests * menuPrice;
        this.menuPrice = menuPrice;
        System.out.println("----Start constructor----");
        System.out.println("Now in restaurant you have " + currentGuests + " customers and your income is " +
                income + "$");
        System.out.println("----End of constructor----");
    }

    @Override
    public void newCustomers(int customers) {
        currentGuests += customers;
        System.out.println("In your restaurant there are now " + currentGuests + " customers");
        income = menuPrice * currentGuests;
        System.out.println("Your income is now " + income + "$");
    }

    @Override
    public double taxesToPay() {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".##");
        System.out.println("------------------------------------------------");
        System.out.println("Select your restaurant type to calculate taxes: ");
        System.out.println("1. Vegetarian Restaurant");
        System.out.println("2. Fast Food Restaurant");

        int restaurantType = sc.nextInt();
        double taxes = (20 * income) / 100;

        switch (restaurantType){
            case 1:
                double taxesWithDiscount = taxes - ((30 * taxes) / 100);
                System.out.println("Taxes to pay for a vegetarian restaurant: " + df.format(taxesWithDiscount) + "$");
                break;
            case 2:
                System.out.println("Taxes to pay for fast-food restaurant: " + df.format(taxes) + "$");
                break;
            default:
                System.out.println("Not a valid restaurant type");
                break;
        }
        System.out.println("------------------------------------------------");
        return taxes;
    }
}

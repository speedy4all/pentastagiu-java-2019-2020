package com.pentalog.pentastagiu.homework4.ex2;

public class Restaurant {
    private RestaurantType restaurantType;
    private int numberOfGuests;
    private double income;
    private double menuPrice;

    public Restaurant(RestaurantType restaurantType, double menuPrice) {
        super();
        this.restaurantType = restaurantType;
        this.menuPrice = menuPrice;
    }

    public void addNewGuest() {
        this.numberOfGuests++;
        this.income += this.menuPrice;
    }

    public double calculateTaxes() {
        double taxes = 0;

        if(this.restaurantType == RestaurantType.FastFood) {
            taxes = this.income * 0.2;
        }

        if(this.restaurantType == RestaurantType.Vegetarian) {
            taxes = this.income * 0.14;
        }

        return taxes;
    }


    public void getInfo() {
        System.out.println("Restaurant type = " + this.restaurantType + "; taxes = " + calculateTaxes());
    }

}


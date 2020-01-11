package com.pentalog.pentastagiu.homework3.restaurant;

public enum RestaurantType {
    FAST_FOOD(0), VEGETARIAN(30);

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    private int discountPercentage;

    private RestaurantType(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

}


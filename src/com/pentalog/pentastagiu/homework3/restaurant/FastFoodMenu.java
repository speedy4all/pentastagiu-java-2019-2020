package com.pentalog.pentastagiu.homework3.restaurant;

public enum FastFoodMenu {

    CHICKEN_SANDWICH(15.00),
    SOUP_CHICKEN(18.00),
    NOODLES(17.00),
    CHEESBURGER(14.00),
    PIZZA_BACON_CHEESE(22.00),
    HOT_DOG(11.00),
    CRISPY_STRIPS(16.00),
    KEBAB(20.00);


    private Double menuPrice;

    private FastFoodMenu(Double menuPrice) {
        this.menuPrice = menuPrice;
    }

    public Double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Double menuPrice) {
        this.menuPrice = menuPrice;
    }


}

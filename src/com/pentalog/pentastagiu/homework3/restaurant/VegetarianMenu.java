package com.pentalog.pentastagiu.homework3.restaurant;

public enum VegetarianMenu {
    VEGETARIAN_PIZZA(25.00),
    ORIENTAL_SALAD(25.00),
    FRIED_RICE_WITH_VEGETABLES(18.00),
    AUTUMN_SALAD(16.00),
    TOMATO_SOUP(17.00),
    STRAWBERRY_CAKE(13.00),
    BEET_MUSHROOM_AVOCADO_SALAD(15.00),
    VEGETABLE_LASAGNA(23.00);



    private Double menuPrice;

    private VegetarianMenu(Double menuPrice) {
        this.menuPrice=menuPrice;
    }

    public Double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Double menuPrice) {
        this.menuPrice = menuPrice;
    }

}

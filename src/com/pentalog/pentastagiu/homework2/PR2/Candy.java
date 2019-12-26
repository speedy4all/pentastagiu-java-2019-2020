package com.pentalog.pentastagiu.homework2.PR2;




public class Candy extends Product {

    int quantityGrams;
    int calories;
    public Candy(int id, String name, int price,int quantity,int quantityGrams,int calories) {
        super(id, name, price,quantity);
        this.quantityGrams=quantityGrams;
        this.calories=calories;
    }

    public String moreDetails() {
        return "Quantity in grams " + quantityGrams + "\nNo. of calories " + calories;
    }

    @Override
    public String toString() {
        return "#" + id + "- " + name + " at the price of " + price + " lei. Available items: " + quantity;

    }

}

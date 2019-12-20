package com.pentalog.pentastagiu.homework2.shopApp;

public class Product {


    private static int id = 0;
    private String name;
    private double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;

        id++;
    }

    public static int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +

                '}';
    }
}

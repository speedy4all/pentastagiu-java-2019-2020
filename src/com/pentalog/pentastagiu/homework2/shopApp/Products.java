package com.pentalog.pentastagiu.homework2.shopApp;

public class Products {
	

    private static int id = 0;
    private String name;
    private double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
        id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Products.id = id;
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

}

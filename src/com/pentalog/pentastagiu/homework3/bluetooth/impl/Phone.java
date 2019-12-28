package com.pentalog.pentastagiu.homework3.bluetooth.impl;

import com.pentalog.pentastagiu.homework3.bluetooth.Connectable;

public class Phone implements Connectable {
    private String brand;
    private double price;

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void connectToBlueTooth() {
        System.out.println("The phone "+brand+" has connected");
    }
}

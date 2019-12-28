package com.pentalog.pentastagiu.homework3.bluetooth.impl;

import com.pentalog.pentastagiu.homework3.bluetooth.Connectable;

public class SmartRefrigerator implements Connectable {
    private String id;
    private double price;

    public SmartRefrigerator(String id, double price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartRefrigerator{" +
                "id='" + id + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public void connectToBlueTooth() {
        System.out.println("The refrigerator "+id+" has connected");
    }
}

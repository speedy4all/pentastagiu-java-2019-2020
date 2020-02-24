package com.pentalog.pentastagiu.homework3.bluetooth.impl;

import com.pentalog.pentastagiu.homework3.bluetooth.Connectable;

public class Car implements Connectable {
    private String brand;
    private int maxHP;

    public Car(String brand, int maxHP) {
        this.brand = brand;
        this.maxHP = maxHP;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxHP=" + maxHP +
                '}';
    }

    @Override
    public void connectToBlueTooth() {
        System.out.println("Masina "+brand +" s-a conectat");
    }
}

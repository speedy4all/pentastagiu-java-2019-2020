package com.pentalog.pentastagiu.homework3.ex3_bluethooth;

public class Phone implements Connectable {
    private String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Phone " + this.brand + ": connect to bluetooth in progress..");
    }
}

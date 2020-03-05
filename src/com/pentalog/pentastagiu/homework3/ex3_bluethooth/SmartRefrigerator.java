package com.pentalog.pentastagiu.homework3.ex3_bluethooth;

public class SmartRefrigerator implements Connectable{
    private String brand;

    public SmartRefrigerator(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "SmartRefrigerator{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Smart Refrigerator " + this.brand + ": connect to bluetooth in progress..");
    }
}

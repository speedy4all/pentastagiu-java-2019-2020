package com.pentalog.pentastagiu.homework3.ex3_bluethooth;

public class Car implements Connectable {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Car " + this.brand + ": connect to bluetooth in progress..");
    }
}

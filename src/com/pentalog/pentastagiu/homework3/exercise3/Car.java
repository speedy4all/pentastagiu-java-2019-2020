package com.pentalog.pentastagiu.homework3.exercise3;

public class Car implements Connectable{
    private String brand;
    private int maxSpeed;
    private int wheels = 4;
    private String color;

    public Car(String brand, int maxSpeed, String color) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + getName());
    }

    @Override
    public String getName() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

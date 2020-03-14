package com.pentalog.pentastagiu.homework3.App3;

public class SmartRefrigerator implements IConnectable {
    private String brand;
    private int numberOfDoors;
    private String color;
    private double capacity;

    public SmartRefrigerator(String brand, int numberOfDoors, String color, double capacity) {
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
        this.color = color;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress ... " + getClass().getSimpleName());
    }
}

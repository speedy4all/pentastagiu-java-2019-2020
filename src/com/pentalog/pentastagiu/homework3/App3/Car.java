package com.pentalog.pentastagiu.homework3.App3;

public class Car implements IConnectable{
    private String brand;
    private String model;
    private double fuelConsumption;
    private int yearOfProduction;
    private int maximumSpeed;

    public Car(String brand, String model, double fuelConsumption, int yearOfProduction, int maximumSpeed) {
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.yearOfProduction = yearOfProduction;
        this.maximumSpeed = maximumSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return fuelConsumption;
    }

    public void setPower(double power) {
        this.fuelConsumption = power;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress ... " + getClass().getSimpleName());
    }
}
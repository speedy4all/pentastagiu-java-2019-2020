package com.pentalog.pentastagiu.homework3.exercise3;

public class SmartRefrigerator implements Connectable {
    private String brand;
    private String color;
    private int volume;
    private String energyClass;

    public SmartRefrigerator(String brand, String color, int volume, String energyClass) {
        this.brand = brand;
        this.color = color;
        this.volume = volume;
        this.energyClass = energyClass;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + getName());
    }

    @Override
    public String getName() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getVolume() {
        return volume;
    }

    public String getEnergyClass() {
        return energyClass;
    }
}

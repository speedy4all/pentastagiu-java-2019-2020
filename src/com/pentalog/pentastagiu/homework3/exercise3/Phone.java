package com.pentalog.pentastagiu.homework3.exercise3;

public class Phone implements Connectable{
    private String name;
    private int battery;
    private String osVersion;
    private double memorySize;

    public Phone(String name, int battery, String osVersion, double memorySize) {
        this.battery = battery;
        this.osVersion = osVersion;
        this.memorySize = memorySize;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + getName());
    }

    @Override
    public String getName() {
        return name;
    }

    public int getBattery() {
        return battery;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public double getMemorySize() {
        return memorySize;
    }
}

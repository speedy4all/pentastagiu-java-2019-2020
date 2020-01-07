package com.pentalog.pentastagiu.homework3.bluetooth.application;

public class SmartRefrigerator implements Connectable {

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SmartRefrigerator(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + "Smart Refrigerator " + getName());
    }
}

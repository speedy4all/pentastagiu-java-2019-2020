package com.pentalog.pentastagiu.homework3.bluetooth.application;

public class Car implements Connectable {

    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + "Car " + getName());
    }
}

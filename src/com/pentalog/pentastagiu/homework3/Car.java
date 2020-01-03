package com.pentalog.pentastagiu.homework3;

public class Car implements Connectable{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..."+name);
    }
}

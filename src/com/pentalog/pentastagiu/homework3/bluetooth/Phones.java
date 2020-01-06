package com.pentalog.pentastagiu.homework3.bluetooth;

public class Phones implements Connectable {
    private String brand;

    public Phones(String brand) {
        this.brand = brand;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress... " + brand);
    }
}

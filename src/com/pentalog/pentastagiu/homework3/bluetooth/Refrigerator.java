package com.pentalog.pentastagiu.homework3.bluetooth;

public abstract class Refrigerator implements Connectable {
    private String model;

    public Refrigerator(String model) {
        this.model = model;
    }

    @Override
    public void connectToBluetooth() {
        System.out.printf("%s is connecting to bluetooth...\n", model);
    }
}

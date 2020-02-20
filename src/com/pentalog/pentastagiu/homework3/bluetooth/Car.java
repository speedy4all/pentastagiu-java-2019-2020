package com.pentalog.pentastagiu.homework3.bluetooth;

public abstract class Car implements Connectable {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void connectToBluetooth() {
        System.out.printf("%s is connecting to bluetooth...\n", model);
    }
}

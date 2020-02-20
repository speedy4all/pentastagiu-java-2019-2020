package com.pentalog.pentastagiu.homework3.bluetooth;

public abstract class Phone implements Connectable {
    private String model;

    public Phone(String model) {
        this.model = model;
    }

    @Override
    public void connectToBluetooth() {
        System.out.printf("%s is connecting to bluetooth...\n", model);
    }
}

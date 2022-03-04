package com.pentalog.pentastagiu.week4.homework3.BluetoothApp;

public class Phones extends Device implements Conectable {
    private double androidVersion;
    private double processorGhz;

    public Phones(String nameOfDevice) {
        super(nameOfDevice);
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...."+nameOfDevice);
    }
}

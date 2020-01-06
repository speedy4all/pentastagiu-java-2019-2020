package com.pentalog.pentastagiu.week4.homework3.BluetoothApp;

public class SmartRefrigerator extends Device implements Conectable {
    private double refrigeratorCapacity;

    public SmartRefrigerator(String nameOfDevice) {
        super(nameOfDevice);
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...."+nameOfDevice);
    }
}

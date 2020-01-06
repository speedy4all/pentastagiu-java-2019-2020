package com.pentalog.pentastagiu.week4.homework3.BluetoothApp;

public class Cars extends Device implements Conectable {
    private int motorCapacity;
    private int horsePower;

    public Cars(String nameOfDevice) {
        super(nameOfDevice);
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...."+nameOfDevice);
    }
}

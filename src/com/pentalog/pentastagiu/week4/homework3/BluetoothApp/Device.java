package com.pentalog.pentastagiu.week4.homework3.BluetoothApp;

public class Device implements Conectable{
    public String nameOfDevice;

    @Override
    public void connectToBluetooth() {

    }

    public Device(String nameOfDevice) {
        this.nameOfDevice = nameOfDevice;
    }
}

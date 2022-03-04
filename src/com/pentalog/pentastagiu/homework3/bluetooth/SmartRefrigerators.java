package com.pentalog.pentastagiu.homework3.bluetooth;

public class SmartRefrigerators implements Connectable {
    private String manufacturer;

    public SmartRefrigerators(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress... " + manufacturer);
    }
}

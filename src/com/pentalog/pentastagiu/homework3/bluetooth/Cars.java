package com.pentalog.pentastagiu.homework3.bluetooth;

public class Cars implements Connectable {
    private String brand;
    private String fuel;

    public Cars(String brand, String fuel) {
        this.brand = brand;
        this.fuel = fuel;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + brand);
    }
}

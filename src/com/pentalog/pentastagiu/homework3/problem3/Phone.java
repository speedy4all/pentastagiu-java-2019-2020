package com.pentalog.pentastagiu.homework3.problem3;

public class Phone implements Connectable {
    private double displaySize;
    private int storageMemory;

//    public Phone(double displaySize, int storageMemory){
//        this.displaySize = displaySize;
//        this.storageMemory = storageMemory;
//    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress...Phone");

    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public int getStorageMemory() {
        return storageMemory;
    }

    public void setStorageMemory(int storageMemory) {
        this.storageMemory = storageMemory;
    }

}

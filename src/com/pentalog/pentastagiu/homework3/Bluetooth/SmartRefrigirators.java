package com.pentalog.pentastagiu.homework3.Bluetooth;

public class SmartRefrigirators implements BluetoothConnectable {
    private String NameOfRefrigirator;
    private int SpaceOfStorage;
    private int NumberOfShelves;

    public SmartRefrigirators(String nameOfRefrigirator, int spaceOfStorage, int numberOfShelves) {
        NameOfRefrigirator = nameOfRefrigirator;
        SpaceOfStorage = spaceOfStorage;
        NumberOfShelves = numberOfShelves;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress "+ NameOfRefrigirator);

    }

    public String getNameOfRefrigirator() {
        return NameOfRefrigirator;
    }

    public void setNameOfRefrigirator(String nameOfRefrigirator) {
        NameOfRefrigirator = nameOfRefrigirator;
    }

    public int getSpaceOfStorage() {
        return SpaceOfStorage;
    }

    public void setSpaceOfStorage(int spaceOfStorage) {
        SpaceOfStorage = spaceOfStorage;
    }

    public int getNumberOfShelves() {
        return NumberOfShelves;
    }

    public void setNumberOfShelves(int numberOfShelves) {
        NumberOfShelves = numberOfShelves;
    }
}

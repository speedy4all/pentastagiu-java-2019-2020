package com.pentalog.pentastagiu.homework3.App3;

public class Phone implements IConnectable{
    private String name;
    private String operatingSystem;
    private double internalStorageGB;
    private double displaySizeInch;

    public Phone(String name, String operatingSystem, double internalStorageGB, double displaySizeInch) {
        this.name = name;
        this.operatingSystem = operatingSystem;
        this.internalStorageGB = internalStorageGB;
        this.displaySizeInch = displaySizeInch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getInternalStorageGB() {
        return internalStorageGB;
    }

    public void setInternalStorageGB(double internalStorageGB) {
        this.internalStorageGB = internalStorageGB;
    }

    public double getDisplaySizeInch() {
        return displaySizeInch;
    }

    public void setDisplaySizeInch(double displaySizeInch) {
        this.displaySizeInch = displaySizeInch;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress ... " + getClass().getSimpleName());
    }
}

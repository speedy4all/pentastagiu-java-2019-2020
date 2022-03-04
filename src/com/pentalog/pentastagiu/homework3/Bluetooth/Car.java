package com.pentalog.pentastagiu.homework3.Bluetooth;

public class Car implements BluetoothConnectable {
    private String NameOfCar;
    private int YearOfFabrication;
    private int mileage;

    public Car(String nameOfCar, int yearOfFabrication, int mileage) {
        NameOfCar = nameOfCar;
        YearOfFabrication = yearOfFabrication;
        this.mileage = mileage;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress "+ NameOfCar);

    }

    public String getNameOfCar() {
        return NameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        NameOfCar = nameOfCar;
    }

    public int getYearOfFabrication() {
        return YearOfFabrication;
    }

    public void setYearOfFabrication(int yearOfFabrication) {
        YearOfFabrication = yearOfFabrication;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

package com.pentalog.pentastagiu.homework4.bluetooth.domain;

public class Phones extends Items{
    private String manufacturer;
    private String model;
    private String color;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone: \n" +
                "ID: " + super.getId() + '\n' +
                "Manufacturer: " + manufacturer + '\n' +
                "Model: " + model + '\n' +
                "Color: " + color + '\n' +
                "Has a bluetooth connection?"+ '\n' +
                "Answer: " + super.isBluetoothConnection() + '\n';
    }
}

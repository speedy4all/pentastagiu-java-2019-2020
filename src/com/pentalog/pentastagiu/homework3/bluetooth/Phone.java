package com.pentalog.pentastagiu.homework3.bluetooth;

public class Phone implements ConnectableInterface {
    private Integer id;
    private String brand;
    private String model;
    private String color;
    private Double price;


    public Phone(Integer id, String brand, String model, String color, Double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress for " + brand + " " + model);
    }

    //getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
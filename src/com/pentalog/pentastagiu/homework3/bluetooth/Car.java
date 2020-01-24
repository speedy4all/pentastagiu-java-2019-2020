package com.pentalog.pentastagiu.homework3.bluetooth;

public class Car implements ConnectableInterface{

    private Integer id;
    private String brand;
    private String model;
    private Double price;
    private String color;

    //constructors
    public Car(Integer id, String brand, String model, Double price,
                String color) {
        super();
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress for " + brand+ " " + model);
    }

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


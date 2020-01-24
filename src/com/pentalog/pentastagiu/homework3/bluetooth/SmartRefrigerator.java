package com.pentalog.pentastagiu.homework3.bluetooth;

public class SmartRefrigerator implements ConnectableInterface{

    private Integer id;
    private String brand;
    private String model;
    private Double netVolumeRefrigerator;
    private Double netVolumeFreezer;


    public SmartRefrigerator(Integer id, String brand, String model, Double netVolumeRefrigerator, Double netVolumeFreezer) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.netVolumeRefrigerator = netVolumeRefrigerator;
        this.netVolumeFreezer = netVolumeFreezer;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress for " + brand+ " " + model);
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

    public Double getNetVolumeRefrigerator() {
        return netVolumeRefrigerator;
    }

    public void setNetVolumeRefrigerator(Double netVolumeRefrigerator) {
        this.netVolumeRefrigerator = netVolumeRefrigerator;
    }

    public Double getNetVolumeFreezer() {
        return netVolumeFreezer;
    }

    public void setNetVolumeFreezer(Double netVolumeFreezer) {
        this.netVolumeFreezer = netVolumeFreezer;
    }
}

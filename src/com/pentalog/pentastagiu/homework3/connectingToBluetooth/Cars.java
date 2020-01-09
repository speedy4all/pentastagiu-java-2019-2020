package com.pentalog.pentastagiu.homework3.connectingToBluetooth;

public class Cars implements ConnectableInterface{

    private Integer carId;
    private String carBrand;
    private String carModel;
    private Double carPrice;
    private Integer carProductionYear;
    private String carColor;
    private Double  fuelConsumption;
    private String fuelType;


    //constructors
    public Cars() {}

    public Cars(Integer carId, String carBrand, String carModel, Double carPrice, Integer carProductionYear,
                String carColor, Double fuelConsumption, String fuelType) {
        super();
        this.carId = carId;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.carProductionYear = carProductionYear;
        this.carColor = carColor;
        this.fuelConsumption = fuelConsumption;
        this.fuelType = fuelType;
    }


    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress for " + carBrand+ " " + carModel);
    }

    //getters and setters
    public Integer getCarId() {
        return carId;
    }
    public void setCarId(Integer carId) {
        this.carId = carId;
    }
    public String getCarBrand() {
        return carBrand;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public Double getCarPrice() {
        return carPrice;
    }
    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }
    public Integer getCarProductionYear() {
        return carProductionYear;
    }
    public void setCarProductionYear(Integer carProductionYear) {
        this.carProductionYear = carProductionYear;
    }
    public String getCarColor() {
        return carColor;
    }
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
    public Double getFuelConsumption() {
        return fuelConsumption;
    }
    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}


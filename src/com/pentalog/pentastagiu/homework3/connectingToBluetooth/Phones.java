package com.pentalog.pentastagiu.homework3.connectingToBluetooth;

public class Phones implements ConnectableInterface{
    private Integer phoneCode;
    private String phoneBrand;
    private String phoneModel;
    private String phoneColor;
    private Double phonePrice;
    private Double storage;
    private Double phoneCameraResolution;

    public Phones() {
    }

    public Phones(Integer phoneCode, String phoneBrand, String phoneModel, String phoneColor, Double phonePrice,
                  Double storage, Double phoneCameraResolution) {
        super();
        this.phoneCode = phoneCode;
        this.phoneBrand = phoneBrand;
        this.phoneModel = phoneModel;
        this.phoneColor = phoneColor;
        this.phonePrice = phonePrice;
        this.storage = storage;
        this.phoneCameraResolution = phoneCameraResolution;
    }


    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress for " +phoneBrand+ " " + phoneModel);
    }

    //getters and setters
    public String getPhoneBrand() {
        return phoneBrand;
    }
    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }
    public String getPhoneModel() {
        return phoneModel;
    }
    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }
    public String getPhoneColor() {
        return phoneColor;
    }
    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }
    public Double getPhonePrice() {
        return phonePrice;
    }
    public void setPhonePrice(Double phonePrice) {
        this.phonePrice = phonePrice;
    }
    public Double getStorage() {
        return storage;
    }
    public void setStorage(Double storage) {
        this.storage = storage;
    }
    public Double getPhoneCameraResolution() {
        return phoneCameraResolution;
    }
    public void setPhoneCameraResolution(Double phoneCameraResolution) {
        this.phoneCameraResolution = phoneCameraResolution;
    }

    public Integer getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(Integer phoneCode) {
        this.phoneCode = phoneCode;
    }

}

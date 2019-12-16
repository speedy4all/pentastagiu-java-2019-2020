package com.pentalog.pentastagiu.homework2;

public class Shop {

    private Integer shopId;
    private String nameShop;
    private String location;
    private String address;

    public Integer getShopId() {
        return shopId;
    }

    public String getNameShop() {
        return nameShop;
    }

    public String getLocation() {
        return location;
    }

    public String getAddress() {
        return address;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Shop(Integer shopId, String nameShop, String location, String address) {
        this.shopId = shopId;
        this.nameShop = nameShop;
        this.location = location;
        this.address = address;
    }
}

package com.pentalog.pentastagiu.homework2;

public class Product {

    private Integer productId;
    private String prodName;
    private Double price;
    private Shop shop;

    public Integer getProductId() {
        return productId;
    }

    public String getProdName() {
        return prodName;
    }

    public Double getPrice() {
        return price;
    }

    public Shop getShop() {
        return shop;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }


    public Product(Integer productId, String prodName, Double price, Shop shop) {
        this.productId = productId;
        this.prodName = prodName;
        this.price = price;
        this.shop = shop;
    }
}

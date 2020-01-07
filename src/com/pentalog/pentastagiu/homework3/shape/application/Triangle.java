package com.pentalog.pentastagiu.homework3.shape.application;

public class Triangle extends Shape {

    private Double lat1, lat2, lat3;

    public Double getLat1() {
        return lat1;
    }

    public void setLat1(Double lat1) {
        this.lat1 = lat1;
    }

    public Double getLat2() {
        return lat2;
    }

    public void setLat2(Double lat2) {
        this.lat2 = lat2;
    }

    public Double getLat3() {
        return lat3;
    }

    public void setLat3(Double lat3) {
        this.lat3 = lat3;
    }

    public Triangle(Double lat1, Double lat2, Double lat3) {
        this.lat1 = lat1;
        this.lat2 = lat2;
        this.lat3 = lat3;
    }

    @Override
    public Double getArea() {
        double semi = (lat1 + lat2 + lat3)/2;
        return Math.sqrt(semi * (semi - lat1) * (semi - lat2) * (semi - lat3));
    }

    @Override
    public Double getPerimeter() {
        return lat1 + lat2 + lat3;
    }
}

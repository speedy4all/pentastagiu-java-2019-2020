package com.pentalog.pentastagiu.homework4.circle;

public class Circle {
    private Double radius;

    public Circle(Double radius) {
        super();
        this.radius = radius;
    }

    public Double calculateArea(Double radius) {
        Double area=Math.PI*Math.pow(radius, 2);
        return area;
    }

    public Double getRadius() {
        return radius;
    }


    public void setRadius(Double radius) {
        this.radius = radius;
    }



}

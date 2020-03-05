package com.pentalog.pentastagiu.homework4.problem1;

public class Circle {

    Double radius;
    Double area;

    @Override
    public String toString() {
        return "Circle radius: " + radius;
    }

    public Circle(Double radius){
        this.radius = radius;
    }

    public Double getRadius(){
        return radius;
    }

    public void setRadius(Double radius){
        this.radius = radius;
    }

    public Double getArea(){
        return this.radius * 3.14;
    }

    public void setArea(Double area){
        this.area = area;
    }
}

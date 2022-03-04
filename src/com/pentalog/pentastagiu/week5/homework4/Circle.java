package com.pentalog.pentastagiu.week5.homework4;

public class Circle {
    public double radius;
    final double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateAria(){
     return pi*Math.pow(this.radius,2)   ;
    }
}

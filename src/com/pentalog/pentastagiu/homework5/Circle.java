package com.pentalog.pentastagiu.homework5;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
}

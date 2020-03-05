package com.pentalog.pentastagiu.homework3;

import java.text.DecimalFormat;

public class Circle extends Shape {
    private double radius;

    @Override
    public double calculatePerimeter() {
        DecimalFormat df = new DecimalFormat("#.##");

        return Double.parseDouble( df.format(2*Math.PI*radius) );
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

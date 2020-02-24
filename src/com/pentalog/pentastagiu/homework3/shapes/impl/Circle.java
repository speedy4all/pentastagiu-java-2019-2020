package com.pentalog.pentastagiu.homework3.shapes.impl;

import com.pentalog.pentastagiu.homework3.shapes.Point;
import com.pentalog.pentastagiu.homework3.exceptions.NegativeRadiusCircle;
import com.pentalog.pentastagiu.homework3.shapes.Form;

public class Circle implements Form {
    private Point center;
    private double radius;

    public Circle(double centerX, double centerY, double radius) {
        if(radius < 0){
            throw new NegativeRadiusCircle("Raza cercului nu poate fi negativa");
        }
        this.center = new Point(centerX, centerY);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
}

package com.pentalog.pentastagiu.homework3.ex1;

public class Circle extends Shape{
    private double radius;
    public Circle() {
        System.out.println("Introduce the radius: ");
        radius=sc.nextDouble();
    }

    @Override
    public double calculateArea() {
        area=Math.PI*(radius*radius);
        return area;
    }

    @Override
    public double calculatePermieter() {
        perimeter=2*Math.PI*radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", area=" + area + ", perimeter=" + perimeter+ "}";

    }
}

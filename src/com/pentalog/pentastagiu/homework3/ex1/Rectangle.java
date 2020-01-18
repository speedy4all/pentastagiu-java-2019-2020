package com.pentalog.pentastagiu.homework3.ex1;

public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle() {
        System.out.println("Introduce the length of the rectangle: ");
        length=sc.nextDouble();
        System.out.println("Introduce the width of the rectangle: ");
        width=sc.nextDouble();
    }

    @Override
    public double calculateArea() {
        area= length*width;
        return area;
    }

    @Override
    public double calculatePermieter() {
        perimeter=2*width+2*length;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square{" + "length=" +length +"width=" +width + "area=" +area + "perimeter=" +perimeter + "}";
    }
}


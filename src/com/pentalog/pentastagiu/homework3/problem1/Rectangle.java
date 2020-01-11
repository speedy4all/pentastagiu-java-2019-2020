package com.pentalog.pentastagiu.homework3.problem1;

public class Rectangle  implements Shape {

    private double length;
    private double width;
    private String name = "Rectangle";

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void perimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Rectangle perimeter: " + perimeter);
    }

    @Override
    public double area() {
        double area = length * width;
        return area;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

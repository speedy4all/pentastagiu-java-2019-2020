package com.pentalog.pentastagiu.homework3.App1;

public class Rectangle extends Shape {
    private static double length;
    private static double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(){

    }

    @Override
    protected double calculatePerimeter() {
        if (length <= 0 || width <= 0){
            System.out.println("Invalid values!!");
            return -1;
        } else {
            perimeter = 2 * (length + width);
        }
        return formatNumbersTwoDecimals(perimeter);
    }


    @Override
    protected double calculateArea() {
        if (length <= 0 || width <= 0){
            System.out.println("Invalid values!!");
            return -1;
        }

        else {
            area = length * width;
        }
        return formatNumbersTwoDecimals(area);
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

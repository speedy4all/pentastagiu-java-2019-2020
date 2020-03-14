package com.pentalog.pentastagiu.homework3.App1;

public class Square extends Rectangle {
    private static double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    protected double calculatePerimeter() {
        if (side <= 0){
            System.out.println("Invalid value!!");
            return -1;
        } else {
            perimeter = 4 * side;
        }
        return formatNumbersTwoDecimals(perimeter);
    }

    @Override
    protected double calculateArea() {
        if (side <= 0){
            System.out.println("Invalid value!!");
            return -1;
        }
        else {
            area = side * side;
        }
        return formatNumbersTwoDecimals(area);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}

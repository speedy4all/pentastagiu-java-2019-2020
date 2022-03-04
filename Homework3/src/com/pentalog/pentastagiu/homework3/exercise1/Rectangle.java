package com.pentalog.pentastagiu.homework3.exercise1;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(){
        System.out.println("Introduce the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.println("Introduce the width of the rectangle: ");
        width = sc.nextDouble();
        while(length < 0 ){
            System.out.println("The length should be bigger than 0!");
            System.out.println("Introduce the length of the rectangle: ");
            length = sc.nextDouble();
        }
        while(width < 0){
            System.out.println("The width should be bigger than 0!");
            System.out.println("Introduce the width of the rectangle: ");
            width = sc.nextDouble();
        }
        while(length < width){
            System.out.println("The length should have a bigger value than the width of the rectangle!");
            System.out.println("Introduce the length of the rectangle: ");
            length = sc.nextDouble();
            System.out.println("Introduce the width of the rectangle: ");
            width = sc.nextDouble();
        }
    }

    @Override
    public double calculateArea() {
        area = length * width;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 2 * (length + width);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

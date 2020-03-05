package com.pentalog.pentastagiu.homework3.ex1_shapes;

import java.util.Comparator;

public class TestShape {
    public static void main(String[] args) {

        //Circle test
        Circle circle1 = new Circle(25);
        Circle circle2 = new Circle(23.5);

        System.out.println("First circle radius: " + circle1.getRadius() +
                "\nResulting area: " + circle1.area() +
                "\nResulting perimeter: " + circle1.perimeter());
        System.out.println();
        System.out.println("Second circle radius: " + circle2.getRadius() +
                "\nResulting area: " + circle2.area() +
                "\nResulting perimeter: " + circle2.perimeter());

        System.out.println();
        if (circle1.area() > circle2.area()) {
            System.out.println("Area of the first circle is bigger.");
        } else if (circle1.area() < circle2.area()) {
            System.out.println("Area of the second circle is bigger.");
        } else {
            System.out.println("The circles are equal.");
        }

        System.out.println();
        //Rectangle test
        Rectangle rectangle1 = new Rectangle(5, 7);
        Rectangle rectangle2 = new Rectangle(8.2, 10.5);

        System.out.println("Rectangle1 with width: " + rectangle1.getWidth() + " and height: " + rectangle1.getHeight() +
                "\nResulting area: " + rectangle1.area() +
                "\nResulting perimeter: " + rectangle1.perimeter());
        System.out.println();
        System.out.println("Rectangle2 with width: " + rectangle2.getWidth() + " and height: " + rectangle2.getHeight() +
                "\nResulting area: " + rectangle2.area() +
                "\nResulting perimeter: " + rectangle2.perimeter());

        System.out.println();
        if (rectangle1.area() > rectangle2.area()) {
            System.out.println("Area of Rectangle1 is bigger.");
        } else if (rectangle1.area() < rectangle2.area()) {
            System.out.println("Area of Rectangle2 is bigger.");
        } else {
            System.out.println("The rectangles are equal.");
        }

        System.out.println();
        //Triangle test
        Triangle triangle1 = new Triangle(5, 3, 4);
        Triangle triangle2 = new Triangle(6, 6, 6);

        System.out.println("Triangle1 side lenghts: " + +triangle1.getA() + ", " + triangle1.getB() + ", " + triangle1.getC() +
                "\nResulting area: " + triangle1.area() +
                "\nResulting perimeter: " + triangle1.perimeter());
        System.out.println();
        System.out.println("Triangle2 side lenghts: " + +triangle2.getA() + ", " + triangle2.getB() + ", " + triangle2.getC() +
                "\nResulting area: " + triangle2.area() +
                "\nResulting perimeter: " + triangle2.perimeter());

        System.out.println();
        if (triangle1.area() > triangle2.area()) {
            System.out.println("Area of Triangle1 is bigger.");
        } else if (triangle1.area() < triangle2.area()) {
            System.out.println("Area of Triangle2 is bigger.");
        } else {
            System.out.println("The triangles are equal.");
        }

        System.out.println();
        //Square test
        Square square1 = new Square(8);
        Square square2 = new Square(5);

        System.out.println("Square1 side lenght: " + square1.getSide() +
                "\nResulting area: " + square1.area() +
                "\nResulting perimeter: " + square1.perimeter());
        System.out.println();
        System.out.println("Square2 side lenght: " + square2.getSide() +
                "\nResulting area: " + square2.area() +
                "\nResulting perimeter: " + square2.perimeter());

        System.out.println();
        if (square1.area() > square2.area()) {
            System.out.println("Area of Square1 is bigger.");
        } else if (square1.area() < square2.area()) {
            System.out.println("Area of Square2 is bigger.");
        } else {
            System.out.println("The squares are equal.");
        }

    }


}

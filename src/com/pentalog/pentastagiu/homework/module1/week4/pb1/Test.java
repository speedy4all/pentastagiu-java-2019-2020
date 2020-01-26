package com.pentalog.pentastagiu.homework.module1.week4.pb1;

public class Test {
    public static void main(String[] args) {
        Shapes shape1 = new Rectangle(10, 20);
        Shapes shape2 = new Square(20);
        Shapes shape3 = new Circle(10);
        Shapes shape4 = new Triangle(5, 10, 5);
        System.out.println(shape1.compareTo(shape2).compareTo(shape3).compareTo(shape4));
    }
}

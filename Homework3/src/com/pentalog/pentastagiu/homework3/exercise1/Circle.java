package com.pentalog.pentastagiu.homework3.exercise1;

public class Circle extends Shape{

    private double radius;

    public Circle(){
        System.out.println("Introduce the radius of the circle: ");
        radius = sc.nextDouble();
        while(radius < 0){
            System.out.println("The radius should be bigger than 0!");
            System.out.println("Introduce the radius of the circle: ");
            radius = sc.nextDouble();
        }
    }

    @Override
    public double calculateArea() {
        area = Math.PI * (radius * radius);
        return this.area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = Math.PI * 2 * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter+
                '}';
    }

}


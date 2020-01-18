package com.pentalog.pentastagiu.homework3.ex1;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    double semiperimeter;
    public Triangle() {
        System.out.println("Introduce the 1st side: " );
        side1=sc.nextDouble();
        System.out.println("Introduce the 2nd side: " );
        side2=sc.nextDouble();
        System.out.println("Introduce the 3rd side: " );
        side3=sc.nextDouble();
    }

    @Override
    public double calculateArea() {
        semiperimeter=(side1+side2+side3)/2;
        area=Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
        return area;

    }

    @Override
    public double calculatePermieter() {
        perimeter= side1+side2+side3;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" + "side1=" +side1 +"side2=" +side2 +"side3=" +side3 + "semiperimeter=" +semiperimeter + "area=" +area + "perimeter=" +perimeter + "}";
    }
}

package com.pentalog.pentastagiu.homework4.ex1;

public class Triangle implements IShapeMethods{
    private double latA;
    private double latB;
    private double latC;


    public Triangle(double latA, double latB, double latC) {
        this.latA = latA;
        this.latB = latB;
        this.latC = latC;
    }


    @Override
    public double calculateArea() {
        double semiPerimeter = (latA + latB + latC)/2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - latA) * (semiPerimeter - latB) * (semiPerimeter - latC));

    }


    @Override
    public double calculatePerimeter() {
        return latA + latB + latC;
    }


    @Override
    public void getInfo() {
        System.out.println("Triangle: latA = " + this.latA + "; latB = " + this.latB + "; latC = " + this.latC + "; Area = " + calculateArea() + "; Perimeter = " + calculatePerimeter() );

    }

}


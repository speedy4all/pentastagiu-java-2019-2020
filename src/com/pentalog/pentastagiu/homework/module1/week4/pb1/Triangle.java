package com.pentalog.pentastagiu.homework.module1.week4.pb1;

public class Triangle extends Shapes{
    private double AB, BC, AC;

    public Triangle(double AB, double BC, double AC) {
        this.AB = AB;
        this.BC = BC;
        this.AC = AC;
    }

    @Override
    protected double calculatePerimeter() {
        return AB+BC+AC;
    }

    @Override
    protected double calculateArea() {
        double p = calculatePerimeter()/2;
        return Math.sqrt(p*(p-AB)*(p-BC)*(p-AC));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "AB=" + AB +
                ", BC=" + BC +
                ", AC=" + AC +
                '}';
    }
}

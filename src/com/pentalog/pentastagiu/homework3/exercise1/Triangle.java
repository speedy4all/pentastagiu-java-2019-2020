package com.pentalog.pentastagiu.homework3.exercise1;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a > 0 ? a : 1;
        this.b = b > 0 ? b : 1;
        this.c = c > 0 ? c : 1;
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2.00;
        double result = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(result);
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}

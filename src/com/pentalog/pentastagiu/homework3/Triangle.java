package com.pentalog.pentastagiu.homework3;

public class Triangle extends Shape {
    private double firstLength;
    private double secondLength;
    private double thirdLength;

    @Override
    public double calculatePerimeter() {
        return firstLength+secondLength+thirdLength;
    }

    public void setFirstLength(double firstLength) {
        this.firstLength = firstLength;
    }

    public void setSecondLength(double secondLength) {
        this.secondLength = secondLength;
    }

    public void setThirdLength(double thirdLength) {
        this.thirdLength = thirdLength;
    }
}

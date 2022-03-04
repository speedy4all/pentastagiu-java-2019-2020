package com.pentalog.pentastagiu.homework3.Shapes;

public class Triangle extends Shape {
    private int firstSide;
    private int secondSide;
    private int thirdSide;


    @Override
    public void calculatePerimeter() {
        int perimeter = firstSide + secondSide + thirdSide;
        System.out.printf("The triangle perimeter is " + perimeter);
    }

    @Override
    public void calculateArea() {
        int heron = (firstSide + secondSide + thirdSide) / 2;
        double area = Math.sqrt(heron * (heron - firstSide) * (heron - secondSide) * (heron - thirdSide));
        System.out.printf("The triangle area is " + area);

    }
    @Override
    public double getArea(){
        int heron = (firstSide + secondSide + thirdSide) / 2;
        double area = Math.sqrt(heron * (heron - firstSide) * (heron - secondSide) * (heron - thirdSide));
        return area;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                '}';
    }
}

package com.pentalog.pentastagiu.homework3.App1;

public class Triangle extends Shape {
    private static double firstSide;
    private static double secondSide;
    private static double thirdSide;
    private static double semiPer;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    protected double calculatePerimeter() {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <=0)
        {
            System.out.println("Invalid value");
            return -1;

        } else
        {
        perimeter = firstSide + secondSide + thirdSide;}
        return formatNumbersTwoDecimals(perimeter);
    }

    @Override
    protected double calculateArea() {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <=0)
        {
            System.out.println("Invalid value");
            return -1;
        }
        else {
            semiPer = calculatePerimeter() / 2;
            area = Math.sqrt(semiPer * (semiPer - firstSide) * (semiPer - secondSide) * (semiPer - thirdSide));
        }
        return formatNumbersTwoDecimals(area);
    }

    public static double getFirstSide() {
        return firstSide;
    }

    public static void setFirstSide(double firstSide) {
        Triangle.firstSide = firstSide;
    }

    public static double getSecondSide() {
        return secondSide;
    }

    public static void setSecondSide(double secondSide) {
        Triangle.secondSide = secondSide;
    }

    public static double getThirdSide() {
        return thirdSide;
    }

    public static void setThirdSide(double thirdSide) {
        Triangle.thirdSide = thirdSide;
    }
}

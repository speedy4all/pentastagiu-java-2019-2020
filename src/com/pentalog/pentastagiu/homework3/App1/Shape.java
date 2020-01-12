package com.pentalog.pentastagiu.homework3.App1;

import java.text.DecimalFormat;

public abstract class Shape{
    protected static double perimeter;
    protected static double area;

    public static double formatNumbersTwoDecimals(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        number = Double.parseDouble(decimalFormat.format(number));
        return number;
    }

    protected abstract double calculatePerimeter();

    protected double calculateArea(){
        return area;
}
}

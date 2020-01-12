package com.pentalog.pentastagiu.homework3.Shapes;

public  class Square extends Shape{
    private int length;

    @Override
    public void calculatePerimeter() {
        int perimeter = 4*length;
        System.out.printf("The square perimeter is " + perimeter);
    }

    @Override
    public void calculateArea() {
        double area = Math.pow(length,2);
        System.out.printf("The triangle area is " + area);

    }
    @Override
    public double getArea(){
        return length*length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}

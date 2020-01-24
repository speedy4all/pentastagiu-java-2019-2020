package com.pentalog.pentastagiu.homework3.shapes;

public class Triangle extends AreaAndParameterOfShape{

    private Double side1,side2,side3;

    public Triangle() {}
    public Triangle(Double side1, Double side2, Double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    //area and perimeter of a triangle with 3 sides
    @Override
    public Double calculateArea() {
        Double s=(side1+side2+side3)/2;
        Double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
    @Override

    public Double calculatePerimeter() {
        Double perimeter = side1+side2+side3;
        return perimeter;
    }

    public Double getSide1() {
        return side1;
    }
    public void setSide1(Double side1) {
        this.side1 = side1;
    }
    public Double getSide2() {
        return side2;
    }
    public void setSide2(Double side2) {
        this.side2 = side2;
    }
    public Double getSide3() {
        return side3;
    }
    public void setSide3(Double side3) {
        this.side3 = side3;
    }
}

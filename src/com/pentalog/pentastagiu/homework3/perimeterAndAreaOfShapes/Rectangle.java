package com.pentalog.pentastagiu.homework3.perimeterAndAreaOfShapes;

public class Rectangle extends AreaAndParameterOfShapes{

    private Double length;
    private Double width;

    public Rectangle() {

    }
    public Rectangle(Double length, Double width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public Double calculateArea() {
        Double area=length*width;
        return area;
    }

    @Override
    public Double calculatePerimeter() {
        Double perimeter=2*(length+width);
        return perimeter;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }


}


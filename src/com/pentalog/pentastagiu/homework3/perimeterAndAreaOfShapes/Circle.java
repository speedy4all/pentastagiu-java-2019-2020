package com.pentalog.pentastagiu.homework3.perimeterAndAreaOfShapes;

public class Circle extends AreaAndParameterOfShapes{

    private Double radius;

    public Circle() {};
    public Circle(Double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        Double area=radius*radius*Math.PI;
        return area;
    }

    @Override
    public Double calculatePerimeter() {
        Double perimeter=2*radius*Math.PI;
        return perimeter;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }



}




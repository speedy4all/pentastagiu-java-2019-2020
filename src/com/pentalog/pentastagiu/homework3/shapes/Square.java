package com.pentalog.pentastagiu.homework3.shapes;

public class Square extends AreaAndParameterOfShape{

    private Double side;
    public Square() {}
    public Square(Double side) {
        super();
        this.side = side;
    }

    @Override
    public Double calculateArea() {
        Double area=side*side;
        return area;
    }

    @Override
    public Double calculatePerimeter() {
        Double perimeter=4*side;
        return perimeter;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }
}

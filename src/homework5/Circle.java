package homework5;

import static java.lang.Math.PI;

public class Circle {
    private double radius=Math.random();
    private double area;

    Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    double getArea(){
        System.out.print("Area is: " );
        area =  PI*getRadius()*getRadius();
        return area;
    }

    @Override
    public String toString() {
        return "Circle: " +
                " radius=" + radius +
                ", area=" + area +
                '.';
    }
}

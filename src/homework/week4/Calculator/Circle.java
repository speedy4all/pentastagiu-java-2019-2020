package homework.week4.Calculator;
import homework.week4.Calculator.classes.Shape;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public double calcPerimeter() {
        return 2*radius*3.14;
    }

    @Override
    public double calcArea() {
        return radius*3.14*3.14;
    }
}

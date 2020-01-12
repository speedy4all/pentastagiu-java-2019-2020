package homework.week4.Calculator;
import homework.week4.Calculator.classes.Shape;

public class Rectangle implements Shape {
    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcPerimeter() {
        return 2*(length+width);
    }

    @Override
    public double calcArea() {
        return length*width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

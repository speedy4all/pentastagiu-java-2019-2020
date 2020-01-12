package homework.week4.Calculator;
import homework.week4.Calculator.classes.Shape;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    @Override
    public double calcPerimeter() {
        return 2*side;
    }

    @Override
    public double calcArea() {
        return side*side;
    }
}

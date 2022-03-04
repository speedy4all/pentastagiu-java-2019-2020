package AppShapes;

public  abstract class Shape {
    double aria;
    double perimeter;

    abstract void aria();

    abstract void perimetrul();


    public Shape() {
    }

    public double getAria() {
        return aria;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

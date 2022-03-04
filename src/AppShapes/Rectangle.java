package AppShapes;

public class Rectangle extends Shape {
    private double length ;
    private double wide;

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    void aria() {
        aria=getLength()*getWide();
        System.out.println("Aria dreptunghiului cu latimea de " + getWide() + " si lungimea de " + getLength() + " este: "+ aria + '.');
    }
    @Override
    void perimetrul() {
        perimeter=2*(getLength()+getWide());
        System.out.println("Perimetrul dreptunghiului cu latimea de " + getWide() + " si lungimea de " + getLength() + " este: "+ perimeter + '.');
    }

    @Override
    public String toString() {
        return "Rectangle:" +
                "length=" + length +
                ", wide=" + wide +
                ", aria=" + aria +
                ", perimeter=" + perimeter +
                '.';
    }
}

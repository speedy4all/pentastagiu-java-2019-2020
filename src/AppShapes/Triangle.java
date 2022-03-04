package AppShapes;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    void aria() {
        aria=(getBase()*getHeight()/2);
        System.out.println("Aria triunghiului cu baza de " + getBase() + " si inaltimea de " + getHeight() + " este de " + aria + '.');
    }

    @Override
    void perimetrul() {
        perimeter=getSide1()+getSide2()+getBase();
        System.out.println("Perimetrul triunghiului cu latura 1 de " + getSide1() + ", latura 2 de " + getSide2() +
                " si baza de " + getBase() + " este de: "+ perimeter +  '.');

    }

    @Override
    public String toString() {
        return "Triangle:" +
                "base=" + base +
                ", height=" + height +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", aria=" + aria +
                ", perimeter=" + perimeter +
                '.';
    }
}

package AppShapes;

public class Circle extends Shape {
    private double raza;

    public Circle(double raza) {
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    @Override
    void aria() {
        aria=Math.PI * getRaza()*getRaza();
        System.out.println("Aria cercului cu raza de " + getRaza() + " este de: "+ aria + '.');
    }

    @Override
    void perimetrul() {
        perimeter=2 * Math.PI * getRaza();
        System.out.println( "Perimetrul cercului cu raza de " + getRaza() + " este de: "+ perimeter + '.');
    }

    @Override
    public String toString() {
        return "Circle:" +
                "raza=" + raza +
                ", aria=" + aria +
                ", perimeter=" + perimeter +
                '.';
    }
}

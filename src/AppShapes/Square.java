package AppShapes;

public class Square extends Shape {
    private double wide;

    public Square(double wide) {
        this.wide = wide;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    void aria() {
        aria=getWide()*getWide();
        System.out.println("Aria patratului cu latura de " + getWide() + " este de: " + aria + '.');
    }

    @Override
    void perimetrul() {
        perimeter=4*getWide();
        System.out.println("Perimetrul patratului cu latura de " + getWide() + " este de: " + perimeter +  '.');
    }

    @Override
    public String toString() {
        return "Square:" +
                "wide=" + wide +
                ", aria=" + aria +
                ", perimeter=" + perimeter +
                '.';
    }
}

package Homework3.EX1;

public class Rectangle implements Shape {
    private double width;                                        //field-uri (campuri)
    private double height;                                       //field-uri (campuri)

    public Rectangle(double width, double height) {
        this.width = width;                                   //constructor cu 2parametru
        this.height = height;                                 //constructor cu 2parametru
    }                                                 // construim obiectul (dreptunghi)


    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

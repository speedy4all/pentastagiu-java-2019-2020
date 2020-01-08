package Homework3.EX1;

import java.util.Objects;

public class Circle implements Shape {
    private double radius;                  //fara valoare - o va avea setata in "Main", la const. obiect

    public Circle(double radius) {          //constructor cu 1 singur parametru
        this.radius = radius;               //Generate (cl. dreapta)
    }

    public double getRadius() {             //getter- returneaza raza (ca valoare)
        return radius;                      // (cl dreapta)
    }

    public void setRadius(double radius) {  //setter- seteaza val. razei (se poate modifica)
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {             //convert. din referinta (indexul din memorie) in val.tip string
        return "Circle: " + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}


/*Ovveride- metode care se numesc la fel, dar au implementari diferite*/
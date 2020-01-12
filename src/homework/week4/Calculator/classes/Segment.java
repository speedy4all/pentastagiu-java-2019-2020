package homework.week4.Calculator.classes;
import java.lang.Math;

public class Segment {
    private Point begin, end;
    private double lenght;

    public Segment(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
        calcLenght(begin, end);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    private void calcLenght(Point first, Point second) {
        lenght = Math.sqrt((first.getX() - second.getX()) * (first.getX() - second.getX()) + (first.getY() - second.getY()) * (first.getY() - second.getY()));
    }

}

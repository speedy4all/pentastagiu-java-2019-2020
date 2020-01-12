package homework.week4.Calculator;
import homework.week4.Calculator.classes.Point;
import homework.week4.Calculator.classes.Segment;
import homework.week4.Calculator.classes.Shape;

public class Triangle implements Shape {
    private Segment side1, side2, side3;

    private Triangle(Segment one, Segment two, Segment three) {

        if (isTriangle(one, two, three)) {
            this.side1 = one;
            this.side2 = two;
            this.side3 = three;
        }
    }

    public static class Builder {
        private Segment side1, side2, side3;
        private Point one, two, three;

        public Builder withPoint1(int x, int y) {
            one = new Point(x,y);
            return this;
        }

        public Builder withPoint2(int x, int y) {
            two = new Point(x,y);
            return this;
        }

        public Builder withPoint3(int x, int y) {
            three = new Point(x,y);
            return this;
        }


        public Triangle build() {
            side1 = calcSide(one, two);
            side2 = calcSide(two, three);
            side3 = calcSide(three, one);
            return new Triangle(side1, side2, side3);
        }

        private Segment calcSide(Point first, Point second) {
            return new Segment(first, second);
        }
    }

    public Segment getSide1() {
        return side1;
    }

    public Segment getSide2() {
        return side2;
    }

    public Segment getSide3() {
        return side3;
    }


    @Override
    public double calcPerimeter() {
        return side3.getLenght()+side2.getLenght()+side1.getLenght();
    }

    @Override
    public double calcArea() {
        int height = side1.getBegin().getX() - side1.getEnd().getX();
        if (height < 0) { height *= -1; }
        return (height * side3.getLenght()) / 2;
    }

    private boolean isTriangle(Segment side1, Segment side2, Segment side3) {
        return (side1.getLenght() + side2.getLenght()) > side3.getLenght() &&
                (side1.getLenght() + side3.getLenght()) > side2.getLenght() &&
                (side2.getLenght() + side3.getLenght()) > side1.getLenght();
    }
}

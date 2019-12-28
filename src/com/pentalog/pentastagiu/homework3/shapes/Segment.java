package com.pentalog.pentastagiu.homework3.shapes;

import com.pentalog.pentastagiu.homework3.shapes.Point;
import com.pentalog.pentastagiu.homework3.utils.SegmentUtils;

public class Segment {
    private Point first;
    private Point second;
    private double length;

    public Segment(double firstX, double firstY, double secondX, double secondY) {
        this.first = new Point(firstX, firstY);
        this.second = new Point(secondX, secondY);
        this.length = SegmentUtils.calculateSegmentLength(first, second);
    }

    public Point getFirst() {
        return first;
    }

    public void setFirst(Point first) {
        this.first = first;
    }

    public Point getSecond() {
        return second;
    }

    public void setSecond(Point second) {
        this.second = second;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "first=" + first +
                ", second=" + second +
                ", length=" + length +
                '}';
    }
}

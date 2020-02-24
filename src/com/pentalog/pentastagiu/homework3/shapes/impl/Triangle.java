package com.pentalog.pentastagiu.homework3.shapes.impl;

import com.pentalog.pentastagiu.homework3.shapes.Point;
import com.pentalog.pentastagiu.homework3.shapes.Segment;
import com.pentalog.pentastagiu.homework3.exceptions.NotATriangleException;
import com.pentalog.pentastagiu.homework3.shapes.Form;
import com.pentalog.pentastagiu.homework3.utils.SegmentUtils;

public class Triangle implements Form {
    private Segment uppRightSegment;
    private Segment uppLeftSegment;
    private Segment baseSegment;

    public Triangle(double upperX, double upperY, double rightX, double rightY, double leftX, double leftY) {
        if (!isARealTriangle(upperX, upperY, rightX, rightY, leftX, leftY)) {
            throw new NotATriangleException("Punctele date nu pot forma un triunghi");
        }
        this.uppRightSegment = new Segment(upperX, upperY, rightX, rightY);
        this.uppLeftSegment = new Segment(upperX, upperY, leftX, leftY);
        this.baseSegment = new Segment(rightX, rightY, leftX, leftY);

    }
    public Segment getUppRightSegment() {
        return uppRightSegment;
    }

    public void setUppRightSegment(Segment uppRightSegment) {
        this.uppRightSegment = uppRightSegment;
    }

    public Segment getUppLeftSegment() {
        return uppLeftSegment;
    }

    public void setUppLeftSegment(Segment uppLeftSegment) {
        this.uppLeftSegment = uppLeftSegment;
    }

    public Segment getBaseSegment() {
        return baseSegment;
    }

    public void setBaseSegment(Segment baseSegment) {
        this.baseSegment = baseSegment;
    }

    @Override
    public double calculatePerimeter() {
        return uppRightSegment.getLength() + uppLeftSegment.getLength() + baseSegment.getLength();
    }

    @Override
    public double calculateArea() {
        double height = uppRightSegment.getFirst().getX() - uppRightSegment.getSecond().getX();
        return height * baseSegment.getLength() / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "uppRightSegment=" + uppRightSegment +
                ", uppLeftSegment=" + uppLeftSegment +
                ", baseSegment=" + baseSegment +
                '}';
    }

    private boolean isARealTriangle(double upperX, double upperY, double rightX, double rightY, double leftX, double leftY) {
        Point upperPoint = new Point(upperX, upperY);
        Point leftPoint = new Point(leftX, leftY);
        Point rightPoint = new Point(rightX, rightY);
        double firstSideLength = SegmentUtils.calculateSegmentLength(upperPoint, rightPoint);
        double secondSideLength = SegmentUtils.calculateSegmentLength(upperPoint, leftPoint);
        double thirdSideLength = SegmentUtils.calculateSegmentLength(leftPoint, rightPoint);
        return isSideLengthsFormTriangle(firstSideLength, secondSideLength, thirdSideLength);
    }

    private boolean isSideLengthsFormTriangle(double firstSideLength, double secondSideLength, double thirdSideLength) {
        return (firstSideLength + secondSideLength) > thirdSideLength && (firstSideLength + thirdSideLength) > firstSideLength && (thirdSideLength + secondSideLength) > firstSideLength;
    }

}

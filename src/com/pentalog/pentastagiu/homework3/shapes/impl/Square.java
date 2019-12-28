package com.pentalog.pentastagiu.homework3.shapes.impl;

import com.pentalog.pentastagiu.homework3.shapes.Point;
import com.pentalog.pentastagiu.homework3.shapes.Segment;
import com.pentalog.pentastagiu.homework3.exceptions.NotASquareException;
import com.pentalog.pentastagiu.homework3.shapes.Form;
import com.pentalog.pentastagiu.homework3.utils.SegmentUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Square implements Form {
    private Segment uppSegment;
    private Segment rightSegment;
    private Segment leftSegment;
    private Segment baseSegment;

    public Square(double upperLeftX, double upperLeftY, double upperRightX, double upperRightY,
                  double rightX, double rightY, double leftX, double leftY) {
        if (!isARealSquare(upperLeftX, upperLeftY, upperRightX, upperRightY,
                rightX, rightY, leftX, leftY)) {
            throw new NotASquareException("Punctele data nu pot forma un patrat");
        }
        this.uppSegment = new Segment(upperLeftX, upperLeftY, upperRightX, upperRightY);
        this.rightSegment = new Segment(upperRightX, upperRightY, rightX, rightY);
        this.leftSegment = new Segment(leftX, leftY, upperLeftX, upperLeftY);
        this.baseSegment = new Segment(leftX, leftY, rightX, rightY);
    }

    public Segment getUppSegment() {
        return uppSegment;
    }

    public void setUppSegment(Segment uppSegment) {
        this.uppSegment = uppSegment;
    }

    public Segment getRightSegment() {
        return rightSegment;
    }

    public void setRightSegment(Segment rightSegment) {
        this.rightSegment = rightSegment;
    }

    public Segment getLeftSegment() {
        return leftSegment;
    }

    public void setLeftSegment(Segment leftSegment) {
        this.leftSegment = leftSegment;
    }

    public Segment getBaseSegment() {
        return baseSegment;
    }

    public void setBaseSegment(Segment baseSegment) {
        this.baseSegment = baseSegment;
    }

    @Override
    public double calculatePerimeter() {
        return uppSegment.getLength() * 4;
    }

    @Override
    public double calculateArea() {
        return uppSegment.getLength() * uppSegment.getLength();
    }

    @Override
    public String toString() {
        return "Square{" +
                "uppSegment=" + uppSegment +
                ", rightSegment=" + rightSegment +
                ", leftSegment=" + leftSegment +
                ", baseSegment=" + baseSegment +
                '}';
    }

    private boolean isARealSquare(double upperLeftX, double upperLeftY, double upperRightX, double upperRightY,
                                  double rightX, double rightY, double leftX, double leftY) {
        if (upperLeftX != leftX || upperLeftY != upperRightY || rightY != leftY || rightX != upperRightX) {
            return false;
        }
        Point uppLeftPoint = new Point(upperLeftX, upperLeftY);
        Point uppRightPoint = new Point(upperRightX, upperRightY);
        Point rightPoint = new Point(rightX, rightY);
        Point leftPoint = new Point(leftX, leftY);
        double uppSegmentLength = SegmentUtils.calculateSegmentLength(uppLeftPoint, uppRightPoint);
        double downSegmentLength = SegmentUtils.calculateSegmentLength(rightPoint, leftPoint);
        double rightSegmentLength = SegmentUtils.calculateSegmentLength(uppRightPoint, rightPoint);
        double leftSegmentLength = SegmentUtils.calculateSegmentLength(uppLeftPoint, leftPoint);
        Set<Double> distinctSet = new HashSet<Double>(Arrays.asList(uppSegmentLength, downSegmentLength, rightSegmentLength, leftSegmentLength));
        return distinctSet.size() != 4;
    }


}

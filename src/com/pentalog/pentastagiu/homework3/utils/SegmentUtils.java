package com.pentalog.pentastagiu.homework3.utils;

import com.pentalog.pentastagiu.homework3.shapes.Point;

public class SegmentUtils {
    public static double calculateSegmentLength(Point first, Point second) {
        double xDifference = second.getX() - first.getX();
        double yDifference = second.getY() - first.getY();
        double sumOfSquareDifference = xDifference * xDifference + yDifference * yDifference;
        return Math.sqrt(sumOfSquareDifference);
    }
}

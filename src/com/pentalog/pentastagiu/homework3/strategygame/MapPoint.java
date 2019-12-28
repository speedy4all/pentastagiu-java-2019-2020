package com.pentalog.pentastagiu.homework3.strategygame;

public class MapPoint {
    private int linePosition;
    private int columnPosition;

    public MapPoint(int linePosition, int columnPosition) {
        this.linePosition = linePosition;
        this.columnPosition = columnPosition;
    }

    public int getLinePosition() {
        return linePosition;
    }

    public void setLinePosition(int linePosition) {
        this.linePosition = linePosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    @Override
    public String toString() {
        return "MapPoint{" +
                "linePosition=" + linePosition +
                ", columnPosition=" + columnPosition +
                '}';
    }
}

package com.pentalog.pentastagiu.homework.module1.week4.pb4;

public class MapLocation {
    int x, y;

    public MapLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MapLocation add(Direction d)
    {
        return new MapLocation(x + d.x, y + d.y);
    }

    public boolean isAdjacentTo(MapLocation other)
    {
        return (Math.abs(x-other.x) + Math.abs(y-other.y) == 1);
    }

    @Override
    public String toString() {
        return "MapLocation{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

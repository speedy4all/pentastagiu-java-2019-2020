package com.pentalog.pentastagiu.homework.module1.week4.pb4;

public enum Direction {
    North(-1, 0),
    East(0, 1),
    South(1, 0),
    West(0, -1);

    int x, y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

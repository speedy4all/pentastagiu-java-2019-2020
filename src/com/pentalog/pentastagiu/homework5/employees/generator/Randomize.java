package com.pentalog.pentastagiu.homework5.employees.generator;

public class Randomize {

    public static int getRandomIntInLimit(int limit) {
        return (int) (Math.random() * limit) + 1;
    }

    public static int getRandomIntInInterval(int up, int down) {
        return (int) (Math.random() * up) + down;
    }

}

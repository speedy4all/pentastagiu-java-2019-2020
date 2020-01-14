package com.pentalog.pentastagiu.homework5.utils;

public class RandomUtils {

    public static int getRandomIntInLimit(int limit) {
        return (int) (Math.random() * limit) + 1;
    }

    public static int getRandomIntInInterval(int upperLimit, int downLimit) {
        return (int) (Math.random() * upperLimit) + downLimit;
    }

}

package com.pentalog.pentastagiu.week4.math;

public class Calculator {
    //static int[] forbidenNumbers = {1,5,7};
    static int[] forbidenNumbers = new int[10];
    static {
        for (int i = 0; i < 10; i++) {
            forbidenNumbers[i] = i*6;
        }
    }

    public static int calculateSum(int a, int b) {
        return a+b;
    }

    public static int calculateSum(int a, int b, int c) {
        return a+b+c;
    }

    public static double calculateSum(int a, double b) {
        return a+b;
    }

    public static double calculateSum(double a, int b) {
        return a+b;
    }
}

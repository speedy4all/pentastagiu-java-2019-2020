package com.pentalog.pentastagiu.homework5.lambdas;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface addition = (int a, int b) -> a + b;
        FunctionalInterface multiplication = (int a, int b) -> a * b;
        FunctionalInterface substraction = (int a, int b) -> a - b;
        FunctionalInterface division = (int a, int b) -> a / b;

        System.out.println("Addition: " + operate(23,34,addition));
        System.out.println("Multiplication: " + operate(34,45, multiplication));
        System.out.println("Substraction: " + operate(79,23,substraction));
        System.out.println("Division: " + operate(45,4,division));

    }
    private static int operate(int a, int b, FunctionalInterface functionalInterface){
        return functionalInterface.operation(a, b);
    }
}

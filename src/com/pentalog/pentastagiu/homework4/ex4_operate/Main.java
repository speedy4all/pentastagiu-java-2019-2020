package com.pentalog.pentastagiu.homework4.ex4_operate;

public class Main {

    public static Number operate (Number n1, Number n2, FunctionalInterface functionalInterface){
        return functionalInterface.operation(n1, n2);
    }
    public static void main(String[] args) {
        // add 3 lambda implementations of the functional interface with addition,
        // multiplication, substraction and division, then call the operate method
        // with input values and each operation in part.
        FunctionalInterface add = (num1, num2) -> (num1.doubleValue() + num2.doubleValue());
        System.out.println("Addition: " + operate(1,4, add));

        FunctionalInterface multiplicate = (num1, num2) -> (num1.doubleValue() * num2.doubleValue());
        System.out.println("Multiplication: " + operate(5,3,multiplicate));

        FunctionalInterface substract = (num1, num2) -> (num1.doubleValue() - num2.doubleValue());
        System.out.println("Substraction: " + operate(5,9,substract));

        FunctionalInterface division = (num1, num2) -> (num1.doubleValue() / num2.doubleValue());
        System.out.println("Division: " + operate(9,3, division));
    }
}

package com.pentalog.pentastagiu.homework4.problem4;

public class problem4App {
    public static void main(String[] args) {
        //addition
        Functionable addition = (Number number1, Number number2) -> System.out.println((Integer) number1 + (Integer) (number2));
        System.out.println("Addition: ");
        operate(15, 5, addition);

        //multiplication
        Functionable multiplication = (Number number1, Number number2) -> System.out.println((Integer) number1 * (Integer) number2);
        System.out.println("Multiplication");
        operate(10, 10, multiplication);

        //substraction
        Functionable substraction = (Number number1, Number number2) -> System.out.println(((Integer) number1 - (Integer) number2));
        System.out.println("Substraction");
        operate(300, 4, substraction);

        //division
        Functionable division = (Number number1, Number number2) -> System.out.println((Integer) number1 / (Integer) number2);
        System.out.println("Division");
        operate(150, 5, division);
    }

    public static void operate(Number number1, Number number2, Functionable functionable) {
        functionable.operation(number1, number2);
    }


}

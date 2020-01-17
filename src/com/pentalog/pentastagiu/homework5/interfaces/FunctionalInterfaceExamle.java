package com.pentalog.pentastagiu.homework5.interfaces;

public class FunctionalInterfaceExamle {

    public static void main(String[] args) {
        /*
        Write a functional interface with an abstract method called operation with 2 Number parameters
        (by Number I refer to the java class in java.lang.Number).
        Then in main, create a method named “operate” that has 2 Number parameters and the 3rd parameter
        is the functional interface you created. Then in main, add 3 lambda implementations of the functional interface
        with addition, multiplication,substraction and division, then call the operate method with input values and each operation in part.
         */
        FunctionalInterfaceExamle funcIntEx = new FunctionalInterfaceExamle();

        FunctionalInterface addition = (a, b) -> (a.intValue() + b.intValue());
        System.out.println("Addition is: " + funcIntEx.operate(3, 4, addition));

        FunctionalInterface multiplication = (a, b) -> (a.intValue() * b.intValue());
        System.out.println("Multiplication is: " + funcIntEx.operate(2, 4, multiplication));

        FunctionalInterface substraction = (a, b) -> (a.intValue() - b.intValue());
        System.out.println("Substraction is: " + funcIntEx.operate(8, 4, substraction));

        FunctionalInterface division = (a, b) -> (a.intValue() / b.intValue());
        System.out.println("Division is: " + funcIntEx.operate(20, 4, division));
    }

    int operate(Number op1, Number op2, FunctionalInterface funcInterf) {
        return funcInterf.operation(op1,op2);
    }
}

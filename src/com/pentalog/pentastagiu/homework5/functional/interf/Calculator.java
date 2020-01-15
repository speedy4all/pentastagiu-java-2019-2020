package com.pentalog.pentastagiu.homework5.functional.interf;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(calculate(12, 75, ((firstNumber, secondNumber) -> firstNumber.intValue() * secondNumber.intValue())));
        System.out.println(calculate(80, 4, ((firstNumber, secondNumber) -> firstNumber.intValue() - secondNumber.intValue())));
        System.out.println(calculate(46, 2, ((firstNumber, secondNumber) -> {
            if (secondNumber.intValue() != 0) {
                return firstNumber.intValue() / secondNumber.intValue();
            } else {
                return null;
            }
        })));
    }
    private static Number calculate(Number firstNumber, Number secondNumber, Operations operation) {
        return operation.operation(firstNumber, secondNumber);
    }
}


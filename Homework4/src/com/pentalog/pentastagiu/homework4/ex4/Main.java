package com.pentalog.pentastagiu.homework4.ex4;

public class Main {
    public static void main(String[] args) {
        IFunctionalInterface addition = (Number nr1, Number nr2) -> nr1.doubleValue() + nr2.doubleValue();
        IFunctionalInterface multiplication = (Number nr1, Number nr2) -> nr1.doubleValue() * nr2.doubleValue();
        IFunctionalInterface substraction = (Number nr1, Number nr2) -> nr1.doubleValue() - nr2.doubleValue();
        IFunctionalInterface division = (Number nr1, Number nr2) -> nr1.doubleValue() / nr2.doubleValue();

        System.out.println("The result of the addition: " + operate(4, 5, addition));
        System.out.println("The result of the multiplication: " + operate(4, 5, multiplication));
        System.out.println("The result of the substarction: " + operate(4, 5, substraction));
        System.out.println("The result of the division: " + operate(4, 5, division));
    }

    public static Number operate(Number nr1, Number nr2, IFunctionalInterface functionalInterface){
        return functionalInterface.operation(nr1, nr2);
    }

}

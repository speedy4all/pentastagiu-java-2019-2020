package com.pentalog.pentastagiu.week5.homework4;

public class OperateNumbers  {
    public static void main(String[] args) {

        OperateNumbers functionalInterfaceTest= new OperateNumbers();

        FunctionalInterfaceNumber addition = (x, y) -> (x.intValue() + y.intValue());
        System.out.println("Addition is: " + functionalInterfaceTest.operate(5, 8, addition));

        FunctionalInterfaceNumber substraction = (x, y) -> (x.intValue() - y.intValue());
        System.out.println("Substraction is: " + functionalInterfaceTest.operate(21, 4, substraction));

        FunctionalInterfaceNumber multiplication = (x, y) -> (x.intValue() * y.intValue());
        System.out.println("Multiplication is: " + functionalInterfaceTest.operate(41, 2, multiplication));

        FunctionalInterfaceNumber division = (x, y) -> (x.intValue() / y.intValue());
        System.out.println("Division is: " + functionalInterfaceTest.operate(22, 2, division));
    }
    public int operate(Number parameter1,Number parameter2,FunctionalInterfaceNumber functionalInterface){
        return functionalInterface.operation(parameter1,parameter2);

    }

}


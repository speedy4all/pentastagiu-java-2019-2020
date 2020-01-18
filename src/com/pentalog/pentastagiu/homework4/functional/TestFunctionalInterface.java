package com.pentalog.pentastagiu.homework4.functional;

import java.util.Scanner;

public class TestFunctionalInterface {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Double firstNumber;
        Double secondNumber;

        FunctionalInterface adition=(number1, number2)->number1.intValue()+number2.intValue();
        FunctionalInterface substraction=(number1,number2)->number1.intValue()-number2.intValue();
        FunctionalInterface multiplication=(number1,number2)->number1.intValue()*number2.intValue();
        FunctionalInterface division=(number1,number2)->number1.intValue()/(double)number2.intValue();


        System.out.println("Enter first number");
        firstNumber=scan.nextDouble();
        System.out.println("Enter second number");
        secondNumber=scan.nextDouble();

        System.out.println("ADDITION between " + firstNumber +" and " + secondNumber + " = " + operate(firstNumber,secondNumber, adition));
        System.out.println("SUBSTRACTION between " + firstNumber +" and " + secondNumber + " = " + operate(firstNumber,secondNumber, substraction));
        System.out.println("MULTIPLICATION between " + firstNumber +" and " + secondNumber + " = " + operate(firstNumber,secondNumber, multiplication));
        if(secondNumber==0){
            System.out.println("DIVISION: You can't divide by 0");
        }else {
            System.out.println("DIVISION between " + firstNumber +" and " + secondNumber + " = " + operate(firstNumber,secondNumber, division));
        }

    }

    public static Number operate(Number firstNumber, Number secondNumber, FunctionalInterface functionalInterf) {
        return functionalInterf.operation(firstNumber, secondNumber);
    }
}

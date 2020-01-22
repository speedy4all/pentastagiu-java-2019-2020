package com.pentalog.pentastagiu.homework4.lambdas;

//Write a functional interface with an abstract method called operation with 2 Number parameters
// (by Number I refer to the java class in java.lang.Number). Then in main, create a method named “operate”
// that has 2 Number parameters and the 3rd parameter is the functional interface you created.
// Then in main, add 3 lambda implementations of the functional interface with addition, multiplication,
// substraction and division, then call the operate method with input values and each operation in part.

public class MainApp {
    private void operate(Number number1, Number number2, FunctionalInterface functionalInterface) {

    }

    public static void main(String[] args) {
FunctionalInterface addition=(Number x1,Number x2)->{

    Number c = x1.intValue() + x2.intValue();
    System.out.println("Addition: "+ c.intValue());
};
        FunctionalInterface multiplication=(Number x1,Number x2)->{
            System.out.println("multiplication: "+(int)x1*(int)x2);
        };
        FunctionalInterface substraction=(Number x1,Number x2)->{
            Number s=(int)x1-(int)x2;

            System.out.println("substraction: "+s);
        };
        FunctionalInterface division=(Number x1,Number x2)->{
            System.out.println("division "+(int)x1/(int)x2);
        };

addition.operation(3,11);
multiplication.operation(3,3);
substraction.operation(8,2);
division.operation(14,2);
    }
}

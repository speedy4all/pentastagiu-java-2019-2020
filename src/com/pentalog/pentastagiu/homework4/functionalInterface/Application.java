package com.pentalog.pentastagiu.homework4.functionalInterface;



public class Application {
    public static void main(String[] args) {


   Application exampleFunction= new Application();
    FunctInterface addition = (x, y) -> (x.intValue() + y.intValue());
        System.out.println("The sum of the numbers is " + exampleFunction.operate(6,3,addition));
    FunctInterface substract = (x, y) -> (x.intValue() - y.intValue());
        System.out.println("The difference between the 2 numbers is " + exampleFunction.operate(6,3,substract));
    FunctInterface divison = (x, y) -> (x.intValue() / y.intValue());
        System.out.println("The division of the numbers is " + exampleFunction.operate(6,3,divison));
    FunctInterface multiply = (x, y) -> (x.intValue() * y.intValue());
        System.out.println("The multiply of the number is " + exampleFunction.operate(6,3,multiply));

    }


    public int operate(Number Number1,Number Number2,FunctInterface finterface ){
        return finterface.operation(Number1,Number2);

    }
}
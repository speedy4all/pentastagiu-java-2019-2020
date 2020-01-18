package com.pentalog.pentastagiu.homework4.Problem4;

public class MainApp {
    public static void main(String[] args) {
        OperationInterface addition = (Number n1, Number n2) -> System.out.println(n1.intValue() + n2.intValue());

        OperationInterface multiplication = (Number n1, Number n2) -> System.out.println(n1.intValue() * n2.intValue());

        OperationInterface substraction =  (Number n1, Number n2) -> System.out.println(n1.intValue() - n2.intValue());

        OperationInterface division =  (Number n1, Number n2) -> System.out.println(n1.intValue() /n2.intValue());

        System.out.print("Addition = ");
        operation(25,25, addition);

        System.out.print("Multiplication = ");
        operation(2,3,multiplication);

        System.out.print("Substraction = ");
        operation(10, 5, substraction);

        System.out.print("Division = ");
        operation(30,5, division);

    }

    public static void operation(Number firstNumber, Number secondNumber, OperationInterface operationInterface){
        operationInterface.operation(firstNumber, secondNumber);
    }
}

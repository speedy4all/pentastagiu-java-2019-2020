package com.pentalog.pentastagiu.homework4;


public class MainOperate {

    public static Number operate (Number n1, Number n2, FunctionalInterface fi){
        return fi.operation(n1, n2);
    }

    public static void operations(){
        FunctionalInterface add = (x1, x2) -> x1.doubleValue() + x2.doubleValue();
        FunctionalInterface subtract = (x1, x2) -> x1.doubleValue() - x2.doubleValue();
        FunctionalInterface multiplication = (x1, x2) -> x1.doubleValue() * x2.doubleValue();
        FunctionalInterface division = (x1, x2) -> x1.doubleValue() / x2.doubleValue();

        Number n1 = 14.4f;
        Number n2 = 10.9f;

        System.out.printf("%s + %s = %s \n", n1, n2, operate(n1, n2, add));
        System.out.printf("%s - %s = %s \n", n1, n2, operate(n1, n2, subtract));
        System.out.printf("%s * %s = %s \n", n1, n2, operate(n1, n2, multiplication));
        System.out.printf("%s / %s = %s \n", n1, n2, operate(n1, n2, division));
    }

    public static void main(String[] args) {
        operations();
    }
}

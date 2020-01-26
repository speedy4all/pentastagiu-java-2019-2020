package com.pentalog.pentastagiu.homework.module1.week5.pb4;

public class Test {
    public static void main(String[] args) {
        operate(10, 5, new Function() {
            @Override
            public Number operation(Number first, Number second) {
                return first.doubleValue() + second.doubleValue();
            }
        });
        operate(10, 5, new Function() {
            @Override
            public Number operation(Number first, Number second) {
                return first.doubleValue() - second.doubleValue();
            }
        });
        operate(10, 5, new Function() {
            @Override
            public Number operation(Number first, Number second) {
                return first.doubleValue() * second.doubleValue();
            }
        });
        operate(10, 5, new Function() {
            @Override
            public Number operation(Number first, Number second) {
                return first.doubleValue() / second.doubleValue();
            }
        });
    }

    private static void operate(Number first, Number second, Function operator)
    {
        System.out.println(operator.operation(first, second));
    }
}

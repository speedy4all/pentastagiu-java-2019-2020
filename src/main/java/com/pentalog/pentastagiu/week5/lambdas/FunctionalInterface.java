package com.pentalog.pentastagiu.week5.lambdas;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    public static final int x = 12;

    abstract void alandalaPortocala(int param);

    default void defaultMethod() {
        System.out.println("Hello");
    }
}

package com.pentalog.pentastagiu.homework5;

@FunctionalInterface
public interface Calculator<T extends Number> {
    T calculate(T a, T b);
}

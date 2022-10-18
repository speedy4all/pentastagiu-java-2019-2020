package com.pentalog.pentastagiu.homework5.employees.generator;

import java.util.List;

public interface Generator<T> {
    T generate();
    List<T> generateList();
}

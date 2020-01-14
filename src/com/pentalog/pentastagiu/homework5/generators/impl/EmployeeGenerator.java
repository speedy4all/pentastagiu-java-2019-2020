package com.pentalog.pentastagiu.homework5.generators.impl;

import com.pentalog.pentastagiu.homework5.employees.Employee;
import com.pentalog.pentastagiu.homework5.exceptions.IllegalMaxEmployeeGeneratorException;
import com.pentalog.pentastagiu.homework5.generators.Generator;
import com.pentalog.pentastagiu.homework5.utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeGenerator implements Generator<Employee> {

    private static String[] names = {"CHRIS MAN", "JOE WOMAN", "DANIEL NOTEBOOK", "SORESEN DA", "CHRIS A","JOE B"};
    private int maxLength;

    public EmployeeGenerator(int maxLength) {
        if (maxLength <= 0) {
            throw new IllegalMaxEmployeeGeneratorException("Numarul de generare nu poate fi <= 0");
        }
        this.maxLength = maxLength;
    }

    @Override
    public Employee generate() {
        return new Employee(names[RandomUtils.getRandomIntInLimit(names.length) - 1], RandomUtils.getRandomIntInInterval(70,16));
    }

    @Override
    public List<Employee> generateList() {
        List<Employee> employees = new ArrayList<>();
        int number = maxLength;
        while (number != 0) {
            employees.add(generate());
            number--;
        }
        return employees;
    }
}

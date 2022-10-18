package com.pentalog.pentastagiu.homework5.employees.generator;

import com.pentalog.pentastagiu.homework5.employees.domain.Employee;
import com.pentalog.pentastagiu.homework5.employees.exeptions.IllegalEmployeeNumberException;

import java.util.ArrayList;
import java.util.List;

public class GeneratorOfEmployees implements Generator<Employee> {

    private static String[] names = {"Ana Maria", "Ion Zapada", "Gica Duru", "Scufita Rosie", "Lupul Bun", "Bunica Rea"};
    private int maxLength;

    public GeneratorOfEmployees(int maxLength) {
        if (maxLength <= 0) {
            throw new IllegalEmployeeNumberException("Number of employees has to differ from '0' and not negative!");
        }
        this.maxLength = maxLength;
    }

    @Override
    public Employee generate() {
        return new Employee(names[Randomize.getRandomIntInLimit(names.length) - 1], Randomize.getRandomIntInInterval(90, 12));
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
package com.pentalog.pentastagiu.homework5.employees.domain;

import com.pentalog.pentastagiu.homework5.employees.exeptions.IllegalAgeException;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        if (name == null || age <= 0) {
            throw new IllegalAgeException("Please input a number that differs from '0'! ");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

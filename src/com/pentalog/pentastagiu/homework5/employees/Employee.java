package com.pentalog.pentastagiu.homework5.employees;

import com.pentalog.pentastagiu.homework5.exceptions.IllegalEmployeeArgumentException;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        if (name == null || age <= 0) {
            throw new IllegalEmployeeArgumentException("Numele nu poate fi null sau varsta nu poate fi < 0");
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}

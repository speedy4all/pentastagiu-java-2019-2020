package com.pentalog.pentastagiu.homework5.employees.main;

import com.pentalog.pentastagiu.homework5.employees.domain.Employee;
import com.pentalog.pentastagiu.homework5.employees.generator.Generator;
import com.pentalog.pentastagiu.homework5.employees.generator.GeneratorOfEmployees;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Generator<Employee> generator = new GeneratorOfEmployees(150);
        Map<Integer, Set<String>> employeeMap = new HashMap<>();
        generator.generateList()
                .forEach(employee -> addEmployee(employee, employeeMap));
        System.out.println(employeeMap);

        Employee newEmp = new Employee("Pinocchio", 45);
        Set<String> newEmpSet = new TreeSet<>();
        newEmpSet.add(newEmp.getName());
        employeeMap.put(newEmp.getAge(), newEmpSet);

        employeeMap.keySet()
                .stream()
                .filter(age -> age == newEmp.getAge())
                .findAny()
                .ifPresent(age -> System.out.println(employeeMap.get(age)));

        employeeMap.values()
                .stream()
                .map(strings -> strings.iterator().next())
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }

    private static void addEmployee(Employee employee, Map<Integer, Set<String>> employeeMap) {
        Set<String> employeeSet = employeeMap.get(employee.getAge());
        if (employeeSet != null) {
            employeeSet.add(employee.getName());
        } else {
            employeeSet = new TreeSet<>();
            employeeSet.add(employee.getName());
            employeeMap.put(employee.getAge(), employeeSet);
        }
    }
}


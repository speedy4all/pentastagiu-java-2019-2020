package com.pentalog.pentastagiu.homework5;

import com.pentalog.pentastagiu.homework5.employees.Employee;
import com.pentalog.pentastagiu.homework5.generators.Generator;
import com.pentalog.pentastagiu.homework5.generators.impl.CirclesGenerator;
import com.pentalog.pentastagiu.homework5.generators.impl.EmployeeGenerator;
import com.pentalog.pentastagiu.homework5.generators.impl.StringGenerator;
import com.pentalog.pentastagiu.homework5.numbers.Computation;
import com.pentalog.pentastagiu.homework5.shapes.Circle;

import java.util.*;
import java.util.stream.Collectors;

public class HomeworkApp {
    public static void main(String[] args) {
        System.out.println("=== PB1 ===");
        PB1();

        System.out.println("=== PB2 ===");
        PB2();

        System.out.println("=== PB3 ===");
        PB3();

        System.out.println("=== PB4 ===");
        System.out.println(computations(3, 5, ((firstNumber, secondNumber) -> firstNumber.intValue() * secondNumber.intValue())));
        System.out.println(computations(10, 5, ((firstNumber, secondNumber) -> firstNumber.intValue() - secondNumber.intValue())));
        System.out.println(computations(3, 2, ((firstNumber, secondNumber) -> {
            if (secondNumber.intValue() != 0) {
                return firstNumber.intValue() / secondNumber.intValue();
            } else {
                return null;
            }
        })));
    }

    private static void PB1() {
        Generator<Circle> generator = new CirclesGenerator(65);
        generator.generateList()
                .stream()
                .peek(System.out::println)
                .map(Circle::getArea)
                .forEach(System.out::println);
    }

    private static void PB2() {
        Generator<String> generator = new StringGenerator(100);
        Set<String> stringsSet = new HashSet<>(generator.generateList());
        Iterator<String> iterator = stringsSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=== FOR ITERATOR ===");
        for (String word : stringsSet) {
            System.out.println(word);
        }
        String result = stringsSet.stream()
                .map(String::toUpperCase)
                .filter(string -> string.length() > 2)
                .collect(Collectors.joining(", ", "This are the results: ", " Thank you!"));
        System.out.println(result);
    }

    private static void PB3() {
        Generator<Employee> generator = new EmployeeGenerator(100);
        Map<Integer, Set<String>> employeeMap = new HashMap<>();
        generator.generateList()
                .forEach(employee -> addEmployeeToMap(employee, employeeMap));
        System.out.println(employeeMap);

        Employee newEmp = new Employee("A", 67);
        Set<String> newEmpSet = new TreeSet<>();
        newEmpSet.add(newEmp.getName());
        employeeMap.put(newEmp.getAge(), newEmpSet);

        employeeMap.keySet()
                .stream()
                .filter(age -> age == newEmp.getAge())
                .findAny()
                .ifPresent(age -> System.out.println(employeeMap.get(age)));

        employeeMap.entrySet()
                .stream()
                .map(entrySet -> entrySet.getValue().iterator().next())
                .sorted(String::compareTo)
                .forEach(System.out::println);


    }

    private static void addEmployeeToMap(Employee employee, Map<Integer, Set<String>> employeeMap) {
        Set<String> employeeSet = employeeMap.get(employee.getAge());
        if (employeeSet != null) {
            employeeSet.add(employee.getName());
        } else {
            employeeSet = new TreeSet<>();
            employeeSet.add(employee.getName());
            employeeMap.put(employee.getAge(), employeeSet);
        }
    }

    private static Number computations(Number firstNumber, Number secondNumber, Computation computation) {
        return computation.operation(firstNumber, secondNumber);
    }
}

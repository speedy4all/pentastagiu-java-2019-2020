package com.pentalog.pentastagiu.homework5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeworkWeek5App {
    public static void main(String[] args) {

        //ex 1

        List<Double> circle = new ArrayList<>();

        double rand = Math.random();
        while (rand > 0.01) {
            circle.add(rand);
            rand = Math.random();
        }

        for (int i = 0; i < circle.size(); i++) {
            System.out.println(circle.get(i) * circle.get(i) * Math.PI);
        }

        System.out.println("*********************");

        // ex2
        Set<String> mySet = new HashSet<>();
        mySet.addAll(Arrays.asList("Blue", "Orange", "Red", "Yellow", "Pink", "Black", "Green", "White"));

        System.out.println("Iterator: ");
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("For: ");
        for (String s : mySet) {
            System.out.print(" " + s);
        }

        System.out.println();
        Set<String> collectedStr = Stream.of("mission", "adventure", "intuition", "circle", "prohibition", "coalition")
                .filter(str -> {
                    return str.endsWith("ion");
                })
                .map(str -> {
                    return str.toUpperCase();
                })
                .collect(Collectors.toSet());

        System.out.println("This are the results: " + collectedStr + ". Thank you!");

        System.out.println("***********************");

        //ex 3

        SortedMap<Integer, SortedSet<String>> employees = new TreeMap<>();

        SortedSet<String> names20 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        names20.add("Viorel");
        names20.add("Adelina");
        names20.add("Cristina");

        SortedSet<String> names21 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        names21.add("Anca");
        names21.add("Mihnea");
        names21.add("Miruna");

        SortedSet<String> names22 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        names22.add("Mihai");
        names22.add("Carmen");
        names22.add("Irina");

        SortedSet<String> names23 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        names23.add("Valentin");
        names23.add("Ioana");
        names23.add("Ramona");

        employees.put(20, names20);
        employees.put(21, names21);
        employees.put(22, names22);
        employees.put(23, names23);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a new age: ");
        Integer newAge = 0;
        String name;
        SortedSet<String> newNames = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        try {
            newAge = scanner.nextInt();
            if (employees.containsKey(newAge)) {
                System.out.println("Error! This age already exists in our database!");
                return;
            } else {
                if (newAge < 15 || newAge > 90) {
                    System.out.println("Employees with this age are not allowed!");
                    return;
                } else {
                    employees.put(newAge, null);
                    System.out.println("Please enter the names of the employees:");
                    name = scanner.nextLine();
                    while (!name.equals("null")) {
                        name = scanner.nextLine();
                        newNames.add(name);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Wrong format!! Just numbers!");
        }
        newNames.remove("null");
        employees.put(newAge, newNames);
        //System.out.println(employees);

        for (Integer key : employees.keySet()) {
            if (employees.get(newAge) == null) {
                System.out.println("No employees found with an age of " + newAge);
                break;
            } else System.out.println(employees.get(newAge));
            break;
        }

        for (SortedSet str : employees.values()) {
            System.out.println(str.first());
        }

        System.out.println("**************************");

        //ex 4

        FunctionalInterfaceOperation additionInt = (x, y) -> System.out.println(x.intValue() + y.intValue());
        FunctionalInterfaceOperation additionDouble = (x, y) -> System.out.println(x.doubleValue() + y.doubleValue());
        FunctionalInterfaceOperation additionLong = (x, y) -> System.out.println(x.longValue() + y.longValue());

        FunctionalInterfaceOperation multiplicationInt = ((x, y) -> System.out.println(x.intValue() * y.intValue()));
        FunctionalInterfaceOperation multiplicationDouble = ((x, y) -> System.out.println(x.doubleValue() * y.doubleValue()));
        FunctionalInterfaceOperation multiplicationL = ((x, y) -> System.out.println(x.longValue() * y.longValue()));

        FunctionalInterfaceOperation substractionInt = ((x, y) -> System.out.println(x.intValue() - y.intValue()));
        FunctionalInterfaceOperation substractionInt2 = ((x, y) -> System.out.println(y.intValue() - x.intValue()));
        FunctionalInterfaceOperation substractionDouble = ((x, y) -> System.out.println(x.doubleValue() - y.doubleValue()));

        FunctionalInterfaceOperation divisionInt = ((x, y) -> System.out.println(x.intValue() / y.intValue()));
        FunctionalInterfaceOperation divisionInt2 = ((x, y) -> System.out.println(y.intValue() / x.intValue()));
        FunctionalInterfaceOperation divisionDouble = ((x, y) -> System.out.println(x.doubleValue() / y.doubleValue()));

        System.out.println("Addition ints: ");
        operate(10, 23, additionInt);

        System.out.println("Addition double: ");
        operate(23.5, 198.4, additionDouble);

        System.out.println("Addition long:");
        operate(8888L, 10000L, additionLong);

        System.out.println("Multiplication int: ");
        operate(87, 23, multiplicationInt);

        System.out.println("Multiplication double: ");
        operate(33.5, 12.7, multiplicationDouble);

        System.out.println("Multiplication long: ");
        operate(7888, 333,multiplicationL);

        System.out.println("Substraction int first parameter - second parameter: ");
        operate(40, 23, substractionInt);

        System.out.println("Substraction int second parameter - first parameter: ");
        operate(40, 22, substractionInt2);

        System.out.println("Substraction double: ");
        operate(99.9, 34.5, substractionDouble);

        System.out.println("Division int first parameter / second parameter: ");
        operate(34, 2, divisionInt);

        System.out.println("Division int second parameter / first parameter: ");
        operate(34, 2, divisionInt2);

        System.out.println("Division double: ");
        operate(445.6, 34.7, divisionDouble);
    }

    public static void operate(Number n1, Number n2, FunctionalInterfaceOperation functionalInterfaceOperation) {
        functionalInterfaceOperation.operation(n1, n2);
    }

}

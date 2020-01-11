package com.pentalog.pentastagiu.homework5;

import java.util.*;
import java.util.stream.Collectors;

public class HomeworkApp {

    public static void testCircleApp() {
        List<Circle> circles = new ArrayList<>();
        double randomRadius;
        do {
            randomRadius = Math.random();
            circles.add(new Circle(randomRadius));
        } while (randomRadius >= 0.01);
        circles.forEach(p -> System.out.println(p.calculateArea()));
    }

    public static void testSetApp() {
        Set<String> strings = new HashSet<>();
        strings.addAll(Arrays.asList("write", "read", "write", "fragment", "book", "dictionary", "open", "iterate", "java"));

        //Iterator
        Iterator<String> iterator = strings.iterator();
        iterator.forEachRemaining(p -> System.out.print(p + " "));
        System.out.println();

        //For
        for (String string : strings)
            System.out.print(string + " ");
        System.out.println();

        //Stream
        String result =
                strings.stream()
                        .map(p -> p.toUpperCase())
                        .filter(p -> p.length() < 5)
                        .collect(Collectors.joining(", ", "This is the result: ", ". Thank you!"));
        System.out.println(result);
    }

    public static Map<Integer, SortedSet<String>> initiateEmployeeMap() {
        Map<Integer, SortedSet<String>> employeeMap = new HashMap<>();
        SortedSet<String> employeeNamesWith22Years = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        employeeNamesWith22Years.addAll(Arrays.asList("Bogdan", "Ioana", "Cosmin", "Rares"));
        SortedSet<String> employeeNamesWith23Years = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        employeeNamesWith23Years.addAll(Arrays.asList("George", "Alex", "Adelina", "Floris"));
        employeeMap.put(22, employeeNamesWith22Years);
        employeeMap.put(23, employeeNamesWith23Years);
        return employeeMap;
    }

    public static void putKeyValueInMap(Map<Integer, SortedSet<String>> map, Integer age, String... names) {
        if (age < 0) return;
        if (map.containsKey(age) == false) {
            SortedSet<String> employeeNamesWithAgeYears = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
            employeeNamesWithAgeYears.addAll(Arrays.asList(names));
            map.put(age, employeeNamesWithAgeYears);
        } else if (map.containsKey(age) && map.get(age) == null) {
            SortedSet<String> employeeNamesWithAgeYears = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
            employeeNamesWithAgeYears.addAll(Arrays.asList(names));
            map.put(age, employeeNamesWithAgeYears);
        } else {
            SortedSet<String> mapValue = map.get(age);
            for (String name : names)
                mapValue.add(name);
        }
    }

    public static void testEmployeeApp() {
        //Declare and instantiate map and add few key - value pairs
        Map<Integer, SortedSet<String>> employeeMap = initiateEmployeeMap();

        //Add a value for an absent key in the Map
        putKeyValueInMap(employeeMap, 24, "Ivan", "Ramona", "Diana");

        //Display employee names by key in the map
        Set<Integer> employeeAgeKeys = employeeMap.keySet();
        for (Integer age : employeeAgeKeys) {
            System.out.printf("Employees for age %d are: ", age);
            employeeMap.get(age).forEach(p -> System.out.print(p + " "));
            System.out.println();
        }

        //Display first Name for each key in map
        for (Map.Entry<Integer, SortedSet<String>> entry : employeeMap.entrySet())
            System.out.printf("%d - %s\n", entry.getKey(), entry.getValue().first());
    }

    public static Number operate(Number n1, Number n2, FunctionalInterface fi) {
        return fi.operation(n1, n2);
    }

    public static void testFunctionalInterface() {
        FunctionalInterface add = (p1, p2) -> p1.doubleValue() + p2.doubleValue();
        FunctionalInterface subtract = (p1, p2) -> p1.doubleValue() - p2.doubleValue();
        FunctionalInterface multiply = (p1, p2) -> p1.doubleValue() * p2.doubleValue();
        FunctionalInterface divide = (p1, p2) -> p1.doubleValue() / p2.doubleValue();

        Number n1 = 14.35d;
        Number n2 = 2.5f;
        System.out.printf("%f + %f = %f\n", n1, n2, operate(n1, n2, add));
        System.out.printf("%f - %f = %f\n", n1, n2, operate(n1, n2, subtract));
        System.out.printf("%f * %f = %f\n", n1, n2, operate(n1, n2, multiply));
        System.out.printf("%f / %f = %f\n", n1, n2, operate(n1, n2, divide));
    }

    public static void main(String[] args) {
        //testCircleApp();
        //testSetApp();
        //testEmployeeApp();
        testFunctionalInterface();
    }
}

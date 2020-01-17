package com.pentalog.pentastagiu.homework5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeworkApp {
    public static void main(String[] args) {
        generateCircles().forEach(circle -> System.out.println("Area: " + circle.calculateArea()));
        printCountries();
        printEmployees();
        System.out.println("Addition: " + calculate(10.0, 15.0, (a, b) -> a + b));
        System.out.println("Subtraction: " + calculate(10.0, 15.0, (a, b) -> a - b));
        System.out.println("Multiplication: " + calculate(10.0, 15.0, (a, b) -> a * b));
        System.out.println("Division: " + calculate(10.0, 15.0, (a, b) -> a / b));

    }

    public static List<Circle> generateCircles() {
        List<Circle> circles = new ArrayList<>();
        double rand = Math.random();

        do {
            double radius = rand * 100;
            Circle circle = new Circle(radius);
            circles.add(circle);
            rand = Math.random();

        } while (rand >= 0.01);

        return circles;
    }

    public static void printCountries() {
        Set<String> countries = Stream.of("Bahamas", "Turkey",
                "Panama", "Norway", "Belarus", "Australia", "Greece",
                "Benin", "Estonia", "Bolivia")
                .collect(Collectors.toCollection(HashSet::new));

        printCountriesWithIterator(countries);
        printCountriesWithForEach(countries);
        System.out.println(filterCountriesWithStream(countries));
    }

    public static void printEmployees() {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(24, "Smith");
        employees.put(30, "Doe");
        employees.put(22, "Rose");
        employees.put(31, "Adam");
        employees.put(45, "Kaitlyn");
        for (Integer key : employees.keySet()) {
            System.out.println("Employees name: " + employees.get(key));
        }

        employees.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .findAny()
                .ifPresent(employee -> System.out.println("First employee: " + employee.getValue()));
    }

    public static <T extends Number> T calculate(T a, T b, Calculator<T> calculator) {
        return calculator.calculate(a, b);
    }

    private static void printCountriesWithIterator(Set<String> countries) {
        Iterator iterator = countries.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    private static String filterCountriesWithStream(Set<String> countries) {
        return countries.stream()
                .map(String::toUpperCase)
                .filter(country -> !country.startsWith("B"))
                .collect(Collectors.joining(",", "This are the results: ", " Thank you!"));
    }

    private static void printCountriesWithForEach(Set<String> countries) {
        for (String country : countries) {
            System.out.println(country);
        }
    }
}

package com.pentalog.pentastagiu.homework5;

import java.util.*;
import java.util.logging.LoggingPermission;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeworkApp {
    public static void main(String[] args) {
        System.out.println("Circle app");
        circleListApp();
        System.out.println("String set app");
        stringSetApp();
        System.out.println("Employees map app");
        employeesMapApp();
        System.out.println("Functional interface app");
        NumberInterface firstTry = (Number nr1, Number nr2) -> {
            return nr1.intValue()*nr2.intValue()+nr1.intValue()/nr2.intValue()-nr2.intValue();
        };
        NumberInterface secondTry = (Number nr1, Number nr2) -> {
            return nr2.intValue()*nr1.intValue()+nr2.intValue()/nr1.intValue()-nr1.intValue();
        };
        NumberInterface thirdTry = (Number nr1, Number nr2) -> {
            return nr1.intValue()*nr1.intValue()+nr1.intValue()/nr1.intValue()-nr2.intValue();
        };
        System.out.print("1: ");
        System.out.println(operate(2, 1, firstTry));
        System.out.print("2: ");
        System.out.println(operate(1, 2, secondTry));
        System.out.print("3: ");
        System.out.println(operate(5, 4, thirdTry));
    }

    private static void circleListApp() {
        List<Circle> circleList = new ArrayList<>();
        double randomRadius=1;
        while(randomRadius>0.01) {
            randomRadius = Math.random();
            circleList.add(new Circle(randomRadius));
        }
        for(Circle circle : circleList) {
            System.out.println(circle.getArea());
        }
    }

    private static void stringSetApp(){
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Ana");
        stringSet.add("are");
        stringSet.add("mere");
        stringSet.add("Andrei");
        stringSet.add("nu are");
        stringSet.add("pere");

        System.out.println("Iterator");
        Iterator iterator = stringSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("For iteration");
        for(String string : stringSet) {
            System.out.println(string);
        }

        System.out.println("Stream");
        String strings = stringSet
                .stream()
                .map(elem -> elem.toLowerCase())
                .filter(elem -> elem.contains("are"))
                .collect(Collectors.joining(", ", "This are the results ", ". Thank you!"));
        System.out.println(strings);
    }

    private static void employeesMapApp(){
        Map<Integer, List<String>> employeeMap = new HashMap<>();
        employeeMap.put(34, Arrays.asList("Gheorghe", "Ioana", "Marian"));
        employeeMap.put(25, Arrays.asList("Cristian", "Ion", "Mara"));
        employeeMap.put(30, Arrays.asList("Raluca"));

        List<String> employeesWith20 =  employeeMap.get(20);
        if(employeesWith20 == null){
            employeesWith20 = new ArrayList<>();
        }
        employeesWith20.add("Marius");

        Set<Integer> employeesKeySet = employeeMap.keySet();

        System.out.print("Key set: ");
        for(Integer key : employeesKeySet) {
            System.out.print(employeeMap.get(key)+ " ");
        }

        System.out.println();

        System.out.print("Entry set: ");
        Set<Map.Entry<Integer, List<String>>> employeesEntrySet = employeeMap.entrySet();

        String firstPerson=employeeMap.get(30).get(0);
        for(Map.Entry<Integer, List<String>> entries : employeesEntrySet) {
            List<String> names = entries.getValue();
            for(String name : names) {
                if(name.compareTo(firstPerson)<0)
                    firstPerson=name;
            }
        }

        System.out.println(firstPerson);
    }

    public static int operate(Number nr1, Number nr2, NumberInterface numberInterface) {
        return numberInterface.operationWith2Numbers(nr1, nr2);
    }

}

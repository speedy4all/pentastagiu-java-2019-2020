package com.pentalog.pentastagiu.homework4.MapOfEmployees;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Map<Integer, List<String>> Employees = new HashMap<>();
        Employees.put(30, Arrays.asList("Andrei","Flavius"));
        Employees.put(35,Collections.singletonList("Marius"));
        int newKey=20;
        if(Employees.containsKey(newKey)) {
        }
        else
        {
            Employees.put(newKey,Collections.singletonList("Marcian"));
        }
        Set<Integer> EmployeesKeySet = Employees.keySet();
        for(Integer iterator:EmployeesKeySet)
        {
            System.out.println(Employees.get(iterator));
        }

        /*Map<Integer,List<String>> sortedByCount = Employees.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())  /* nu stiu de ce nu ma lasa sa fac comparing*/
                 /* .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));  */
    }
}

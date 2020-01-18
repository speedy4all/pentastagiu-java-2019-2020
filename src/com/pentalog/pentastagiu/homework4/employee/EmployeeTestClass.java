package com.pentalog.pentastagiu.homework4.employee;

import java.util.*;

public class EmployeeTestClass {
    static Integer newEmployeeAge;
    static String newEmployeeName;
    static Boolean newName=true;
    static Integer userOption;

    public static void main(String[] args) {

        Map<Integer, List<String>> employees=new HashMap<>();
        employees.put(30, Arrays.asList("Codrescu Mihaela", "Axinte Dana"));
        employees.put(35, new ArrayList<>());
        employees.put(40, null);


        List<String> employeesWith35=employees.get(35);
        List<String> employeesWith40=employees.get(40);


        if(employeesWith35==null || employeesWith40==null) {
            employeesWith35=new ArrayList<>();
            employeesWith40=new ArrayList<>();
        }

        employeesWith35.addAll(Arrays.asList("Mihaila Adrian", "Cristea Ciobanu", "Tudose Elena"));
        employeesWith40.addAll(Arrays.asList("Niculita Daniel", "Octav Andrei"));

        employees.put(35,employeesWith35);
        employees.put(40, employeesWith40);


        //ADDING NEW KEY AND NAMES
        addingAgeToMap(newEmployeeAge, employees);


        //PRINTING NAMES WITH KEY SET
        System.out.println("------------------------------------------------------");
        System.out.println("Display names with key set");
        Set<Integer> employeesKeySet=employees.keySet();
        for(Integer employeeAge:employeesKeySet) {
            System.out.println("Age: " + employeeAge + " names: " + employees.get(employeeAge));
        }


        //PRINTING NAMES WITH ENTRY SET ALPHABETICALLY
        System.out.println("------------------------------------------------------");
        Set<Map.Entry<Integer, List<String>>> entries=employees.entrySet();
        for(Map.Entry<Integer, List<String>> entry: entries) {
            Collections.sort(entry.getValue());
            String name=entry.getValue().get(0);
            System.out.println("Age: " + entry.getKey() + " Names: " + name);

        }
    }

    //ADDING KEY AND NAMES TO MAP
    public static void addingAgeToMap(Integer newEmployeeAge, Map<Integer, List<String>> employees) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a age to verify  if exists");
        newEmployeeAge=scan.nextInt();
        scan.nextLine();

        if(employees.containsKey(newEmployeeAge)) {
            System.out.println("This age already exists");
        }else {
            System.out.println("This age is not registered. The age was added to your list");
            employees.put(newEmployeeAge, new ArrayList<>());

            while(newName==true) {
                System.out.println("------------------------------------------------------");
                System.out.println("Enter the name of the employee with this age");
                newEmployeeName=scan.nextLine();

                List<String> newEmployees=employees.get(newEmployeeAge);
                newEmployees.add(newEmployeeName);
                employees.put(newEmployeeAge, newEmployees);
                System.out.println("------------------------------------------------------");
                System.out.println("New employee name was added\nAdd new employee name to this age?\n1 - YES\n2 - NO");

                userOption=scan.nextInt();
                scan.nextLine();
                if(userOption==1) {
                    newName=true;
                }
                else {
                    System.out.println("You finished the process of adding names");
                    newName=false;
                }
            }
        }
    }
}
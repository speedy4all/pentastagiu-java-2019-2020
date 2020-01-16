package homework5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEmployees {
    public static void main(String[] args) {

        Map<Integer, Employees> list = new HashMap<>();
        list.put(18, new Employees("Maria", "Ionescu"));
        list.put(19, new Employees("Ion", "Avramescu"));
        list.put(20, new Employees("Nicoleta", "Miclaus"));
        list.put(21, new Employees("Silviu", "Mateius"));
        list.put(22, new Employees("Nelu", "Mihai"));

        //name sorted in alphabetical order
        System.out.println("Names sorted in alphabetical order: ");
        list.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e -> {
                    Employees value =  e.getValue();
                    System.out.println(  value.getFirstName());
                });
        System.out.println("Display avalaible keys: ");
        list.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> {
                    Integer value =  e.getKey();
                    System.out.println(value);
                });

        //Iterate over the map’s entrySet and displays the first person alphabetically
        list.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .limit(1)
                .forEach(e -> {
                    Employees value = e.getValue();
                    System.out.println("Displays the first person alphabetically: " + value.getSecondName());
                });

        //Add values for a key that is not yet present in the map
        list.put(23, null);
        Employees employees23 = list.get(23);
        if (employees23==null){
            employees23= new Employees();
            list.put(23, employees23);
        }
        employees23 = new Employees("Zusana", "Maria");
        list.put(23, employees23);
        System.out.println("Employee add at key: 23 "  +  list.get(23).getFirstName() + " " + list.get(23).getSecondName());

        Set<Integer> nrOfKeys = list.keySet();
        System.out.println("We have " + nrOfKeys + " of keys.");

        System.out.println("We want to know the employees of 21,22 and 23 of age.");
        for (Map.Entry<Integer, Employees> sortedKeys : list.entrySet()){
            Integer keys = sortedKeys.getKey();
            Employees names = sortedKeys.getValue();
            if (keys> 20 && keys <= 23){
                System.out.println("Age: " + keys + " " + names);
            }
        }
    }
}

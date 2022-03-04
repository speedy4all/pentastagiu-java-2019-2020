package homework5;

import java.util.*;
import java.util.stream.Collectors;

public class SetOfStrings {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>(Arrays.asList("Camera", "dormitor", "bucatarie", "baie", "balcon", "Terasa"));
        //iterator
        System.out.print("Print out the elements:  ");
        for (String next : s) {
            System.out.print(next + ", ");
        }
        // use a for to iterate over element
        System.out.println("\nApartament: ");
        for (String showElem : s) {
            System.out.println("- " + showElem);
        }

        Object replace = s.stream()
                .filter(elem -> elem.matches("baie"))
                .map(elem -> elem.replace("baie", "zacuzi"))
                .collect(Collectors.toSet());
        System.out.println("Collected items : " + replace);

        String collected = s.stream()
                .map(elem -> Character.toUpperCase(elem.charAt(0))+elem.substring(1))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(", " , "This are the results: ",". Thank you."));
        System.out.println(collected);
    }
}

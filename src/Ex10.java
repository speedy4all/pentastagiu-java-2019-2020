import java.util.*;

public class Ex10 {
/* Write a program that test if a given String contains another String.

    For example
    Given the following base String “Hello java world” and the target test String “java” the output should be TRUE
*/

    public static void main(String[] args) {

        String sir1 = "Hello world";
        String sir2 = "orld";
        System.out.println(testing(sir1, sir2));

        String sir3 = "My string";
        String sir4 = "andra";
        System.out.println(testing(sir3, sir4));

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul sir:");
        String string1 = sc.nextLine();
        System.out.println("Introduceti al 2-lea sir:");
        String string2 = sc.nextLine();

        System.out.println(testing(string1, string2));
        sc.close();

    }
    public static boolean testing (String sir1, String sir2) {
        if (sir1.contains(sir2)) {
            return true;
        } else {
            return false;
        }
    }
}

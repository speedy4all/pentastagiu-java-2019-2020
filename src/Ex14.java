import java.util.*;

public class Ex14 {
//Write a program that will count how many times a character appears in a String
//
//For example
//Given the string “Hello java world” and the target character ‘a’ the output should be 2
//(since ‘a’ appears twice in “Hello java world”)

    public static void main(String[] args) {

        String string = "Hello java world";
        char letter = 'a';
        int  count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println(count);

        Scanner sc = new Scanner(System.in);

        System.out.println("introduceti un string: ");
        String input = sc.nextLine();

        int count2 = 0;
        System.out.println("Introduceti un char: ");
        char someChar = sc.next().charAt(0);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == someChar) {
                count2++;
            }
        }
        System.out.println("Litera: " + someChar + " apare de " + count2 + " ori");





    }
}

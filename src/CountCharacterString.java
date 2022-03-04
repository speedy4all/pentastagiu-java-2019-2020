// Write a program that will count how many times a character appears in a String.
import java.util.Scanner;

public class CountCharacterString {

        public static void main(String[] args) {
            String string = "Hello Java world";
            int j = 0;

            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == 'l') {
                    j++;
                }
            }
            System.out.println(j);
        }
    }
}

//write a program that will count how many times a character appears in a string
import java.util.Scanner;

public class Tema1Problema11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti propozitia: ");
        String prop = sc.nextLine();

        System.out.println("Introduceti caracterul cautat: ");
        char target = sc.next().charAt(0);

        int lastIndex = 0;
        int count = 0;

        for (int i = 0; i <prop.length(); i++) {
            if (prop.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Numarul de aparitii este: " + count);
    }
}

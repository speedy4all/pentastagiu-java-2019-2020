//write a program that will test if a string ands with another string
import java.util.Scanner;

public class Tema1Problema12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti propozitia: ");
        String prop = sc.nextLine();

        System.out.println("Introduceti fragmentul cautat: ");
        String target = sc.nextLine();

        if (prop.lastIndexOf(target)==(prop.length()-target.length())){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }

}

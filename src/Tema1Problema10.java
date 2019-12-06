//write a program that test whether a given string contains another string
import java.util.Scanner;

public class Tema1Problema10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti propozitia: ");
        String prop = sc.nextLine();

        System.out.println("Introduceti fragmentul cautat: ");
        String target = sc.nextLine();

        if (prop.indexOf(target)==-1){
            System.out.println("FALSE");
        }
        else{
            System.out.println("TRUE");
        }

    }
}

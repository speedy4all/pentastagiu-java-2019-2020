//write a program that will return a different string representing the alphabet index of each letter
import java.util.Arrays;
import java.util.Scanner;

public class Tema1Problema13 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti cuvantul: ");
        String cuvant = sc.nextLine();

        int alphabetIndex[]=new int[cuvant.length()];

        for (int i=0; i<cuvant.length(); i++) {
            alphabetIndex[i]= (int)cuvant.charAt(i);
        }
        System.out.println("Reprezentarea in cod ASCII este:");
        System.out.println(Arrays.toString(alphabetIndex));
    }
}

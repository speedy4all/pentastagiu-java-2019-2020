//write a java program that will return the index of a target element
import java.util.Arrays;
import java.util.Scanner;

public class Tema1Problema8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente al sirului");
        int length = sc.nextInt();

        int a[] = new int[length];

        System.out.println("Scrieti elementele sirului:");
        for (int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Introduceti elementul cautat");
        int targetElement = sc.nextInt();

        for (int i=0; i<length; i++){
            if (a[i]==targetElement){
                System.out.println("Elementul cautat este pe pozitia :"+(i+1));
            }
        }
    }
}

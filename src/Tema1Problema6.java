//write a java program that will concatenate 2 arrays

import java.util.Arrays;
import java.util.Scanner;

public class Tema1Problema6 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente al primului sir");
        int lengthFirstArray = sc.nextInt();
        System.out.println("Introduceti numarul de elemente al celui de-al doilea sir");
        int lengthSecondArray = sc.nextInt();

        int a[] = new int[lengthFirstArray];
        int b[] = new int[lengthSecondArray];

        System.out.println("Scrieti elementele primuluui sir:");
        for (int i = 0; i < lengthFirstArray; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Scrieti elementele celui de-al doilea sir:");
        for (int i = 0; i < lengthSecondArray; i++) {
            b[i] = sc.nextInt();
        }

        int c[] = new int[lengthFirstArray + lengthSecondArray];

        for (int i=0; i<lengthFirstArray; i++){
            c[i]=a[i];
        }
        for (int j=0; j<lengthSecondArray; j++){
            c[lengthFirstArray+j]=b[j];
        }
        System.out.println("Sirul este:");
        System.out.println(Arrays.toString(c));
    }
}

//write a program that will test whether 2 arrays are equal

import java.util.Arrays;
import java.util.Scanner;

public class Tema1Problema5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente al primului sir");
        int lengthFirstArray = sc.nextInt();
        System.out.println("Introduceti numarul de elemente al celui de-al doilea sir");
        int lengthSecondArray = sc.nextInt();

        int a[] = new int[lengthFirstArray];
        int b[] = new int[lengthSecondArray];

        System.out.println("Scrieti elementele primuluui sir:");
        for (int i=0; i<lengthFirstArray; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Scrieti elementele celui de-al doilea sir:");
        for (int i=0; i<lengthSecondArray; i++){
            b[i]=sc.nextInt();
        }

        boolean test=true;

        if (lengthFirstArray!=lengthSecondArray){
            test=false;
        }
        else{
            for (int i=0; i<lengthFirstArray; i++){
                if (a[i]!=b[i]){
                    test=false;
                    break;
                }
            }
        }

        if (test==true) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }


}

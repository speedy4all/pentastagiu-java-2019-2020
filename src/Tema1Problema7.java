//write a java program that will return the minimum, maximum and average value of an array

import java.util.Arrays;
import java.util.Scanner;

public class Tema1Problema7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente al sirului");
        int length = sc.nextInt();

        int a[] = new int[length];

        System.out.println("Scrieti elementele sirului:");
        for (int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }

        int min, max, suma;
        float media;

        if (a[0]<a[1]){
            min=a[0];
            max=a[1];
        }
        else {
            min=a[1];
            max=a[0];
        }
        suma=a[0]+a[1];

        for (int i=2; i<length; i++){
            if (a[i]<min){
                min=a[i];
            }
            if (a[i]>max){
                max=a[i];
            }
            suma+=a[i];
        }

        media=(float) suma/length;
        System.out.println("Minimul din sir este:"+min);
        System.out.println("Maximul din sir este:"+max);
        System.out.println("Media elementelor din sir este:"+media);
    }
}

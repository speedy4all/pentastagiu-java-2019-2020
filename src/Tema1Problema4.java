//write a Java program that will test whether the first ant the last element of an array are the same
import java.util.Arrays;
import java.util.Scanner;

public class Tema1Problema4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente al sirului");
        int length = sc.nextInt();

        int a[] = new int[length];

        System.out.println("Scrieti elementele sirului:");
        for (int i=0; i<length; i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Sirul este:");
        System.out.println(Arrays.toString(a));

        boolean test=true;
        if (a[0]!=a[length-1]){
            test=false;
            System.out.println("FALSE");
        }
        else {
            System.out.println("TRUE");
        }


    }
}

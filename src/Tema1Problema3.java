//write a program that will print the first x fibonacci numbers. Also calculate the average value
import java.util.Scanner;

public class Tema1Problema3 {

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);

        int numberOfFib;

        System.out.println("Introduceti primul numar:");
        numberOfFib = myInput.nextInt();

        int a[] = new int[numberOfFib];
        float media;

        a[0] = 1;
        a[1] = 1;
        System.out.print("1, 1, ");
        int suma = 2;
        int contorNumere = 2;
        for (int i = 2; i < numberOfFib; i++) {
            a[i] = a[i - 1] + a[i - 2];
            contorNumere++;
            suma += a[i];
            System.out.print(a[i] + ", ");
        }

        media = (float) suma / contorNumere;
        System.out.println("Media primelor " + numberOfFib + " numere din seria Fibonacci este: " + media);


    }
}

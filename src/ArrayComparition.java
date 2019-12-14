//Write a program that test whether 2 int arrays are equal.
//Equality in this case means that both arrays have the same number of elements
//an element on a specific index in first array is equal to the element on the same index in the second array.i
import java.util.Arrays;
import java.util.Scanner;

public class ArrayComparition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenght1;
        Sistem.out.println("Please enter the size of the array:");
        lenght1 = sc.nextInt();
        int[] a = new int[lenght1];
        Sistem.out.println("The elements of the array are:");
        for (int i = 0; i < lenght1; i++) {
            a[i] = sc.nextInt();
        }
        int lenght2;
        Sistem.out.println("Please enter the size of the array:");
        lenght2 = sc.nextInt();
        int[] b = new int[lenght2];
        Sistem.out.println("The elements of the array are:");
        for (int i = 0; i < lenght2; i++) {
            b[i] = sc.nextInt();
        }
        if (Arrays.equals(a, b)) {

            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

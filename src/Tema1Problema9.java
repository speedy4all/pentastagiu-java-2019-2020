//write a java program to find the number of even and odd integers in a given array of integers
import java.util.Scanner;

public class Tema1Problema9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente al sirului");
        int length = sc.nextInt();

        int a[] = new int[length];

        System.out.println("Scrieti elementele sirului:");
        for (int i = 0; i < length; i++) {
            a[i] = sc.nextInt();
        }

        int counterOdd=0;
        int counterEven=0;

        for (int i=0; i<length; i++){
            if (a[i]%2==0){
                counterEven++;
            }
            else {
                counterOdd++;
            }
        }

        System.out.println("Numarul de elemente pare este: "+counterEven);
        System.out.println("Numarul de elemente impare este: "+counterOdd);
    }
}

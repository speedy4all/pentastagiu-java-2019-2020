import java.util.*;

public class Ex7 {

    public static void main(String[] args) {
//Write a java program that will return the min, max and average values in a given array.
//
//For example
//GIven the following array [13,20,14,5,2,8] the output should be
//Max : 20
//Min : 2
//Average: 10.3
        int sir[] = {13, 20, 14, 5, 2, 8};
        Arrays.sort(sir);

        int min = sir[0];
        System.out.println("Minimum = "  + min);

        int max = sir[sir.length-1];
        System.out.println("Maximum = " + max);

        int suma = 0;

        for (int i = 0; i < sir.length; i++) {
            suma = suma + sir[i];

        }
        double average = suma / sir.length ;
        System.out.println("Average = " + average);

    }
}

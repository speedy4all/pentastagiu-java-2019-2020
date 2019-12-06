import java.util.*;
import java.io.*;

public class Ex3 {

    public static void main(String[] args) {

       /* Write a java program that will test whether the first and the last element of an int array are the same.
       We can assume the array has 2 or more elements.

                For example:
        For the following input [13,6,2,8,2,3] the output should be : FALSE
        For the following input [13,6,2,8,2,13] the output should be : TRUE
*/
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int sir[]= new int[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i < length; i++ ) {
            sir[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(sir));


        if (sir[0] == sir[sir.length - 1]) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        s.close();
    }
}





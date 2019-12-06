import java.util.*;


public class Ex6 {

//Write a java program that will concatenate 2 arrays.

    public static void main(String[] args) {
//Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing [1,2,3,4,5,6,7,8]
        int sir1[] = {1, 2, 3, 4};
        int sir2[] = { 5, 6, 7, 8};
        int sirNou[] = new int[sir1.length + sir2.length];
        System.arraycopy(sir1, 0, sirNou, 0, sir1.length);
        System.arraycopy(sir2, 0 , sirNou, sir1.length, sir2.length);

        System.out.println(Arrays.toString(sirNou));


    }
}

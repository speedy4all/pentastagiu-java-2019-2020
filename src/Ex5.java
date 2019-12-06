import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        /*
        Write a program that test whether 2 int arrays are equal. Equality in this case means
        that both arrays have the same number of elements an element on a specific index
        in first array is equal to the element on the same index in the second array.
       */

// For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
        int sir1[] = {1, 2, 3, 4};
        int sir2[] = {1, 2, 3, 4};

        if (Arrays.equals(sir1, sir2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

//For the following arrays [] and [] the output should be TRUE
        int sir3[] = {};
        int sir4[] = {};
        if (Arrays.equals(sir3, sir4)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

//For the following arrays [1,3,2] and [1,3] the output should be FALSE
        int sir5[] = {1, 3, 2};
        int sir6[] = {1, 3};
        if (Arrays.equals(sir5, sir6)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

//For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE
        int sir7[] = {1, 2, 3, 4};
        int sir8[] = {1, 2, 4, 3};
        if (Arrays.equals(sir7, sir8)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

// general
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente pt primul sir:");
        int input1 = sc.nextInt();
        int sirul1[] = new int[input1];

        System.out.println("Introduceti elementele primului sir: ");
        for (int i = 0; i < input1; i++) {
            sirul1[i] = sc.nextInt();
        }


        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente pt al 2-lea sir:");
        int input2 = sc.nextInt();
        int sirul2[] = new int[input2];

        System.out.println("Introduceti elementele pt al 2-lea sir: ");
        for (int i = 0; i < input2; i++) {
            sirul2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(sirul1));
        System.out.println(Arrays.toString(sirul2));

        if(Arrays.equals(sirul1, sirul2)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        sc.close();

    }
}


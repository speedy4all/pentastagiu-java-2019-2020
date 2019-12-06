import com.sun.deploy.security.SelectableSecurityManager;

import java.text.DecimalFormat;

public class Homework1 {

    static String output = "";

    //method to insert # between repetead char
    static void insert(String input,
                       int i) {
        output = output + input.charAt(i);


        if (i == input.length() - 1)
            return;


        if (input.charAt(i) == input.charAt(i + 1))
            output = output + '#';

        insert(input, i + 1);
    }

    static boolean isPalindrome(String str) {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters toc compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }


    public static void main(String[] args) {

//        //Write a program that will sum up all numbers from 0 up to a target number.
//        //For example, for an input number 5, result should be 15 (0+1+2+3+4+5)
//
        int max = 5;
        int sum = 0;

        int arr[] = new int[max];

        for (int x = 0; x < arr.length; x++) {
            arr[x] = x + 1;
        }

        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];

        System.out.println("Sum of first " + max + " numbers:" + sum);
//
//        //Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
//        //For example, for range numbers 1 to 100 output should be:
//        //
//        //Sum for range 1 to 100 : 5050
//        //Average for range 1 to 100 : 50.0
//
        int min2 = 1;
        int max2 = 100;
        int dif = max2 - min2;
        dif = dif + 1;


        int arr2[] = new int[dif];

        for (int x = 0; x < arr2.length; x++) {


            arr2[x] = min2 + x;
        }

//        for(int i=0;i<arr2.length;i++)    //length is the property of the array
//            System.out.println(arr2[i]);

        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++)
            sum2 = sum2 + arr2[i];

        System.out.println("Sum of range " + "[" + min2 + " - " + max2 + "]" + " is " + sum2);
        int average = (sum2) / dif;
        System.out.println("Average of range " + "[" + min2 + " - " + max2 + "]" + " is " + average);
//
//        //Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
//        //        For an input of x = 20 the output should be:
//        //
//        //        The first 20 Fibonacci numbers are:
//        //        1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
//        //        The average is 885.5
//
//
//
        int z = 20;
        int[] fib = new int[z + 1];


        fib[0] = 0;
        fib[1] = 1;

        for (z = 2; z < fib.length; z++)
            fib[z] = fib[z - 1] + fib[z - 2];

        for (int i = 0; i < fib.length; i++)    //length is the property of the array
            System.out.println(fib[i]);

        int sum3 = 0;
        for (int i = 0; i < fib.length; i++) {
            sum3 = sum3 + fib[i];
        }
        float sumzzz = (float) sum3 / (z - 1);
        System.out.println("Average of fibbonaci first " + z + " serie is " + sumzzz);

        //Write a java program that will test whether the first and the last element
        // of an int array are the same. We can assume the array has 2 or more elements.
        //
        //For example:
        //For the following input [13,6,2,8,2,3] the output should be : FALSE
        //For the following input [13,6,2,8,2,13] the output should be : TRUE


        int[] ints = {13, 6, 2, 8, 2, 3};
        int counter = 0;
        for (int i = 0; i < ints.length; i++)

            counter++;

        if (ints[0] == ints[counter - 1]) {
            System.out.println("first and last are the same:true");
        } else
            System.out.println("first and last of are the same:false");

//        Write a program that test whether 2 int arrays are equal. Equality in this case means that both arrays have
//        the same number of elements an element on a specific index in first array is equal to the element on the same index in the second array.
//
//                For example
//
//        For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
//        For the following arrays [] and [] the output should be TRUE
//        For the following arrays [1,3,2] and [1,3] the output should be FALSE
//        For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE

//

        int[] compare1 = {1, 2, 3, 4};
        int[] compare2 = {1, 2, 3, -2};

        int cont = 0;
        for (int i = 0; i < compare1.length; i++)

            cont++;


        int conter2 = 0;
        for (int i = 0; i < compare2.length; i++)

            conter2++;

//        System.out.println(counter);
//        System.out.println(counter2);

        if (cont == conter2) {
            int count3 = 0;
            for (int i = 0; i < compare1.length; i++) {
                if (compare1[i] == compare2[i]) {

                    count3++;
                }

            }

            if (count3 == compare2.length) {
                System.out.println("array are equals true");
            } else {
                System.out.println("array are equals false");
            }

        } else {
            System.out.println("array are equals false");
        }


//        Write a java program that will concatenate 2 arrays.
//                For example
//        Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing [1,2,3,4,5,6,7,8]


        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int length = array1.length + array2.length;
        int[] result = new int[length];
        int pos = 0;
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }
        for (int element : array2) {
            result[pos] = element;
            pos++;
        }
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);

//
//        Write a java program that will return the min, max and average values in a given array.
//
//                For example
//        GIven the following array [13,20,14,5,2,8] the output should be
//        Max : 20
//        Min : 2
//        Average: 10.3


        int array[] = new int[]{13, 20, 14, 5, 2, 8};

        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }


        }

        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }


        System.out.println("max of array is " + maxValue);
        System.out.println("min of array is " + minValue);

        int suma3 = 0;
        for (int i = 0; i < array.length; i++)
            suma3 = suma3 + array[i];

        int impartitor = array.length;

        float avera = (float) suma3 / impartitor;

        System.out.println("average of array is " + avera);


        //
//        Write a java program to return the index of a target element.
//
//                For example:
//        Given  the following array [13,20,14,5,2,8] and a target element 5 the output should be : 3 (because 5 is located at index 3 in the array)

        int[] my_array = {13, 20, 14, 5, 2, 8};

        int i;
        int t = 20;

        for (i = 0; i < my_array.length; i++) {
            if (my_array[i] == t) {
                System.out.println("index of " + t + " is " + i);

            }

        }


//        Write a Java program to find the number of even and odd integers in a given array of integers
//
//        For example.
//        Given the following array [13,20,14,5,2,8] the output should be:
//
//        Odd elements count : 2
//        Even elements count : 4

        int[] my_array2 = {13, 20, 14, 5, 2, 8};
        int x;
        int countodd = 0;
        int counteven = 0;
        for (x = 0; x < my_array2.length; x++) {
            if (my_array2[x] % 2 == 0)
                counteven++;
            if (my_array2[x] % 2 != 0)
                countodd++;


        }
        System.out.println("even " + counteven);
        System.out.println("odd " + countodd);

        //
//        Write a program that test if a given String contains another String.
//
//        For example
//        Given the following base String “Hello java world” and the target test String “java” the output should be TRUE


        String teste = "Hello Java world";
        boolean isFound = teste.indexOf("Java") != -1 ? true : false;
        System.out.println("Java is found in " + teste + ": " + isFound);


        //Write a program that will count how many times a character appears in a String
        //
        //For example
        //Given the string “Hello java world” and the target character ‘a’ the output should be 2
        //(since ‘a’ appears twice in “Hello java world”)

        String someString = "Hello java world";
        char someChar = 'l';
        int j = 0;

        for (int s = 0; s < someString.length(); s++) {
            if (someString.charAt(s) == someChar) {
                j++;
            }
        }

        System.out.println("char " + someChar + " exist " + j + " times.");


        //
        //Write a program that will test whether a string ends with another string
        //
        //For example
        //Given the following strings “Hello java world” and “orld” the output should be TRUE


        String str1 = new String("Hello java world");
        boolean var1 = str1.endsWith("orld");
        System.out.println(str1 + " ends with String: orld " + var1);


        //Write a program that will return a different string representing the alphabet index of each letter.
        //
        //Assuming we have the following alphabet encoding
        //
        //a = 0
        //b = 1
        //c = 2
        //d = 3
        //…
        //
        //For the given string “abcd” the output should be “0123”


        String chartoindex = "abcd".toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int h = 0; h < chartoindex.length(); h++) {
            System.out.print(alphabet.indexOf(chartoindex.charAt(h)));
        }
        System.out.println();

        //Write a program that will insert a # between any duplicate letters that are placed right next to each.
        //For example
        //
        //Given the following string “Hello world” the output should be “Hel#lo world”

        String input = "Hello worldd";
        insert(input, 0);
        System.out.println(output);


        //Write a program to test whether a given string is a palindrome or not
        //
        //For example
        //Given the following string “aaabccbaaa” should return TRUE
        //Given the following string “abccbb” should return FALSE


        String str = "aaabccbaaa";

        if (isPalindrome(str))
            System.out.print(str + " is a palindrome " + "TRUE");
        else
            System.out.print(str + " is a palindrome " + "FALSE");


        //


    }


}









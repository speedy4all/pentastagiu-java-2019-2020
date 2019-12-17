package myHomeWork.week2;

import java.lang.String;
import java.util.Arrays;

public class My_HomeWork_1 {

    public static void main(String[] args) {
        //Exercise 1
        System.out.println("\n<<<<<<<< Exercise 1 >>>>>>>>>>");
        int target_number = 5;
        int sum_1 = 0;
        for (int i = 0; i <= target_number; i++) {
            sum_1 += i;
        }
        System.out.println("Sum of numbers from 0 to " + target_number + " is : " + sum_1);

        //Exercise 2
        System.out.println("\n<<<<<<<< Exercise 2 >>>>>>>>>>");
        int first_number = 1;
        int second_number = 100;
        int sum_2 = 0;
        int n_numbers;
        float average_2;


        for (int i = first_number; i <= second_number; i++) {
            sum_2 += i;
        }
        n_numbers = second_number - first_number + 1;
        average_2 = (float) sum_2 / n_numbers;

        System.out.println("Sum for range " + first_number + " to " + second_number + " : " + sum_2);
        System.out.println("Average for range " + first_number + " to " + second_number + " : " + average_2);

        //Exercise 3
        System.out.println("\n<<<<<<<< Exercise 3 >>>>>>>>>>");
        int x = 20;
        int n1 = 0;
        int n2 = 1;
        int n3;
        int sum_3 = 1;

        System.out.println("The first " + x + " Fibonacci numbers are:");
        //am considerat primul numar a lui Fibonacci fiind 0
        System.out.print(n1 + " " + n2);

        for (int i = 2; i <= x; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            sum_3 += n3;
        }

        System.out.println("\nThe average is " + (float) sum_3 / (x + 1));

        //Exercise 4
        System.out.println("\n<<<<<<<< Exercise 4 >>>>>>>>>>");
        int[] array_4a = new int[]{13, 6, 2, 8, 2, 3};
        int[] array_4b = new int[]{13, 6, 2, 8, 2, 13};

        //Display and check first array
        for (int i = 0; i < array_4a.length; i++)
            System.out.print(" " + array_4a[i]);
        System.out.println(" : " + verifica_array_ex4(array_4a));

        //Display and check second array
        for (int i = 0; i < array_4b.length; i++)
            System.out.print(" " + array_4b[i]);
        System.out.println(" : " + verifica_array_ex4(array_4b));

        //Exercise 5
        System.out.println("\n<<<<<<<< Exercise 5 >>>>>>>>>>");
        int[] array_5_11 = new int[]{1, 2, 3, 4};
        int[] array_5_12 = new int[]{1, 2, 3, 4};
        int[] array_5_21 = new int[]{};
        int[] array_5_22 = new int[]{};
        int[] array_5_31 = new int[]{1, 3, 2};
        int[] array_5_32 = new int[]{1, 3};
        int[] array_5_41 = new int[]{1, 2, 3, 4};
        int[] array_5_42 = new int[]{1, 2, 4, 3};
        afiseaza_array_ex5(array_5_11, array_5_12);
        afiseaza_array_ex5(array_5_21, array_5_22);
        afiseaza_array_ex5(array_5_31, array_5_32);
        afiseaza_array_ex5(array_5_41, array_5_42);
        afiseaza_array_ex5(array_5_21, array_5_12);

        //Exercise 6
        System.out.println("\n<<<<<<<< Exercise 6 >>>>>>>>>>");
        int[] array_6_1 = new int[]{1, 2, 3, 4};
        int[] array_6_2 = new int[]{5, 6, 7, 8};
        int[] array_6_concatenated = concatinate_arrays_ex6(array_6_1, array_6_2);
        System.out.print("Array_1: ");
        afiseaza_array_ex6(array_6_1);
        System.out.print("\nArray_2: ");
        afiseaza_array_ex6(array_6_2);
        System.out.print("\nArray_1 + Array_2= " );
        afiseaza_array_ex6(array_6_concatenated);

        //Exercise 7
        System.out.println("\n\n<<<<<<<< Exercise 7 >>>>>>>>>>");
        int[] array_7 = new int[]{13,20,14,5,2,8};
        afiseaza_array_ex7(array_7);

        //Exercise 8
        System.out.println("\n<<<<<<<< Exercise 8 >>>>>>>>>>");
        int[] array_8 = new int[]{13,20,14,5,2,8};
        int number_1 = 2;
        int number_2 = 3;
        afiseaza_array_ex8(array_8, number_1);
        afiseaza_array_ex8(array_8, number_2);

        //Exercise 9
        System.out.println("<<<<<<<< Exercise 9 >>>>>>>>>>");
        String string = "Hello java world !!!";
        String test = "java";
        System.out.println("Long String: " + string);
        System.out.println("String_test: " + test);
        System.out.println("Long String contain String_test ? ");
        System.out.println("Answer: " + strirng_in_string_ex9(string, test));

        //Exercise 10
        System.out.println("\n<<<<<<<< Exercise 10 >>>>>>>>>>");
        String string_ex10 = "Hello java world";
        char character='a';
        int count = 0;
        for(int i = 0; i < string_ex10.length(); i++){
            if(string_ex10.charAt(i) == character)
                count++;
        }
        System.out.println("The chracter '" + character+"' appears times " + count + " in the string: '" + string_ex10 + "'.");

        //Exercise 11
        System.out.println("\n<<<<<<<< Exercise 11 >>>>>>>>>>");
        String string_ex11 = "Hello java world";
        String test_ex11 = "orld";
        boolean result_ex11 = false;
        if(string_ex11.endsWith(test_ex11))
            result_ex11 = true;
        System.out.println("Question: Is the word '" + test_ex11 +"' the end of string: '" + string_ex11  + "'?" );
        System.out.println("Answer: " + result_ex11);

        //Exercise 12
        System.out.println("\n<<<<<<<< Exercise 12 >>>>>>>>>>");
        String s = "abcdefg";
        char[] auxiliar = s.toCharArray();

        for (int i =0; i < auxiliar.length; i++)
            System.out.print((int) auxiliar[i]-97);


        //Exercise 13
        System.out.println("\n\n<<<<<<<< Exercise 13 >>>>>>>>>>");
        String test_ex_13 = "HHello worlddd";
        System.out.println(test_ex_13);
        String test_after_modifications_ex13 = place_in_a_string_ex13(test_ex_13);
        System.out.println("After modification\n" + test_after_modifications_ex13);

        //Exercise 14
        System.out.println("\n<<<<<<<< Exercise 14 >>>>>>>>>>");
        String test1_ex_14 = "aaabccbaaa";
        String test2_ex_14 = "abccbb";
        System.out.println("Is the string: '" + test1_ex_14 + "' a palindrome? " + string_is_palindrome(test1_ex_14));
        System.out.println("Is the string: '" + test2_ex_14 + "' a palindrome? " + string_is_palindrome(test2_ex_14));
        System.out.println("\n<<<<<<<< FINISH >>>>>>>>>>");


        }










    //method for exercise 4
    static boolean verifica_array_ex4(int[] array) {
        if (array[0] == array[array.length - 1])
            return true;
        else
            return false;
    }

    //methods for exercise 5
    static boolean verifica_array_ex5(int[] array_1, int[] array_2) {
        boolean val;
        if (array_1.length == 0 && array_2.length == 0)
            val = true;
        else if (array_1.length == 0 || array_2.length == 0)
            val = false;
        else if (array_1[array_1.length - 1] == array_2[array_2.length - 1]) {
            val = true;
            for (int i = 0; i < array_1.length; i++) {
                if (array_1[i] == array_2[i])
                    val = true;
                else
                    val = false;
            }
        } else
            val = false;
        return val;
    }

    static void afiseaza_array_ex5(int[] array_1, int[] array_2) {
        System.out.print("[");
        for (int i = 0; i < array_1.length; i++)
            System.out.print(" " + array_1[i]);
        System.out.print("] and [");
        for (int i = 0; i < array_2.length; i++)
            System.out.print(" " + array_2[i]);
        System.out.print("] ");
        System.out.println(verifica_array_ex5(array_1, array_2));
    }

    //methods for exercise 6
    static int[] concatinate_arrays_ex6(int[] array_1, int[] array_2) {
        int[] array_1_2 = {};
        if (array_1.length > 0 && array_2.length > 0) {

            for (int i = 0; i < array_1.length ; i++) {
                array_1_2 = Arrays.copyOf(array_1_2, array_1_2.length + 1);
                array_1_2[array_1_2.length - 1] = array_1[i];
            }
            for (int i = 0; i < array_2.length ; i++) {
                array_1_2 = Arrays.copyOf(array_1_2, array_1_2.length + 1);
                array_1_2[array_1_2.length - 1] = array_2[i];
            }

        }
        return array_1_2;
    }

    static  void afiseaza_array_ex6(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++)
            System.out.print(" " + array[i]);
        System.out.print("]");
    }

    static void afiseaza_array_ex7(int[] array){
        int max_value = array[0];
        int min_value = array[0];
        int sum = 0;
        float average_value ;
        System.out.print("The array is: [");
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            if(array[i] > max_value)
                max_value = array[i];
            if(array[i] < min_value)
                min_value = array[i];
            System.out.print(" " + array[i]);}
        average_value = (float) sum / array.length;
        System.out.print("]");
        System.out.println("\nMax :" + max_value);
        System.out.println("Min : " + min_value);
        System.out.println("Average : " + average_value);
    }

    static void afiseaza_array_ex8(int[] array, int number){
        int count = -1;
        System.out.print("The array is: [");
        for (int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
            if (number == array[i])
                count = i;
        }
        System.out.print("]");
        System.out.println("\nOdd elements count: " + number);
        if (count != -1)
            System.out.println("Even elements count: " + count + '\n');
        else
            System.out.println("Even elements count: Don't exist this number in the array" + '\n');
    }

    static boolean strirng_in_string_ex9(String s1, String s2){
        boolean a = false;
        if (s1.contains(s2))
            a = true;
        return a;
    }

    static String place_in_a_string_ex13(String s){
        StringBuffer sb = new StringBuffer(s);
        char[] characters = s.toCharArray();
        char abs = '#';
        for(int i =0; i < sb.length()-1; i++){
            if(sb.charAt(i+1) == sb.charAt(i)){
                sb.insert(i+1,abs);
                i++;
            }
        }
        s = sb.toString();
        return s;
    }

    static boolean string_is_palindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    }








import java.lang.reflect.Array;
import java.util.*;

public class HomeWork1 {

    public static void main(String[] args) {
        /**1. Write a program that will sum up all numbers from 0 up to a target number.*/
        sumTarget(5);

        /**2. Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.*/
        calculate(1, 100);

        /**3. Write a program that will print the first x fibonacci numbers. Also calculate the average value. */
        sumFibo(20);
        int[] testarray1 = new int[]{13, 6, 2, 8, 2, 3};
        int[] testarray2 = new int[]{13, 6, 2, 8, 2, 13};

        /**4. Write a java program that will test whether the first and the last element of an int array are the same*/
        testElements(testarray1);
        testElements(testarray2);

        /* 5. Write a program that test whether 2 int arrays are equal. */

        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{1, 2, 3, 4};
        int[] array3 = new int[]{};
        int[] array4 = new int[]{};
        int[] array5 = new int[]{1, 3, 2};
        int[] array6 = new int[]{1, 3};
        int[] array7 = new int[]{1, 2, 3, 4};
        int[] array8 = new int[]{1, 2, 4, 3};


        displayEquality(array1, array2);
        displayEquality(array3, array4);
        displayEquality(array5, array6);
        displayEquality(array7, array8);

        /**6. Write a java program that will concatenate 2 arrays. */

        int[] arrayAlone1 = new int[]{1, 2, 3, 4};
        int[] arrayAlone2 = new int[]{5, 6, 7, 8};

        int[] concatedArray = concatArrays(arrayAlone1, arrayAlone2);
        displayArrayInOneLine(arrayAlone1);
        displayArrayInOneLine(arrayAlone2);

        System.out.print(" concatenated with ");
        System.out.print(" results: ");
        displayArrayInOneLine(concatedArray);

        /**7.	Write a java program that will return the min, max and average values in a given array.*/

        int[] testArray7 = new int[]{13, 20, 14, 5, 2, 8};
        System.out.println("");
        System.out.print("For array: ");
        displayArrayInOneLine(testArray7);
        System.out.println("");
        System.out.println("Max:" + getMax(testArray7));
        System.out.println("Min: " + getMin(testArray7));
        System.out.println("Average: " + getAverage(testArray7));

        /**8.  Write a java program to return the index of a target element.*/

        int target = 5;
        System.out.println("");
        System.out.print("For array: ");
        displayArrayInOneLine(testArray7);
        System.out.println("Index of " + target + " is " + getIndex(testArray7,target) );

        /**9.  Write a Java program to find the number of even and odd integers in a given array of integers */
        countParities(testArray7);

        /**10. Write a program that test if a given String contains another String.*/
        String testString = "Hello java world";
        String testSubString = "java";
        System.out.println("String: " + testString);
        System.out.println("Substring: " + testSubString);
        System.out.println(checkSubString(testString,testSubString));

        /**11.	Write a program that will count how many times a character appears in a String */

        Character testChar = 'a';

        System.out.println("Counting char " + testChar);
        System.out.println(testChar + " appears " + countSubStrings(testString,testChar));

        /**12.	Write a program that will test whether a string ends with another string*/

        String testEndSubString = "orld";
        System.out.println(" Substring: " + testEndSubString);
        System.out.println(checkEnding( testString,  testEndSubString));

        /** 13.	Write a program that will return a different string representing the alphabet index of each letter. */

        String word = "abcd";
        System.out.println(word);
        System.out.println("Encoded: " + encode(word) );

        /** 14.	Write a program that will insert a # between any duplicate letters that are placed right next to each. */

        String wordTest = "Hello";
        System.out.println(insertDiez(wordTest));

        /** 15.	Write a program to test whether a given string is a palindrome or not */

        String word1 = "aaabccbaaa";
        String word2 = "abccbb";

        System.out.println("Check pali  for " + word1 + ": " +checkPalindrome(word1));

        System.out.println("Check pali  for " + word2 + ": " + checkPalindrome(word2));

    }

    /**PROGRAM'S METHODS*/

    /**
     * 1. Write a program that will sum up all numbers from 0 up to a target number.
     */

    static void sumTarget(int targetNumber) {
        int sum = 0;
        for (int i = 0; i <= targetNumber; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    /*2.	Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.*/

    static void calculate(int number1, int number2) {
        int sum = 0;
        double average;

        if (number1 < number2) {
            sum = getSum(number1, number2);
            average = getAverage(number1, number2);
            System.out.println("Sum for range " + number1 + " to " + number2 + " is " + sum);
            System.out.println("Average for range " + number1 + " to " + number2 + " is " + average);

        } else {
            sum = getSum(number2, number1);
            average = getAverage(number2, number1);
            System.out.println("Sum for range " + number2 + " to " + number1 + " is " + sum);
            System.out.println("Average for range " + number2 + " to " + number1 + " is " + average);
        }
    }

    static int getSum(int number1, int number2) {
        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            sum += i;
        }
        return sum;
    }

    static double getAverage(int number1, int number2) {
        int counter = 0;
        int sum = getSum(number1, number2);
        for (int i = number1; i <= number2; i++) {
            counter++;
        }
        return (double) sum / counter;
    }

    /**
     * 3.	Write a program that will print the first x fibonacci numbers. Also calculate the average value.
     */

    public static void sumFibo(int number) {

        int[] fiboArray = new int[number];
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i == 0) {
                fiboArray[0] = 1;
            }

            if (i == 1) {
                fiboArray[1] = 1;
            }
            if (i != 0 && i != 1) {
                fiboArray[i] += fiboArray[i - 1] + fiboArray[i - 2];
            }

        }
        System.out.print("The first " + number + " Fibonacci numbers are: ");
        for (int i = 0; i < fiboArray.length; i++) {
            System.out.print(fiboArray[i] + " ");
            sum += fiboArray[i];
        }
        System.out.println(" ");
        System.out.println("The average is " + (double) sum / number);

    }

    /**
     * 4.	Write a java program that will test whether the first and the last element of an int array are the same
     */

    static boolean checkElements(int[] array) {
        if (array[0] == array[array.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    static void testElements(int[] array) {
        System.out.print("For the output:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("result is " + checkElements(array));
    }

    static void displayArray(int[] array) {
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.print("[" + "]");
        }
    }

    /* 5.	Write a program that test whether 2 int arrays are equal. */

    static boolean checkEquality(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (array1.length == array2.length && array1.length == 0) {
            return true;
        }
        return false;
    }

    static void displayEquality(int[] array1, int[] array2) {
        System.out.print("For the following arrays ");
        displayArray(array1);
        System.out.print(" and ");
        displayArray(array1);
        System.out.print(" the output is ");
        System.out.print(checkEquality(array1, array2));
        System.out.println("");
    }

    static void displayArrayInOneLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /* 6.	Write a java program that will concatenate 2 arrays. */

    static int[] concatArrays(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[array3.length - i - 1];
            }
        }
        return array3;
    }

    /**
     * 7.	Write a java program that will return the min, max and average values in a given array.
     */

    static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    /**
     * 8. Write a java program to return the index of a target element.
     */

    static Integer getIndex(int[] array, int target) {
        Integer index = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }
        if(index !=  null){
            return index;
        }else {
            return null;
        }
    }

    /**9.  Write a Java program to find the number of even and odd integers in a given array of integers */

    static void countParities(int[] array){
        int oddCounter = 0;
        int evenCounter = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] % 2 == 0){
                evenCounter++;
            }else {
                oddCounter++;
            }
        }
        System.out.print("For array: ");
        displayArrayInOneLine(array);
        System.out.println("");
        System.out.println(" Odd elements count : " + oddCounter);
        System.out.println(" Even elements count : " + evenCounter);
    }

    /**10. Write a program that test if a given String contains another String.*/

    static boolean checkSubString(String myString, String subString){
        if(myString.contains(subString)){
            return true;
        }else {
            return false;
        }
    }

    /**11.	Write a program that will count how many times a character appears in a String */

    static int countSubStrings(String myString, Character myChar){
        int counter = 0;
        char[] charArray = myString.toCharArray();
        for (int i = 0 ; i<charArray.length; i++){
            if(myChar.equals(charArray[i])){
                counter++;
            }
        }
        return counter;
    }

    /**12.	Write a program that will test whether a string ends with another string*/

    static boolean checkEnding(String string, String subString){


        int subStringSize = subString.length();
        int stringSize = string.length();
        if(string.contains(subString)) {
            boolean status = true;
            char[] convertedString = string.toCharArray();
            char[] convertedSubString = subString.toCharArray();
            for (int i = convertedString.length - convertedSubString.length; i < convertedString.length; i++){
                if(convertedString[i] != convertedSubString[i- (convertedString.length - convertedSubString.length)]){
                    return false;
                }
            }
        }
            return true;

    }

    /** 13.	Write a program that will return a different string representing the alphabet index of each letter. */

    static String encode(String word){

        char[] alphabet = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        StringBuilder encodedWord = new StringBuilder();

        char[] convertedString = word.toCharArray();

        for(int i = 0; i < convertedString.length; i++){
            for (int j = 0; j< alphabet.length; j++){
                if(convertedString[i] == alphabet[j]){
                    encodedWord.append(i);
                }
            }
        }
        return encodedWord.toString();
    }

    /** 14.	Write a program that will insert a # between any duplicate letters that are placed right next to each. */

    static String insertDiez (String word){
        for (int i = 1; i < word.length(); i++)
        {
            if (word.charAt(i) == word.charAt(i - 1))
            {
                word = word.substring(0, i) + "#" + word.substring(i, word.length());
            }
        }
        return word;
    }

    /** 15.	Write a program to test whether a given string is a palindrome or not */

    static boolean checkPalindrome(String word){
        char[] arrayWord = word.toCharArray();
        for(int i = 0; i<arrayWord.length/2; i++){
            if(arrayWord[i] == arrayWord[arrayWord.length-i-1]) {
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}



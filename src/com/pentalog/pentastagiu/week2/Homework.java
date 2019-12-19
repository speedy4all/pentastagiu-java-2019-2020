package com.pentalog.pentastagiu.week2;

import java.util.Arrays;

public class Homework {

    //1
    public static void sumAllNums(int number){
        int sum = 0;
        for (int i=1; i<=number; i++){
            sum += i;
        }
        System.out.println("Suma primelor "+ number + " numere este: " + sum);
    }

    //2
    public static void sumAndAverage(int num1, int num2){
        int sum = 0, average = 0;
        //get all numbers
        for (int i = num1; i<=num2; i++){
            //sum
            sum += i;
            //average
            average = sum / i;
        }
        System.out.println("sum = " + sum + " and average = " + average);
    }
    //3
    public static void fibonnaci(int limit){
        int first = 1, second = 1, count = 1, total = 1;
        System.out.println("The first " + limit + " Fibonnaci numbers are:");
        System.out.print(first + " ");
        while (count < limit){
            System.out.print(second + " ");
            total += second;
            int sum = first + second;
            first = second;
            second = sum;
            count++;
        }
        System.out.println("\nThe average is: " + ((double)total/limit));
    }
    //4
    public static boolean firstAndLastElem(int[] arr){
        //System.out.print(arr.length>=2 && arr[0] == arr[arr.length - 1]);
        if (arr[0] == arr[arr.length - 1]){
            return true;
        }
        else
            return false;
    }
    //5
    public static boolean arrayEquality(int[] arr1, int[] arr2){
        if (arr1.length == arr2.length){
            System.out.println("true");
                return true;
            }
            else
            {
                for (int i = 0; i < arr1.length; i++){
                    if (arr1[i] != arr2[i]){
                        System.out.println("false");
                        return false;
                    }
                }
            }
        System.out.println("false");
        return false;
    }

    //6
    public static void concatenate(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;

        int[] res = new int[length1 + length2];

        System.arraycopy(arr1, 0, res, 0, length1);
        System.arraycopy(arr2, 0, res, length1, length2);

        System.out.println(Arrays.toString(res));

    }

    //7
    public static void getMinMaxAndAverage(int[] arr){
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        int average = (int) Arrays.stream(arr).average().getAsDouble();
        System.out.println("min: " + min + " max: " + max + " average: " + average);
    }

    //8
    public static int returnIndex(int target){
        int[] arr = {13,20,14,5,2,8};

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target) {
                System.out.println("Index of " + target + " is " + i);
                return i;
            }
        } return -1;
    }

    //9
    public static void oddAndEvenNumber(int[] arr){
        int counterEven = 0, counterOdd = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                counterEven++;
            }
            else
                counterOdd++;
        }
        System.out.println("Even numbers count: " + counterEven);
        System.out.println("Odd numbers count: " + counterOdd);
    }

    //10
    public static void findString(String given, String searchFor){
        boolean isHere = given.contains(searchFor);
        System.out.println(isHere);
    }

    //11
    public static void findChar(String str, char c){
        int numOfChar = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                numOfChar++;
            }
        }
        System.out.println("Character " + "\'" + c + "\'" + " appears " + numOfChar + " times in "
                            + "\"" + str + "\"");
    }

    //12
    public static void endString(String given, String end){
        boolean endWith = given.endsWith(end);
        System.out.println(endWith);
    }

    //13
    public static void alphabetIndexLetter(String str){
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++){
            System.out.print(alphabet.indexOf(str.charAt(i)));
        }
    }

    //14

    public static void doubleLetter(String str){

        String edited = "";
       for (int i = 1; i < str.length(); i++){
           if (str.charAt(i) == str.charAt(i - 1)){
                edited = str.substring(0, i) + "#" + str.substring(i);
           }
       }
        System.out.println(edited);
    }

    //15
    public static void palindomeCheck(String str){
        String reverse = "";
        int length = str.length();

        for (int i = length - 1; i>= 0; i--)
            reverse = reverse + str.charAt(i);
        if (str.equals(reverse))
            System.out.println("It is a palindrome");
        else
            System.out.println("Not a palindrome");


    }


}


import java.util.*;

public class Homework1 {
    // this output should help me for EX 14
    static String output="";

    public static void main(String[] args) {
        // EX1
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("enter an integer");
//        int sumNumber = keyboard.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= sumNumber; i++) {
//            if (sumNumber < 0) {
//                return;
//            }
//            sum += i;
//        }
//        System.out.println(sum);

        // EX2
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int firstNumber = keyboard.nextInt();
//        System.out.println("Enter second number: ");
//        int secondNumber = keyboard.nextInt();
//        int sum = 0;
//        float average = 0;
//        for (int i = firstNumber; i <= secondNumber; i++) {
//            sum += i;
//            average = sum / i;
//        }
//        System.out.println("Sum: " + sum);
//        System.out.println("Average: " + average);

        // EX3
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Enter Fibonacci number: ");
//        int fibNumber = keyboard.nextInt();
//        int n1 = 1;
//        int n2 = 2;
//        int sum = 0;
//
//        for (int i = 2; i <= fibNumber; i++) {
//            System.out.println(n1);
//            sum = n1 + n2;
//            n1 = n2;
//            n2 = sum;
//            sum /= i;
//        }
//        System.out.println("Average is: " + (float) sum);

        // EX4
//        int[] firstArr = {13,6,2,8,2,13};
//        int firstNumber;
//        int lastNumber;
//        Boolean result = null;
//        for (int i = 0; i < firstArr.length; i++) {
//            firstNumber = firstArr[0];
//            lastNumber = firstArr[firstArr.length - 1];
//            if (firstNumber == lastNumber) {
//                result = true;
//            } else {
//                result = false;
//            }
//        }
//        System.out.println(result);

        // EX5
//        int[] firstArr = {1,2,3,4};
//        int[] secondArr = {1,2,3,4};
//        int firstLength = firstArr.length;
//        int secondLength = secondArr.length;
//        boolean finalResult = false;
//        if (firstLength != secondLength) {
//            System.out.println(false);
//            return;
//        }
//        Arrays.sort(firstArr);
//        Arrays.sort(secondArr);
//        for (int i = 0; i < firstLength; i++) {
//            if (firstArr[i] != secondArr[i]) {
//                finalResult = false;
//            } else if (firstArr[i] == secondArr[i]){
//                finalResult = true;
//            }
//        }
//        System.out.println(finalResult);


        // EX6
//        int[] firstArr = {1,2,3,4};
//        int[] secondArr = {5,6,7,8};
//        int firstLength = firstArr.length;
//        int secondLength = secondArr.length;
//        int[] result = new int[firstLength + secondLength];
//        System.arraycopy(firstArr, 0, result, 0, firstLength);
//        System.arraycopy(secondArr, 0, result, firstLength, secondLength);
//        System.out.println(Arrays.toString((result)));

        // EX7
//        int[] myArray = {13,20,14,5,2,8};
////        int sum = 0;
////        int max = myArray[0];
////        int min = myArray[0];
////        for (int i = 0; i < myArray.length; i++) {
////            sum += myArray[i];
////
////            if (min > myArray[i]) {
////                min = myArray[i];
////            }
////            if (max < myArray[i]) {
////                max = myArray[i];
////            }
////        }
////        double average = (double) sum / myArray.length;
////        System.out.println("Max value: " + max);
////        System.out.println("Min value: " + min);
////        System.out.println("Average: " + average);

        // EX8
//        int[] myArray = {13,20,14,5,2,8};
//        System.out.println("Position: " + findIndex(myArray, 5));

        // EX9
//        int[] myArray = {13,20,14,5,2,8};
////        int count = 0;
////        for (int i = 0; i < myArray.length; i++) {
////            if (myArray[i] % 2 == 0) {
////                count++;
////            }
////        }
////        System.out.println("Odd elements count: " + (myArray.length - count));
////        System.out.println("Even elements count: " + count);

        // EX 10
//        String myString = "Hello java world";
//        System.out.println(myString.contains("java"));

        //EX 11
//        String myString = "Hello java world";
//        int count = 0;
//        char searchedLetter = 'a';
//
//        for (int i = 0; i < myString.length(); i++) {
//            if (myString.charAt(i) == searchedLetter) {
//                count++;
//            }
//        }
//        System.out.println("Element appears: " + count + " times.");

        //EX 12
//        String myString = "Hello java world";
//        if (myString.endsWith("orld")) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

        //EX 13 - Stack overflow
//        String myString = "abcd";
//        char[] ch = myString.toCharArray();
//        for (char c : ch) {
//            int temp = c;
//            int temp_integer = 96;
//            if (temp <= 122 & temp >= 97) {
//                System.out.println(temp - temp_integer);
//            }
//        }

        // EX 14
//        String input = "Hello world";
//        pairStar(input,0);
//        System.out.println(output);

        // EX 15
        String myString = "aaabccbaaa";
        String myOutput = "";
        int len = myString.length();
        for (int i = len - 1; i >= 0; i--) {
            myOutput += myString.charAt(i);
        }
        if (myString.equals(myOutput)) {
            System.out.println(myString + " is a palidrome");
        } else {
            System.out.println(myString + " is not a palidrome");
        }


    }
    // Class for EX 8
    public static int findIndex(int arr[], int t)
    {
        int len = arr.length;
        int i = 0;

        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
    // Class for EX 14
    static void pairStar(String input, int i)
    {
        // Append current character
        output = output + input.charAt(i);

        // If we reached last character
        if (i == input.length() - 1)
            return;

        // If next character is same,
        // append '#'
        if (input.charAt(i) == input.charAt(i+1))
            output = output + '#';

        pairStar(input, i+1);
    }
}

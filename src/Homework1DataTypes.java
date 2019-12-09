import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Homework1DataTypes {

    public static void main(String[] args) {

        // 1) sum up all numbers from 0 up to a target number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Target number: ");
        int number = scanner.nextInt();

        int sum0ToTarget = 0;
        for (int i=0; i<=number; i++){
            sum0ToTarget = sum0ToTarget + i;
        }

        System.out.println("Sum = " + sum0ToTarget);


        //2) the average and sum of all numbers between the range of 2 numbers
        System.out.println("Enter the lowest value of range:");
        int lowest = scanner.nextInt();
        System.out.println("Enter the highest value of range:");
        int highest = scanner.nextInt();

        int sumRange = 0;
        int l=lowest;
        int count = 0;

        while (l<=highest){
            sumRange += l;
            l++;
            count++;
        }

        double average=0;
        average = sumRange / count;


        System.out.println("Sum for range " + lowest + " to " + highest + " : " + sumRange);
        System.out.println("Average for range " + lowest + " to " + highest + " : " + average);

        //3) print the first x fibonacci numbers + calculate the average value
        System.out.println("How many fibonacci numbers");
        int x = scanner.nextInt();
        int f0 = 0;
        int f1 = 1;

        System.out.print("The first " + x + " Fibonacci numbers are: ");

        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(f1);
        for (int i = 1; i < x; i++){
            int sum = f0 + f1;
            f0 = f1;
            f1 = sum;
            fibonacciNumbers.add(sum);
        }
        System.out.println(fibonacciNumbers);

        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        int sumF=0;
        for (int k = 1; k < fibonacciNumbers.size(); k++){
            sumF += fibonacciNumbers.get(k);
        }
        float averageFibonacciNumbers = (float) sumF / x;
        System.out.println("The average is : " + decimalFormat.format(averageFibonacciNumbers));


        //4) test whether the first and the last element of an int array are the same
        System.out.println("Enter the number of elements of the array:");
        int n = scanner.nextInt();
        int array[] = new int[n];

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        if (array[0] == array[n-1]){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }


        //5) test whether 2 int arrays are equal
        int[] firstArr1 = {1, 2, 5, 6};
        int[] secondArr1 = {1, 2, 5, 6};
        int[] firstArr2 = {1, 5, 7};
        int[] secondArr2 = {1, 5, 9};
        int[] firstArr3 = {};
        int[] secondArr3 = {};
        System.out.println(checkArrays(firstArr1,secondArr1));
        System.out.println(checkArrays(firstArr2, secondArr2));
        System.out.println(checkArrays(firstArr3, secondArr3));


        //6) program that will concatenate 2 arrays
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int length = arr1.length + arr2.length;
        int[] arr3 = new int[length];

        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }

        for (int k = 0; k < arr2.length; k++){
            arr3[arr1.length + k] = arr2[k];
        }

        System.out.println(Arrays.toString(arr3));


        //7) min, max and average values in a given array
        int[] arr = {13,20,14,5,2,8};
        int max = arr[0];
        int min = arr[0];
        double avgArray = 0;
        int sumArr = 0;

        for (int j = 0; j < arr.length; j++){
            if (max < arr[j]){
                max = arr[j];
            }
        }

        for (int i = 0; i < arr.length-1; i++){
            if (min > arr[i+1]){
                min = arr[i+1];
            }
        }

        for (int k = 0; k < arr.length; k++){
            sumArr += arr[k];
        }
        avgArray = (double)sumArr / arr.length;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + decimalFormat.format(avgArray));


        //8) program to return the index of a target element
        int[] elements = {13,20,14,5,2,8};
        int target = 5;

        System.out.println(findIndex(elements, target));


        //9) program to find the number of even and odd integers in a given array of integers
        int[] arrayOddOrEven = {13,20,14,5,2,8};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i< arrayOddOrEven.length; i++){
            if (arrayOddOrEven[i] % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("Odd elements count: " + countOdd);
        System.out.println("Even elements count: " + countEven);


        //10) test if a given String contains another String
        String baseString = "Hello java world";
        String targetStr = "java";
        if(baseString.contains(targetStr)){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }


        //11) how many times a character appears in a String
        String s = "Hello java world";
        Character targetCharacter = 'a';
        char[] ss = s.toCharArray();
        int countCharacters = 0;
        for (int i = 0; i < ss.length; i++){
            if (ss[i] == targetCharacter){
                countCharacters++;
            }
        }
        System.out.println(countCharacters);


        //12) program that will test whether a string ends with another string
        String baseStr = "Hello java world";
        String endStr = "orld";

        if (baseStr.endsWith(endStr)){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        //13) program that will return a different string representing the alphabet index of each letter
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String strAplh = "abcd";
        for (int i = 0; i < strAplh.length(); i++){
            System.out.print(alphabet.indexOf(strAplh.charAt(i)));
        }

        System.out.println();


        //14) program that will insert a # between any duplicate letters that are placed right next to each
        String strWithDuplicates = "Hello World";
        List<Character> list = new ArrayList<>();
        for (char c : strWithDuplicates.toCharArray()) {
            list.add(c);
        }
        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i) == list.get(i+1)){
                list.add(i+1,'#');
            }
        }

        for (char ch : list) {
            System.out.print(ch);
        }

        System.out.println();


        //15) program to test whether a given string is a palindrome or not
        String inputStr = "aaabccbaaa";
        String reversed = "";

        String inputStr2 = "abccbb";
        String reversed2 = "";
        System.out.println(checkPalindrome(inputStr,reversed));
        System.out.println(checkPalindrome(inputStr2, reversed2));

    }
    //5) test whether 2 int arrays are equal
    public static boolean checkArrays (int[] firstArray, int[] secondArray) {

        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++){
            if (firstArray[i] != secondArray[i]){
                return false;
            }
        }
        return true;
    }

    //8)program to return the index of a target element
    public static int findIndex(int[] elements, int target){
        for(int i = 0; i < elements.length; i++){
            if (elements[i] == target){
                return i;
            }
        }
        return -1;
    }

    //15) test whether a given string is a palindrome or not
    public static boolean checkPalindrome(String inputStr, String reversed){
        for (int i = inputStr.length() - 1; i>=0; i--){
            reversed = reversed + inputStr.charAt(i);
        }

        if (inputStr.equals(reversed)){
            return true;
        } else return false;
    }

}

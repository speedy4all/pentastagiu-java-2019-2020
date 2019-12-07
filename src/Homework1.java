import java.util.Arrays;

public class Homework1 {

    public static void main(String[] args) {
/* Write a program that will sum up all numbers from 0 up to a target number.
For example, for an input number 5, result should be 15 (0+1+2+3+4+5)*/
        int n = 5;
        sumOfNumbersUpTo(n);

/*Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
For example, for range numbers 1 to 100 output should be:
Sum for range 1 to 100 : 5050
Average for range 1 to 100 : 50.0*/
        int x = 1, y = 100;
        sumAndAverageForNumbersBetween(x, y);

/* Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
For an input of x = 20 the output should be:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5*/
        firstFibonacciNumbers(20);

/*Write a java program that will test whether the first and the last element of an int array are the same. We can assume the array has 2 or more elements.
For example:
For the following input [13,6,2,8,2,3] the output should be : FALSE
For the following input [13,6,2,8,2,13] the output should be : TRUE*/
        int[] arr = {13, 6, 2, 8, 2, 13};
        int[] arr1 = {13, 6, 2, 8, 2, 3};
        System.out.println("For the following input " + Arrays.toString(arr1) + " the output should be: " + areFirstAndLastElmsOfArrayTheSame(arr1));
        System.out.println("For the following input " + Arrays.toString(arr) + " the output should be: " + areFirstAndLastElmsOfArrayTheSame(arr));

/*Write a program that test whether 2 int arrays are equal. Equality in this case means that both arrays have the same number of elements an element on a specific index in first array is equal to the element on the same index in the second array.
For example
For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
For the following arrays [] and [] the output should be TRUE
For the following arrays [1,3,2] and [1,3] the output should be FALSE
For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE*/
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 2, 3, 4};
        System.out.println("For the following arrays " + Arrays.toString(arr2) + " and " + Arrays.toString(arr3) + " the output should be: " + areArraysEqual(arr2, arr3));
        int[] arr4 = {};
        int[] arr5 = {};
        System.out.println("For the following arrays " + Arrays.toString(arr4) + " and " + Arrays.toString(arr5) + " the output should be: " + areArraysEqual(arr4, arr5));
        int[] arr6 = {1, 3, 2};
        int[] arr7 = {1, 3};
        System.out.println("For the following arrays " + Arrays.toString(arr6) + " and " + Arrays.toString(arr7) + " the output should be: " + areArraysEqual(arr6, arr7));
        int[] arr8 = {1, 2, 3, 4};
        int[] arr9 = {1, 2, 4, 3};
        System.out.println("For the following arrays " + Arrays.toString(arr8) + " and " + Arrays.toString(arr9) + " the output should be: " + areArraysEqual(arr8, arr9));


/*Write a java program that will concatenate 2 arrays.
For Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing [1,2,3,4,5,6,7,8]*/
        int[] arr10 = {1, 2, 3, 4};
        int[] arr11 = {5, 6, 7, 8};
        System.out.println("The result after concatenating " + Arrays.toString(arr10) + " and " + Arrays.toString(arr11) + " is " + Arrays.toString(concatTwoArrays(arr10, arr11)));


/*Write a java program that will return the min, max and average values in a given array.
For example
Given the following array [13,20,14,5,2,8] the output should be
Max : 20
Min : 2
Average: 10.3*/
        int[] arr12 = {13, 20, 14, 5, 2, 8};
        minMaxAndAverageInArray(arr12);
        System.out.print("\n");


/*Write a java program to return the index of a target element
For example:
Given  the following array [13,20,14,5,2,8] and a target element 5 the output should be : 3 (because 5 is located at index 3 in the array)*/
        int[] arr13 = {13, 20, 14, 5, 2, 8};
        System.out.println("The index of the target element is " + getIndexOfTargetElm(arr13, 5));

/*Write a Java program to find the number of even and odd integers in a given array of integers
For example.
Given the following array [13,20,14,5,2,8] the output should be:
Odd elements count : 2
Even elements count : 4*/
        int[] arr14 = {13, 20, 14, 5, 2, 8};
        noOfEvenAndOddElmsInArray(arr14);

/*Write a program that test if a given String contains another String.
For example
Given the following base String “Hello java world” and the target test String “java” the output should be TRUE*/
        boolean result = isStringInString("Hello java world", "java");
        System.out.println("string contains string : " + result);

/*Write a program that will count how many times a character appears in a String
For example
Given the string “Hello java world” and the target character ‘a’ the output should be 2
(since ‘a’ appears twice in “Hello java world”)*/
        countCharAppearancesInString("Hello java world", 'a');

/*Write a program that will test whether a string ends with another string
For example
Given the following strings “Hello java world” and “orld” the output should be TRUE*/
        boolean endsWith = doesStringEndsWith("Hello java world", "orld");
        System.out.println("String 'Hello java world' ends with 'orld' suffix: " + endsWith);

/*Write a program that will return a different string representing the alphabet index of each letter.
Assuming we have the following alphabet encoding
a = 0
b = 1
c = 2
d = 3
…
For the given string “abcd” the output should be “0123”*/
        getNumericalValForAlphChar("abcd");

/*Write a program that will insert a # between any duplicate letters that are placed right next to each.
For example
Given the following string “Hello world” the output should be “Hel#lo world”*/
        setCharBetweenDuplicateLettersInString("Hello world");

/*Write a program to test whether a given string is a palindrome or not
For example
Given the following string “aaabccbaaa” should return TRUE
Given the following string “abccbb” should return FALSE*/
        String palStr = "aaabccbaaa";
        boolean pal = isPalindrome(palStr);
        System.out.println(palStr + "is a palindrome: " + pal);
        String noPalStr = "abccbb";
        boolean pal2 = isPalindrome("noPalStr");
        System.out.println(noPalStr + " is a palindrome: " + pal2);
    }

    private static void sumOfNumbersUpTo(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += +i;
        }
        System.out.println("Sum: " + sum);
    }

    private static void sumAndAverageForNumbersBetween(int x, int y) {
        int sum = 0;
        int count = y-x;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        double avg = (double) sum / (double) count;
        System.out.println("Sum for range " + x + " to " + y + " : " + sum);
        System.out.format("Average for range " + x + " to " + y + " : " + String.format("%.2f",avg)+"\n");
    }

    public static void firstFibonacciNumbers(int x) {
        int no2 = 1, no1 = 1;
        System.out.print("The first 20 Fibonacci numbers are: ");
        System.out.print(no1);
        System.out.print(" " + no2);
        for (int i = 3; i <= x; i++) {
            int no3 = no2 + no1;
            no1 = no2;
            no2 = no3;
            System.out.print(" " + no2 + " ");
        }
        System.out.print("\n");
    }

    private static boolean areFirstAndLastElmsOfArrayTheSame(int[] arr) {
        int size = arr.length;
        return arr[0] == arr[size - 1];
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];  //resultant array of size first array and second array
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    public static void minMaxAndAverageInArray(int[] arr) {
        int max = 0, min = 9999, sum = 0;
        int len = arr.length;

        for (int value : arr) {
            if (value > max)
                max = value;
            if (value < min)
                min = value;
            sum += value;
        }
        double avg = (double)sum /(double) len;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average "+ String.format("%.2f",avg));
    }

    public static int getIndexOfTargetElm(int[] arr, int target) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                break;
        }
        if (i == arr.length) {
            System.out.println("You have reached the end of the array, still the target element could not be found so you will get the length of the array");
        }
        return i;
    }

    public static void noOfEvenAndOddElmsInArray(int[] arr) {
        int odd = 0, even = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Odd elements count : " + odd);
        System.out.println("Even elements count : " + even);
    }

    public static boolean isStringInString(String toCheck, String cont) {
        return toCheck.contains(cont);
    }

    public static void countCharAppearancesInString(String someString, char someChar) {
        int count = 0;
        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == someChar)
                count++;
        }
        System.out.println("The string " + someString + " contains " + count + " chars " + someChar);
    }

    public static boolean doesStringEndsWith(String someString, String suffix) {
        return someString.endsWith(suffix);
    }

    public static void getNumericalValForAlphChar(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(alphabet.indexOf(input.charAt(i)));
        }
        System.out.println(output);
    }

    public static void setCharBetweenDuplicateLettersInString(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < input.length(); i++) {
            output.append(input.charAt(i - 1));
            if (input.charAt(i - 1) == input.charAt(i))
                output.append("#");
        }
        System.out.println(output.toString() + input.charAt(input.length() - 1));
    }

    public static boolean isPalindrome(String input) {
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}




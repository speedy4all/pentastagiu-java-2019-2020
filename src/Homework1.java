import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Homework1 {

    public static void main(String[] args) throws IOException {
        //Write a program that will sum up all numbers from 0 up to a target number.
        //For example, for an input number 5, result should be 15 (0+1+2+3+4+5)


        Scanner sc = new Scanner(System.in);
      /*  System.out.println("Write the number:");
        int nr = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
       // Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
               // For example, for range numbers 1 to 100 output should be:

       // Sum for range 1 to 100 : 5050
      //  Average for range 1 to 100 : 50.0

        System.out.println("Write the first number:");
        int nr1 = sc.nextInt();
        System.out.println("Write the second number:");
        int nr2 = sc.nextInt();
        int sum1 = 0;
        double range=0;
        for (int i = nr1; i <= nr2; i++) {
            sum1 = sum1 + i;
             range ++;

        }
        System.out.println("Sum of the range is:");
        System.out.println(sum1);
        System.out.println("Average of the range is:");
        System.out.println(sum1/range);
        //  Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
        //  For an input of x = 20 the output should be:

        //  The first 20 Fibonacci numbers are:
        // 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
        // The average is 885.5

        log("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        log("\nUsing Method-1: Using Recursion. Provided Number: " + number);
        // printing Fibonacci series upto number
        for (int i = 1; i <= number; i++) {
            log(fibonacciRecusion(i) + " ");
        }

        log("\nMethod-2: Fibonacci number at location " + number + " is ==> " + (fibonacciLoop(number) + ""));

    }

    // Method-1: Java program for Fibonacci number using recursion.
    public static int fibonacciRecusion(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); // tail recursion
    }

    // Method-2: Java program for Fibonacci number using Loop.
    public static int fibonacciLoop(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; // Fibonacci number
    }

    private static void log(String number) {
        System.out.println(number);

    }

     //   Write a java program that will test whether the first and the last element of an int array are the same. We can assume the array has 2 or more elements.

       //         For example:
        //For the following input [13,6,2,8,2,3] the output should be : FALSE
        //For the following input [13,6,2,8,2,13] the output should be : TRUE

;


        int[] someArray = {13,6,2,8,2,3};
        int first = someArray[0];
        int last = someArray[someArray.length - 1];
        if(last==first)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
     //   Write a program that test whether 2 int arrays are equal. Equality in this case means that both arrays have the same number of elements an element on a specific index in first array is equal to the element on the same index in the second array.
        //For example
       // For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
        //For the following arrays [] and [] the output should be TRUE
        //For the following arrays [1,3,2] and [1,3] the output should be FALSE
        //For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE
String s1=sc.nextLine();
String s2=sc.nextLine();
if(s1.equals(s2))
{
    System.out.println(("TRUE"));
}
else
{
    System.out.println("FALSE");
}

     //   Write a java program that will concatenate 2 arrays.
      //          For example
      //  Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing [1,2,3,4,5,6,7,8]
        String [] first = {1,2,3, 4};
        String[] second = {5,6,7,8};

        // combine two arrays in Java using Apache commons ArrayUtils
        int [] combined = first+ second);

        System.out.println("First array : " + Arrays.toString(first));
        System.out.println("Second array : " + Arrays.toString(second));
        System.out.println("Combined array : " + Arrays.toString(combined));

//Write a java program that will return the min, max and average values in a given array.
//
//For example
//GIven the following array [13,20,14,5,2,8] the output should be
//Max : 20
//Min : 2
//Average: 10.3

        int sum = 0;
        int max = 0;
        int min = 0;
        // Creating array of grade values
        int[] grades = new int[] {
                82, 70, 99, 90, 92, 75, 87, 85, 91, 100, 91, 87
        };
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            if (min > grades[i]) {
                min = grades[i];
            }
            if (max < grades[i]) {
                max = grades[i];
            }
        }
        double average = (double) sum / grades.length;
        System.out.printf("    min:  " + min);
        System.out.printf("%n    max:  " + max);
        System.out.printf("%naverage:  %.1f", average);
    //Write a java program to return the index of a target element.
        //
        //For example:
        //Given  the following array [13,20,14,5,2,8] and a target element 5 the output should be : 3 (because 5 is located at index 3 in the array)
        int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };

        // find the index of 5
        System.out.println("Index position of 5 is: "
                + findIndex(my_array, 5));

        // find the index of 7
        System.out.println("Index position of 7 is: "
                + findIndex(my_array, 7));

    //Write a Java program to find the number of even and odd integers in a given array of integers
        //
        //For example.
        //Given the following array [13,20,14,5,2,8] the output should be:
        //
        //Odd elements count : 2
        //Even elements count : 4

        int a[]={1,2,5,6,3,2};
        System.out.println("Odd Numbers:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
      //Write a program that test if a given String contains another String.
        //
        //For example
        //Given the following base String “Hello java world” and the target test String “java” the output should be TRUE
        String st1=sc.nextLine();
        String st2=sc.nextLine();
        if(st1.contains(st2))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
//Write a program that will count how many times a character appears in a String
//
//For example
//Given the string “Hello java world” and the target character ‘a’ the output should be 2
//(since ‘a’ appears twice in “Hello java world”)
//Write a program that will test whether a string ends with another string
//
//For example
//Given the following strings “Hello java world” and “orld” the output should be TRUE
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // The String to check the above two Strings to see
        // if they end with this value (se).
        String end_str = sc.nextLine();

        // Check first two Strings end with end_str
        boolean ends1 = str1.endsWith(end_str);
        boolean ends2 = str2.endsWith(end_str);

        // Display the results of the endsWith calls.
        System.out.println("\"" + str1 + "\" ends with " +
                "\"" + end_str + "\"? " + ends1);
        System.out.println("\"" + str2 + "\" ends with " +
                "\"" + end_str + "\"? " + ends2);*/
        // Write a program to test whether a given string is a palindrome or not
        String str, rev = "";


        System.out.println("Enter a string:");
        str = sc.nextLine();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");

    }





    public static int findIndex(int arr[], int t) {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }



}









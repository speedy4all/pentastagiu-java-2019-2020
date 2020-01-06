import java.util.Arrays;

public class Homework1 {

    public static void main(String[] args) {

        // Problem 1

        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Total sum are : " + sum);


        // Problem 2

        //sum for numbers between 123 and 321
        int min = 123, max = 321, sum1 = 0;
        for (int i = min; i <= max; i++) {
            sum1 += i;
        }
        System.out.println("Sum for numbers between " + min + " and " + max + " is: " + sum1);
        //average for numbers between 123 and 321
        float average = sum1 / 198;
        System.out.println("Average for numbers between " + min + " and " + max + " is: " + average);


        // Problem 3
        // first 13 Fibonacci numbers
        int f = 0;
        int g = 1;

        for (int i = 1; i <= 13; i++) {
            System.out.print(f + " ");
            f = f + g;
            g = f - g;
        }
        System.out.println();
        // sum of 13 Fibonacci numbers
        int sum2 = f + g;
        System.out.println("Sum of 13 Fibonacci numbers is: " + sum2);

        // average of 13 Fibonacci numbers
        float average1 = sum2 / 13;
        System.out.println("Average of 13 Fibonacci numbers is: " + average1);


        // Problem 4
        int[] firstArray = {5, 8, 10, 11, 24, 33};
        int[] secondArray = {2, 3, 4, 7, 12, 2};
        System.out.println(firstArray.length >= 2 && firstArray[0] == firstArray[firstArray.length - 1]);
        System.out.println(secondArray.length >= 2 && secondArray[0] == secondArray[secondArray.length - 1]);


        // Problem 5
        int[] firstArray1 = {5, 8, 10};
        int[] firstArray2 = {5, 8, 10};
        System.out.println("Is firstArray1 equals to firstArray2 : " + Arrays.equals(firstArray1, firstArray2));
        int[] firstArray3 = {};
        int[] firstArray4 = {};
        System.out.println("Is firstArray3 equals to firstArray4 : " + Arrays.equals(firstArray3, firstArray4));
        int[] firstArray5 = {5, 8, 10};
        int[] firstArray6 = {5, 8};
        System.out.println("Is firstArray5 equals to firstArray6 : " + Arrays.equals(firstArray5, firstArray6));
        int[] firstArray7 = {5, 8, 10};
        int[] firstArray8 = {5, 10, 8};
        System.out.println("Is firstArray7 equals to firstArray8 : " + Arrays.equals(firstArray7, firstArray8));


        // Problem 6
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int firstL = array1.length;
        int secondL = array2.length;
        int[] result = new int[firstL + secondL];
        System.arraycopy(array1, 0, result, 0, firstL);
        System.arraycopy(array2, 0, result, firstL, secondL);
        System.out.println(Arrays.toString(result));

        // Problem 7


    }


}

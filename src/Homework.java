import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//        Write a program that will sum up all numbers from 0 up to a target number.
//                For example, for an input number 5, result should be 15 (0+1+2+3+4+5)
        Scanner sc = new Scanner(System.in);
        int myVar;
        System.out.println("Enter the number");
        myVar = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= myVar; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);

//        Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
//                For example, for range numbers 1 to 100 output should be:
//        Sum for range 1 to 100 : 5050
//        Average for range 1 to 100 : 50.0
        int firstNumber;
        System.out.println("Enter the  first number");
        firstNumber = sc.nextInt();
        int secondNumber;
        System.out.println("Enter the second number");
        secondNumber = sc.nextInt();
        int sum1 = 0;
        int average = 1;
        for (int i = firstNumber; i <= secondNumber; i++) {
            sum1 = sum1 + i;
        }
        average = (firstNumber + secondNumber) / 2;

        System.out.println("The sum is " + sum1);
        System.out.println("The average is " + average);

//        Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
//        For an input of x = 20 the output should be:
//        The first 20 Fibonacci numbers are:
//        1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
//        The average is 885.5
        int n, f;
        System.out.println("Enter the number of items");
        n = sc.nextInt();
        int firstElements, secondElements;
        firstElements = 1;
        secondElements = 1;
        double sum2, x, average1;
        sum2 = firstElements + secondElements;
        x = 2;
        average1 = 1;
        for (int i = 3; i <= n; i++) {
            f = secondElements + firstElements;
            System.out.println(" The first n fibonacci numbers is" + f);
            firstElements = secondElements;
            secondElements = f;
            sum2 = sum2 + f;
            x++;
        }
        average1 = sum2 / x;
        System.out.println("The average is " + average1);

//        Write a java program that will test whether the first and last element of an int array are the same. We can assume the array has 2 or more elements.
//                For example:
//        For the following input [13,6,2,8,2,3] the output should be: FALSE
//      For the following input [13,6,2,8,2,13] the output should be: TRUE
        int m;
        System.out.println("Enter the number of elements");
        m = sc.nextInt();
        int ints[] = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the elements");
            ints[i] = sc.nextInt();
        }
        if (ints[0] == ints[m - 1]) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

//        Write a program that test whether 2 int arrays are equal. Equality in this case means that both arrays have the same number of elements an element on a specific index in first array is equal to the element on the same index in the second array.
//                For example
//        For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
//        For the following arrays [] and [] the output should be TRUE
//        For the following arrays [1,3,2] and [1,3] the output should be FALSE
//        For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE
        int a;
        System.out.println("Enter the number of elements of the first vector");
        a = sc.nextInt();
        int firstVector[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter the elements");
            firstVector[i] = sc.nextInt();
        }
        int b;
        System.out.println("Enter the number of elements of the second vector");
        b = sc.nextInt();
        int secondVector[] = new int[b];
        for (int i = 0; i < b; i++) {
            System.out.println("Enter the elements");
            secondVector[i] = sc.nextInt();
        }
        boolean ok = false;
        if (a == b) {
            for (int i = 0; i < a; i++) {
                if (firstVector[i] == secondVector[i]) {
                    ok = true;
                } else {
                    ok = false;
                }
            }

        }
        if (ok = true) {
            System.out.println(ok);
        } else {
            System.out.println(ok);
        }

//        Write a java program that will concatenate 2 arrays.
//        For example Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing [1,2,3,4,5,6,7,8]

    }
}


package Homework1;

public class ex2_AverageAndSum {
    public static void main(String[] args) {

        int a = 1;
        int b = 100;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println("suma valorilor din intervalul " + a + " si " + b + " este: " + sum);

        double avg = (a + b) / 2;

        System.out.println("media este:" + avg);
    }
}

/*
Cerinta:
Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
For example, for range numbers 1 to 100 output should be:
Sum for range 1 to 100 : 5050
Average for range 1 to 100 : 50.0
*/


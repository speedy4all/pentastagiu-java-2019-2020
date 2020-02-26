package Homework1;

public class ex3_Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        double avg = 0;
        int num = 20;
        int sum = 0;

        System.out.println("First 20 Fibonacci numbers are: ");
        System.out.print(b + " ");

        for (int i = 2; i <= num; i++) {
            int sumOfPrevTwo = a + b;
            a = b;
            b = sumOfPrevTwo;
            System.out.print(sumOfPrevTwo + " ");
            sum = sum + sumOfPrevTwo;
        }
        System.out.println("");
        avg = sum / num;
        System.out.println(avg);
    }
}

/*Cerinta:
Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
For an input of x = 20 the output should be:

The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
*/
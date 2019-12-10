package Homework1;

public class ex3_fibonacci {
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
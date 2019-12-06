import java.util.*;

public class Ex4 {

    public static void main(String[] args) {

        /* Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
For an input of x = 20 the output should be:

The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int input = sc.nextInt();

        int nr1 = 0;
        int nr2 = 1;
        int suma = 0;
        System.out.print(nr2);
        for(int i = 2; i <= input; i++) {
            int nr3 = 0;
            nr3 = nr1+nr2;
            System.out.print(" " + nr3);
            nr1=nr2;
            nr2=nr3;
            suma = suma + nr3;
        }
        System.out.println(" ");
        double average = 0;
        average = suma / input;
        System.out.println("Average = " + average);

        sc.close();



    }
}

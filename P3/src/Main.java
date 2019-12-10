import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        int sum = b;

        System.out.println("The first " + number + " Fibonacci numbers are: ");
        for(int i = 1; i <= number; i++){
            System.out.print(b + " ");
            c = a + b;
            a = b;
            b = c;
            sum += a;
        }
        System.out.println();
        System.out.println((float)sum/number);

    }
}

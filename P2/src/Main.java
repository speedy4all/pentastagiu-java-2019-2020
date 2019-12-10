import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter a bigger number: ");
        int number2 = sc.nextInt();

        if(number2 < number1){
            System.out.println("Enter a bigger number than " + number1);
            number2 = sc.nextInt();
        }

        int sum = 0;
        int i = 0;

        while( number1<= number2){
            sum += number1;
            number1++;
            i++;
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + (double)(sum/i));


    }
}

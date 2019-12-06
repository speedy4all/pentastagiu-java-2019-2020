import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        //Write a program that will sum up all numbers from 0 up to a target number.
        //For example, for an input number 5, result should be 15 (0+1+2+3+4+5)

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int input = Integer.parseInt(sc.nextLine());

        int suma = 0;
        for (int i = 0; i <= input; i++) {
            suma += i;
        }

        System.out.println(suma);

        sc.close();
    }
}

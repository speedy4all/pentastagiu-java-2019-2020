import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
/* Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.
For example, for range numbers 1 to 100 output should be:
Sum for range 1 to 100 : 5050
Average for range 1 to 100 : 50.0 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int firstInput = Integer.parseInt(sc.nextLine());
        System.out.println("Introduceti al doilea numar" );
        int secondInput = Integer.parseInt(sc.nextLine());

        int suma = 0;
        int index = 0;
        for(int i = firstInput; i <= secondInput; i++) {
            suma += i;
            index++;
        }
        System.out.println("Suma de la " + firstInput + " la " + secondInput + " este " + suma);

        double average = 0;
        average = suma / index;
        System.out.println("Average = " + average);

        sc.close();
    }
}


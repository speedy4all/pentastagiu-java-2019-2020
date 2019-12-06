//write a program that will sum up all numbers from 0 up to a target number
import java.util.Scanner;

public class Tema1Problema1 {

    public static void main(String[] args){

        Scanner myInput=new Scanner(System.in);

        int targetNumber;
        int suma=0;
        System.out.println("Introduceti numarul:");
        targetNumber=myInput.nextInt();


        for(int i=0; i<targetNumber; i++)
        {
           suma=suma+i;
        }
        System.out.println("Suma este:");
        System.out.println(suma);


    }


}


//write a program that will calculate the average and sum of all numbers between the range of 2 numbers

import java.util.Scanner;
public class Tema1Problema2 {

    public static void main(String[] args){

        Scanner myInput=new Scanner(System.in);

        int primulNumar;
        int ultimulNumar;
        System.out.println("Introduceti primul numar:");
        primulNumar=myInput.nextInt();
        System.out.println("Introduceti ultimul  numar:");
        ultimulNumar=myInput.nextInt();

        int contorNumere=0;
        float media;
        int suma=0;
        for (int i=primulNumar; i<=ultimulNumar;i++){
            suma=suma+i;
            contorNumere++;

        }
        media=(float) suma/contorNumere;
        System.out.println("Suma numerelor este:"+suma);

        System.out.println("Media aritmetica a numerelor este:"+media);

    }
}

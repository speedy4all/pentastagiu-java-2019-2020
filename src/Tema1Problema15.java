//write a program that will test if a given string is palindrom
// la problema asta daca introduc un string care e palindrom imi afiseaza true,
// daca introduc unul care nu e imi apare process finished with code -1

import java.util.Scanner;

public class Tema1Problema15 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti cuvantul: ");
        String cuvant= sc.nextLine();

        boolean verifPalindrom=true;

        int i=0;
        int j=(cuvant.length()-1);
        while (i<j){
            if (cuvant.charAt(i)!=cuvant.charAt(j)){
                verifPalindrom=false;
            }
            else{
                i++;
                j--;
            }
        }

        if (verifPalindrom==true){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }

    }
}

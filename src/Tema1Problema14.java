//write a program that will insert a # between any duplicate letters that are placed next to each other
//nu-mi dau seama unde gresesc aici. imi apare process finished with code -1
import java.lang.StringBuilder;
        import java.util.Scanner;

public class Tema1Problema14 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti cuvantul: ");
        StringBuilder cuvant  = new StringBuilder(scan.nextLine());
        cuvant.append(scan.nextLine());
        char ch='#';

        for (int i=1; i<cuvant.length(); i++) {
            if (cuvant.charAt(i)==cuvant.charAt(i-1)){
                cuvant.insert(i,ch);
            }
        }

        String result = cuvant.toString();

        // Print result.
        System.out.println(result);
        System.out.println(cuvant);
    }
}

import java.util.*;

public class Ex9 {
    // Write a Java program to find the number of even and odd integers in a given array of integers
//
//For example.
//Given the following array [13,20,14,5,2,8] the output should be:
//
//Odd elements count : 2
//Even elements count : 4
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti lungimea sirului: ");
        int lungime = sc.nextInt();

        int sir[] = new int[lungime];

        System.out.println("Intoruceti elementele sirului:");
        for (int i = 0; i < lungime; i++) {
            sir[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sir));

        int num = 0;
        for(int i = 0; i < sir.length; i++)
        {
            if(sir[i] % 2 == 0)
                num++;
        }
        System.out.println("Odd elements count: " + (sir.length - num));
        System.out.println("Even elements count: " + num);
        sc.close();

    }
}

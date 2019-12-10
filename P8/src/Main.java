import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] array = {13,20,14,5,2,8};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        while(number > array.length || number < 0){
            System.out.println("Enter another number: ");
            number = sc.nextInt();
        }

        for(int i=0; i < array.length; i++){
            if(i == number){
                System.out.println(array[i]);
            }
        }
    }
}

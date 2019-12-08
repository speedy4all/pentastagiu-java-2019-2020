import java.util.Scanner;

public class EqualsArrays {
    public static void main(String[] args) {

        int size1;
        System.out.println("Please enter the first array size: ");
        Scanner sizeNumber1 = new Scanner(System.in);
        size1 = sizeNumber1.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Please enter the first array elements: ");

        for (int i=0; i<size1; i++){
            array1 [i] = sizeNumber1.nextInt();
        }

        int size2;
        System.out.println("Please enter the second array size: ");
        Scanner sizeNumber2 = new Scanner(System.in);
        size2 = sizeNumber2.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Please enter the second array elements: ");

        for (int n = 0; n < size2; n++){
            array2 [n] = sizeNumber2.nextInt();
        }

        for (int x = 0; x < size1; x++ )
        if (array1[x] != array2[x] && size1 == size2) {
            System.out.println("Arrays are equals.");
        }else{
            System.out.println("Arrays are NOT equals.");
        }

        // Nu inteles de ce returneaza mai multe raspunsuri la final



    }
}

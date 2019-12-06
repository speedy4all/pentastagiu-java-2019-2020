import java.util.*;

public class Ex8 {

    public static void main(String[] args) {
//Write a java program to return the index of a target element.
//
//For example:
//Given  the following array [13,20,14,5,2,8] and a target element 5
// the output should be : 3 (because 5 is located at index 3 in the array)

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti lungimea sirului: ");
        int length = sc.nextInt();

        int sir[] = new int[length];
        System.out.println("Introduceti elementele sirului: ");
        for(int i = 0; i < length; i++) {
            sir[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(sir));

        System.out.println("Introduceti un numar din sirul respectiv: ");
        int input = sc.nextInt();
        int index = getArrayIndex(sir, input);
        System.out.println("Indexul pentru elementul " + input + " este " + index);
        sc.close();
    }

    public static int getArrayIndex(int[] arr,int value) {
        int k=0;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] == value){
                k =i;
                break;
            }
        }
        return k;
    }
}

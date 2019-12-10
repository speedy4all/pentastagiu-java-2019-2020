import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int i = 0;

        int length = array1.length + array2.length;
        int[] array = new int[length];

        for(int el : array1){
            array[i] = el;
            i++;
        }
        for(int el : array2){
            array[i] = el;
            i++;
        }
        System.out.println(Arrays.toString(array));

    }
}

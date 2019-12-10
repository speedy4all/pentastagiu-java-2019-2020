public class Main {
    public static void main(String[] args){
        int[] array = {13,20,14,5,2,8};
        int max = 0;
        int min = 10000000;
        int sum = 0;
        int i;

        for( i = 0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
            sum += array[i];
        }

        System.out.println("Max :" + max);
        System.out.println("Min :" + min);
        System.out.println("Average :" + (float)sum/i);
    }
}

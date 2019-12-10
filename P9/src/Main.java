public class Main {
    public static void main(String[] args){
        int[] array = {13,20,14,5,2,8};
        int j=0;
        int k=0;

        for(int i=0; i< array.length; i++){
            if(array[i] %2 == 0){
                j++;
            }else{
                k++;
            }
        }
        System.out.println("Odd elements count: " + k);
        System.out.println("Even elements count: " + j);
    }
}

public class Main {
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        int j = 0;

        if(array1.length == array2.length){
            for(int i=0; i <= array1.length - 1; i++){
                if(array1[i] == array2[i]) {
                    j++;
                }
                else {
                    System.out.println("FALSE");
                    break;
                }
            }
        }
        else{
            System.out.println("FALSE");
        }
        if(j == array1.length){
            System.out.println("TRUE");
        }
    }
}

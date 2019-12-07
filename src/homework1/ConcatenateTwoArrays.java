package homework1;

public class ConcatenateTwoArrays {
    public static void main(String[] args) {

        Integer[] firstArray={1,2,3};
        Integer[] secondArray={4,5,6,7,8};
        Integer[] thirdArray=concatenatingArrays(firstArray, secondArray);

        for(int i=0;i<thirdArray.length;i++){
            System.out.print(thirdArray[i] + " ");
        }
    }

    public static Integer[] concatenatingArrays(Integer[] firstArray, Integer[] secondArray){
        Integer thirdArray[] =new Integer[firstArray.length+secondArray.length];
        int i;
        for( i=0;i<firstArray.length;i++)
            thirdArray[i]=firstArray[i];
        for(int j=0;j<secondArray.length;j++)
            thirdArray[i++]=secondArray[j];
        return thirdArray;
    }
}

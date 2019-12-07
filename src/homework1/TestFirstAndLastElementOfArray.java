package homework1;

public class TestFirstAndLastElementOfArray {
    static Boolean arrayStatus;
    public static void main(String[] args){
        Integer[] myArray1=new Integer[] {12,52,8,31,43,10};
        Integer[] myArray2=new Integer[] {55,10,3,52,22,65,55};
        testingArray(myArray1);
    }

    public static Boolean testingArray(Integer[] myArray){
        Integer firstIndex=myArray[0];
        Integer lastIndex=myArray[myArray.length-1];
        if(firstIndex==lastIndex) {
            arrayStatus=true;
            System.out.println("TRUE");
        }else {
            arrayStatus = false;
            System.out.println("FALSE");
        }
        return arrayStatus;

    }
}

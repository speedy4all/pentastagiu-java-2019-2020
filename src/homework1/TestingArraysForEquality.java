package homework1;

import java.util.Arrays;

public class TestingArraysForEquality {
    public static void main(String[] args) {

        Integer[] firstArray={1,3,4,5,6,8};
        Integer[] secondArray={1,3,4,5,6,8};

        arraysEquality(firstArray, secondArray);
    }
    public static Boolean arraysEquality(Integer[] firstArray, Integer[] secondArray){
        Boolean arraysStatus;
        if(Arrays.equals(firstArray, secondArray)){
            arraysStatus=true;
            System.out.println("TRUE");
        }else{
            arraysStatus=false;
            System.out.println("FALSE");
        }
        return arraysStatus;
    }
}

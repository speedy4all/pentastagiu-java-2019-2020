package homework1;

public class ReturnMinMaxAverageOfArray {
    public static void main(String[] args) {

        Integer[] myArray={5,8,14,3,19,44,20};
        Integer minNumber=returnMinOfArray(myArray);
        Integer maxNumber=returnMaxOfArray(myArray);
        Double average=returnAverageOfArray(myArray);

        System.out.println("Minimum value is " + minNumber);
        System.out.println("Maximum value is " + maxNumber);
        System.out.println("Average is " + average);

    }

    public static Integer returnMinOfArray(Integer[] myArray) {
        Integer minNumber = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minNumber) {
                minNumber = myArray[i];
            }
        }
        return minNumber;
    }
    public static Integer returnMaxOfArray(Integer[] myArray){
        Integer maxNumber = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxNumber) {
                maxNumber = myArray[i];
            }
        }
        return maxNumber;
    }

    public static Double returnAverageOfArray(Integer[] myArray){
        Integer sum=0;
        for(int i=0;i<myArray.length;i++){
            sum+=myArray[i];
        }
        Double average=(double)sum/myArray.length;
        return average;
    }
}

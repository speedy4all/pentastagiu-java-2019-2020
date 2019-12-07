package homework1;

public class NumberOfOddAndEvenIntegersFromArray {
    public static void main(String[] args) {
        Integer[] myArray ={2,54,3,16,26,33,29,47,11,31};
        Integer oddNumbers=oddNumbers(myArray);
        Integer evenNumbers=evenNumbers(myArray);
    }

    public static Integer evenNumbers(Integer[] myArray){
        Integer numberOfEvenNumbers=0;
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]%2==0){
                numberOfEvenNumbers++;
            }
        }
        System.out.println("Number of even numbers = " + numberOfEvenNumbers);
        return numberOfEvenNumbers;
    }
    public static Integer oddNumbers(Integer[] myArray){
        Integer numberOfOddNumbers=0;
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]%2!=0){
                numberOfOddNumbers++;
            }
        }
        System.out.println("Number of odd numbers = " + numberOfOddNumbers);
        return numberOfOddNumbers;
    }
}



public class DataTypesHomework1 {

    public void problem1(int number){
        int sum = 0;
        for (int i = 0; i <= number; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void problem2(int number1, int number2){
        int sum = 0;
        float average =  0.0f;
        for (int i = number1; i <= number2; i++){
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
        average = sum/(number2 - number1 + 1);
        System.out.println("Average = " + average);
    }

    public void problem3(int number){
        int n1 = 0, n2 = 1, count = 1;
        float sum = n1 + n2;
        float average = 1.0f;
        int next = 0;
        if(number == 1){
            System.out.println(number);
            System.out.println("Average = " + average);
            return;
        }

        System.out.print( n2 + " ");
        while (count < number)
        {
            next = n1 + n2;
            sum = sum + next;
            n1 = n2;
            n2 = next;
            count ++;
            System.out.print(next + " ");
        }
        average = sum / number;
        System.out.println("\nAverage = " + average);
    }


    public void problem4(int[]array){
        boolean isEqual = false;
        if(array.length < 2){
            System.out.println("The length of the array must be 2.");
        }
       // System.out.println("length = " + array.length);
        if (array[0] == array[array.length - 1] ? isEqual = true :  false);
        if (isEqual){
            System.out.println("TRUE");
        } else{
            System.out.println("FALSE");
        }

    }

    public void problem5(int[] arrayOne, int[] arrayTwo){
        boolean isEqual = false;

        if(arrayOne.length == arrayTwo.length){
            for (int i = 0; i < arrayOne.length; i++){
                if(arrayOne[i] == arrayTwo[i]){
                    isEqual = true;
                } else{
                    isEqual = false;
                }
            }
        } else {
            isEqual = false;
        }

        if(arrayOne.length == 0 && arrayTwo.length == 0) {
            isEqual = true;
        }

        if(isEqual){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public void problem6(int[] arrayOne, int[] arrayTwo ){
        int[] result = new int[arrayOne.length + arrayTwo.length];

        for (int i = 0; i < arrayOne.length; i++){
            result[i] = arrayOne[i];
        }

        for (int j = 0; j < arrayTwo.length; j++){
            result[arrayOne.length + j ] = arrayTwo[j];
        }
        for (int k = 0; k < result.length; k++){
            System.out.print(result[k]);
        }
     }

     public void problem7 (int[] array){
         double sum = array[0];
         int min = array[0];
         int max = array[0];
         for (int i = 1; i < array.length; i++){
             if(min > array[i]){
                 min = array[i];
             }
             if(max < array[i]){
                 max = array[i];
             }
             sum = sum + array[i];
         }
        double average = sum / array.length;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.format("Average: %.1f", average);

     }

     public void problem8 (int[] array, int target){
        if (array.length != 0){
            for (int i = 0; i < array.length; i++){
                if (array[i] == target){
                    System.out.println(i);
                    break;
                }
            }
        } else {
            return;
        }
     }

     public void problem9 (int[] array){
        int countOdd = 0;
        int countEven = 0;
        if(array.length == 0){
            System.out.println("Array is empty!");
            return;
        }
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Odd elements count: " + countOdd);
        System.out.println("Even elements count: " + countEven);
     }

     public void problem10(String base, String target){
        boolean isFound = false;
        int count = 0;
        if(base.length() < target.length()){
            System.out.println("FALSE");
            return;
        }

        for (int i = 0; i < base.length() - target.length() + 1; i++){
            for (int j = 0; j < target.length(); j++){
                if(String.valueOf(base.charAt(j+i)).equals(String.valueOf(target.charAt(j)))){
                    count++;
                    if (count == target.length()){
                        isFound = true;
                        break;
                    }
                } else{
                    count = 0;
                    break;
                }

            }
        }
        System.out.println(isFound);


     }

     public void problem11(String val, char character){
        int count = 0;
        for (int i = 0; i < val.length(); i++){
            if(val.charAt(i)==character ){
                count++;
            }
        }
        System.out.println(count);
     }

     public void problem12(String base, String target){
        boolean found = true;
        for (int i = 0; i < target.length(); i++){
            if(target.charAt(target.length()-i-1) != base.charAt(base.length()-i-1)){
                found = false;
                break;
            }
        }
        System.out.println(found);
     }

     public void problem13(String value){
        StringBuilder sb = new StringBuilder();
         for (char c = 'a'; c <= 'z'; c++){
             sb.append(c);
         }
         for (int i = 0; i < value.length(); i++){
             for (int j = 0; j < sb.length(); j++){
                 if(value.charAt(i) == sb.charAt(j)){
                     System.out.print(j);
                 }
             }


         }

     }

     public void problem14(String value){
        StringBuilder newVal = new StringBuilder();

        for(int i = 0; i < value.length() -1 ; i++){
            newVal = newVal.append(String.valueOf(value.charAt(i)));
            if (String.valueOf(value.charAt(i)).equals(String.valueOf(value.charAt(i+1)))){
                newVal = newVal.append("#");
            }
        }
        newVal.append(String.valueOf(value.charAt(value.length()-1)));

        System.out.println(newVal);
     }


     public void problem15(String stringOne){
        StringBuilder reverse = new StringBuilder();
        boolean isPalindrom = true;
        for (int i =0; i<  stringOne.length() / 2; i++){
            if (!String.valueOf(stringOne.charAt(i)).equals(String.valueOf(stringOne.charAt(stringOne.length()-i-1)) )){
                isPalindrom = false;
                break;
            }

         }
         System.out.println(isPalindrom);
     }


    public static void main(String[] args) {

        DataTypesHomework1 dataTypesHomework1 = new DataTypesHomework1();
        //Problem1
        System.out.println("Problem 1 result : " );
        dataTypesHomework1.problem1(5);
        System.out.println("\n");

        //Problem2
        System.out.println("Problem 2 result: ");
        dataTypesHomework1.problem2(1, 100);
        System.out.println("\n");

        //Problem3
        System.out.println("Problem 3 result: ");
        dataTypesHomework1.problem3(20);
        System.out.println("\n");

        //Problem4
        System.out.println("Problem 4 result: ");
        int[] array =  {13,6,2,8,2,3};
        dataTypesHomework1.problem4(array);
        System.out.println("\n");

        //Problem5
        System.out.println("Problem 5 result:  ");
        int[] arrayOne = {};
        int[] arrayTwo = {1,2,4,3};
        dataTypesHomework1.problem5(arrayOne, arrayTwo);
        System.out.println("\n");

        //Problem6
        System.out.println("Problem 6 result: ");
        int[] firstArray = {1,2,3,4};
        int[] secondArray = {5,6,7,8};
        dataTypesHomework1.problem6(firstArray, secondArray);
        System.out.println("\n");

        //Problem7
        System.out.println("Problem 7 result: ");
        int[] arr = {13,20,14,5,2,8};
        dataTypesHomework1.problem7(arr);
        System.out.println("\n");

        //Problem8
        System.out.println("Problem 8 result: ");
        int[] testArray = {13,20,14,5,2,8};
        int target = 5;
        dataTypesHomework1.problem8(testArray, target);
        System.out.println("\n");

        //Problem9
        System.out.println("Problem 9 result: ");
        int[] arrayToTest = {13,20,14,5,2,8};
        dataTypesHomework1.problem9(arrayToTest);
        System.out.println("\n");

        //Problem10
        System.out.println("Problem 10 result: ");
        String base = "Hello world";
        String targetForSearch = "java";
        dataTypesHomework1.problem10(base, targetForSearch);
        System.out.println("\n");

        //Problem11
        System.out.println("Problem 11 result: ");
        String val = "Hello java world";
        char character = 'a';
        dataTypesHomework1.problem11(val, character);
        System.out.println("\n");

        //Problem12
        System.out.println("Problem 12 result: ");
        String baseValue = "Hello java world";
        String targetValue = "orld";
        dataTypesHomework1.problem12(baseValue, targetValue);
        System.out.println("\n");


        //Problem13
        System.out.println("Problem 13 result: ");
        String value = "abcd";
        dataTypesHomework1.problem13(value);
        System.out.println("\n");

        //Problem14
        System.out.println("Problem 14 result: ");
        dataTypesHomework1.problem14("Hello worlddd");
        System.out.println("\n");

        //Problem15
        System.out.println("Problem 15 result: ");
        dataTypesHomework1.problem15("aaabccbaaa");
        System.out.println("\n");
    }
}

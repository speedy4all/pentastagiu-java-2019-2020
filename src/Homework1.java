import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        //1

        //take number from user
        System.out.println("#####################Exercise 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your number!");
        int number1 = sc.nextInt();
        int sum1 = 0;

        for(int i = 0; i<=number1; i++){
            sum1 += i;
        }
        System.out.println("The sum of numbers from 0 to " + number1 + " is " + sum1 + ".");


        //2
        System.out.println("#####################Exercise 2");
        System.out.println("Insert your number!");
        int number2 = sc.nextInt();
        int sum2 = 0;

        for(int i = 0; i<=number2; i++){
            sum2 += i;
        }
        double avg1 = sum2/number2;

        System.out.println("The sum of numbers from 0 to " + number2 + " is " + sum2 + ".");
        System.out.println("The avg of numbers from 0 to " + number2 + " is " + avg1 + ".");

        //3
        System.out.println("#####################Exercise 3");

        System.out.println("How many fibonacci numbers do you want?");
        int noFibonacci = sc.nextInt();
        int t1 = 1, t2 = 1;
        System.out.println("First " + noFibonacci + " fibonacci numbers: ");
        for (int i = 1; i <= noFibonacci; i++){
            System.out.print(t1 + " ");
            int sumF = t1 + t2;
            t1 = t2;
            t2 = sumF;
        }
        System.out.println("");



        //4
        System.out.println("#####################Exercise 4");
        int[] arr1 = {13,6,2,8,2,13};
        boolean status= true;

        if(arr1[0]==arr1[arr1.length-1]){
        }else{
            status = false;
        }

        System.out.println("For array " + Arrays.toString(arr1)+ " the numbers are equal? " + status);


        //5
        System.out.println("#####################Exercise 5");

        int[] arr3 = {};
        int[] arr4 = {};
        boolean equal = true;

        if(arr3.length==arr4.length) {
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] == arr4[i]) {
                } else {
                    equal = false;
                }
            }
        }else{
            equal = false;
        }
        System.out.println("Array " + Arrays.toString(arr3) + " equal with " + Arrays.toString(arr4)+ " -> " + equal);




        //6
        System.out.println("#####################Exercise 6");

        int[] arr5 = {1,2,5};
        int[] arr6 = {1,2};

        int lenArr5 = arr5.length;
        int lenArr6 = arr6.length;

        int[] arr7 = new int[lenArr5+lenArr6];

        System.arraycopy(arr5, 0 , arr7, 0, lenArr5);
        System.arraycopy(arr6, 0 , arr7, lenArr5, lenArr6);
        System.out.println("The concatenated array is : " + Arrays.toString(arr7));



        //7
        System.out.println("#####################Exercise 7");

        int[] arr8 = {13, 20, 24, 5, 2, 8};
        int sum=0;
        double avg2 = 0.0;
        int max, min= 0;
        max = arr8[0];
        min = arr8[0];

        for (int i =0; i<arr8.length; i++){
            sum += arr8[i];
            avg2 = sum/arr8.length;

            if (arr8[i]>max){
                max = arr8[i];
            }
            if (arr8[i]<min){
                min = arr8[i];
            }
        }
        System.out.println("For array " + Arrays.toString(arr8) + " the values are" );
        System.out.println("Max value: " +max);
        System.out.println("Min value: " + min);
        System.out.println("Avg value: " + avg2);



        //8
        System.out.println("#####################Exercise 8");

        int[] arr9 = {13, 20, 14, 5, 2, 8};
        System.out.println("Insert the value from array " + Arrays.toString(arr9));
        int value = sc.nextInt();
        int index = 0;

        for(int i=0; i<arr9.length; i++){
            if(value==arr9[i]){
                index = i;
            }
        }
        System.out.println("The index of value " + value + " is " + index);


        //9
        System.out.println("#####################Exercise 9");

        int[] arr10 = {13, 20, 14, 5, 2, 8};
        int countOdd = 0;
        int countEven = 0;

        for(int i=0; i<arr10.length;i++){
            if(arr10[i]%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("Number of odd elements: " + countOdd);
        System.out.println("Number of even elements: " + countEven);



        //10
        System.out.println("#####################Exercise 10");

        String text = "Hello java world";
        String text1 = "java";
        boolean check = true;
        if(text.contains(text1)){
        }else{
            check=false;
        }
        System.out.println("The text: " + text1 + " is inside of " + text+ " ? --> " + check);


        //11
        System.out.println("#####################Exercise 11");

        //the string "Hello java world" is taken from previous exercise

        char ch = 'a';
        int countChar = 0;
        for(int i=0; i<text.length();i++){
            if(text.charAt(i)==ch){
                countChar++;
            }
        }
        System.out.println("The char: " + ch + " is appearing for " + countChar + " times.");


        //12
        System.out.println("#####################Exercise 12");

        //the string "Hello java world" is taken from previous exercise
        String end = "world";
        boolean checkEnd = true;

        if(text.endsWith(end)){
        }else{
            checkEnd = false;
        }
        System.out.println("The string " + text +" is ending with " + end + " ? --> " + checkEnd);


        //13
        System.out.println("#####################Exercise 13");

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;

        String text3 = a+""+b+""+c+""+d;
        System.out.println("The text for 'abcd' is " + text3);


        //14
        System.out.println("#####################Exercise 14");

        String textNew = "Hello world";

        StringBuilder build = new StringBuilder(textNew);

        for(int i=0; i<textNew.length()-1;++i){
            if(textNew.charAt(i)==textNew.charAt(++i)){
                build = build.insert(i,"#");
            }
            textNew = build.toString();
        }
        System.out.println("The text with the inserts:");
        System.out.println(build);


        //15
        System.out.println("#####################Exercise 15");

        System.out.println("Write an string to check if the word is palindrome!");
        StringBuffer palindrome =new StringBuffer(sc.next());

        if(palindrome == palindrome.reverse()){
            System.out.println("The word " + palindrome + " is an palindrome.");
        }else{
            System.out.println("The word " + palindrome + " is not an palindrome.");
        }

    }
}

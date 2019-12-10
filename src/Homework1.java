import java.util.Scanner;

public class Homework1 {


    public static void main(String[] args) {
        System.out.print("Please select and exercise from 1 to 15: ");

        Scanner input;
        input = new Scanner(System.in);

        int exercise;
        exercise = input.nextInt();

        boolean condition;
        condition = false;

        while (condition == false)
        {
            switch (exercise) {
                case 1:
                    exercise1();
                    condition = true;
                    break;
                case 2:
                    exercise2();
                    condition = true;
                    break;
                case 3:
                    exercise3();
                    condition = true;
                    break;
                case 4:
                    exercise4();
                    condition = true;
                    break;
                case 5:
                    exercise5();
                    condition = true;
                    break;
                case 6:
                    exercise6();
                    condition = true;
                    break;
                case 7:
                    exercise7();
                    condition = true;
                    break;
                case 8:
                    exercise8();
                    condition = true;
                    break;
                case 9:
                    exercise9();
                    condition = true;
                    break;
                case 10:
                    exercise10();
                    condition = true;
                    break;
                case 11:
                    exercise11();
                    condition = true;
                    break;
                case 12:
                    exercise12();
                    condition = true;
                    break;
                case 13:
                    exercise13();
                    condition = true;
                    break;
                case 14:
                    exercise14();
                    condition = true;
                    break;
                case 15:
                    exercise15();
                    condition = true;
                    break;
                default:
                    System.out.print("The number provided is wrong. Please enter a number from 1 to 15:");
                    input = new Scanner(System.in);
                    exercise = input.nextInt();
            }
        }
    }

    public static void exercise1()
    {
        int Number = 5;
        int sum = 0;
        for(int i = 0; i<=Number; ++i){
            sum+=i;
        }
        System.out.println("The sum of the first "+Number+" numbers is: "+sum);
    }

    public static void exercise2()
    {
        int x = 1;
        int y = 100;
        int sum = 0;
        double avg;
        for(int i = x; i <= y; ++i) {
            sum+=i;
        }
        avg = sum / (y - x + 1);
        System.out.println("Sum for range "+x+" to "+y+" : "+sum);
        System.out.println("Average for range "+x+" to "+y+" : "+avg);
    }

    public static void exercise3()
    {
        int x = 1;
        int y = 1;
        int z;
        int sum = 2;
        int v = 5;
        double avg;
        System.out.print(x + " " + y);
        for(int i = 3; i <= v; ++i) {
            z = x + y;
            System.out.print(" " + z);
            sum += z;
            x = y;
            y = z;
        }
        avg = (double) sum / v;
        System.out.println("\nThe average is " + avg );


    }

    public static void exercise4()
    {
        int[] Array1 = {13, 6, 2, 8, 2, 13};
        String textArray = "[";

        for(int i = 0; i < Array1.length; ++i) {
            textArray = textArray + Array1[i];
            if (i < Array1.length-1)
            {
                textArray = textArray + ",";
            }
        }
        textArray = textArray + "]";

        boolean ComparingCondition;
        if(Array1.length>=2) {
            if(Array1[0] == Array1[Array1.length - 1]) {
                ComparingCondition = true;
            }
            else {
                ComparingCondition = false;
            }
            System.out.println("For the following input " +textArray+ " the output should be: " + ComparingCondition);
        }
        else {
            System.out.println("The array has not a good length");
        }
    }

    public static void exercise5()
    {
        boolean areEqual = true;
        int[] Array1 = {1,2,3,4};
        int[] Array2 = {1,2,3,4};

        String textArray1 = "[";
        String textArray2 = "[";

        for(int i = 0; i < Array1.length; ++i) {
            textArray1 = textArray1 + Array1[i];
            if (i < Array1.length-1)
            {
                textArray1 = textArray1 + ",";
            }
        }

        for(int i = 0; i < Array2.length; ++i) {
            textArray2 = textArray2 + Array2[i];
            if (i < Array2.length-1)
            {
                textArray2 = textArray2 + ",";
            }
        }

        textArray1 = textArray1 + "]";
        textArray2 = textArray2 + "]";

        if(Array1.length != Array2.length){
            areEqual = false;
        }
        else
        {
            for(int i = 0; i < Array1.length; ++i) {
                if(Array1[i] != Array2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }
        System.out.println("For the following arrays "+textArray1+" and "+textArray2+" the output should be "+areEqual);
    }

    public static void exercise6()
    {
        int[] FirstArray = {1, 2, 3, 4};
        int[] SecondArray = {5, 6, 7, 8};
        int[] ThirdArray = new int[FirstArray.length + SecondArray.length];
        int i = 0;
        int ii;
        int j = 0;


        String textArray1 = "[";
        String textArray2 = "[";
        String textArray3 = "[";

        for(ii = 0; ii < FirstArray.length; ++ii) {
            textArray1 = textArray1 + FirstArray[ii];
            if (ii < FirstArray.length-1)
            {
                textArray1 = textArray1 + ",";
            }
        }

        for( ii = 0; ii < SecondArray.length; ++ii)
        {
            textArray2 = textArray2 + SecondArray[ii];
            if (ii < SecondArray.length-1)
            {
                textArray2 = textArray2 + ",";
            }
        }

        textArray1 = textArray1 + "]";
        textArray2 = textArray2 + "]";

        while(i < FirstArray.length) {
            ThirdArray[i] = FirstArray[i];
            ++i;
        }
        while(j < SecondArray.length) {
            ThirdArray[i] = SecondArray[j];
            ++j;
            ++i;
        }

        for(ii = 0; ii < ThirdArray.length; ++ii) {
            textArray3 = textArray3 + ThirdArray[ii];
            if (ii < ThirdArray.length-1)
            {
                textArray3 = textArray3 + ",";
            }
        }

        textArray3 = textArray3 + "]";

        System.out.println("Given 2 arrays "+textArray1+" and "+textArray2+" the output should be a new array containing  "+textArray3);


    }

    public static void exercise7()
    {
        int[] Array1 = {13, 20, 14, 5, 2, 8};
        int minArray = Array1[0];
        int maxArray = Array1[0];
        int sumArray = Array1[0];
        double avg;

        String textArray = "[";

        for(int i = 0; i < Array1.length; ++i) {
            textArray = textArray + Array1[i];
            if (i < Array1.length-1)
            {
                textArray = textArray + ",";
            }
        }
        textArray = textArray + "]";

        for(int i = 1; i < Array1.length; ++i) {
            sumArray += Array1[i];
            if(Array1[i] < minArray) {
                minArray = Array1[i];
            }
            if(Array1[i] > maxArray) {
                maxArray = Array1[i];
            }

        }
        avg = (double) sumArray / Array1.length;

        System.out.println("Given the following array " +textArray+ " the output should be: ");
        System.out.println("MaxV: " + maxArray);
        System.out.println("MinV: " + minArray);
        System.out.println("Avg: " + avg);

    }

    public static void exercise8()
    {
        boolean ifoundit = false;
        int searchingNumber = 2;
        int NumberPosition;
        int[] Array1 = { 13,20,14,5,2,8 };
        int i;

        String textArray = "[";

        for(i = 0; i < Array1.length; ++i) {
            textArray = textArray + Array1[i];
            if (i < Array1.length-1)
            {
                textArray = textArray + ",";
            }
        }
        textArray = textArray + "]";

        for(i = 0; i < Array1.length; ++i) {
            if(Array1[i] == searchingNumber) {
                ifoundit = true;
                NumberPosition = i;
                System.out.println("Given the following array " +textArray+ " and a target element " + searchingNumber + " the output should be : " + NumberPosition);
            }
        }
        if(ifoundit == false) {
            System.out.println("The number " + searchingNumber + " was not found in the "+textArray);
        }

    }

    public static void exercise9()
    {
        int[] Array1 = { 13, 20, 14, 5, 2, 8 };
        int evenCounter = 0;
        int oddCounter = 0;
        int i;
        String textArray = "[";

        for(i = 0; i < Array1.length; ++i) {
            textArray = textArray + Array1[i];
            if (i < Array1.length-1)
            {
                textArray = textArray + ",";
            }
        }
        textArray = textArray + "]";

        for( i = 0; i < Array1.length; ++i) {
            if(Array1[i] % 2 == 0){
                evenCounter ++;
            }
            else{
                oddCounter++;
            }
        }

        System.out.println("Given the following array " +textArray+ " the output should be:");
        System.out.println("Odd elements count: " + oddCounter);
        System.out.println("Even elements count: " + evenCounter);
    }

    public static void exercise10()
    {
        String text1 = "Hello java world";
        String text2 = "java";
        boolean ifoundit;
        ifoundit = text1.contains(text2);
        System.out.println("Given the following base String '"+text1+"' and the target test String '"+text2+"' the output should be "+ifoundit);
    }

    public static void exercise11()
    {
        String text1 = "Hello java world";
        char letter = 'l';
        int letterCounter = 0;
        for(int i = 0; i < text1.length(); ++i) {
            if(text1.charAt(i) == letter){
                letterCounter++;
            }
        }
        System.out.println("Given the following base String '"+text1+"' and the target character '"+letter+"' the output should be "+letterCounter);
    }

    public static void exercise12()
    {
        String text1 = "Hello java world";
        String text2 = "rld";
        boolean ifoundit;
        ifoundit = text1.endsWith(text2);
        System.out.println("Given the following base String '"+text1+"' and '"+text2+"' the output should be "+ifoundit);
    }

    public static void exercise13()
    {
        String textin = "Hello java world";
        int aux;
        int letterCounter;
        String textOut = "";
        for(int i = 0; i < textin.length(); ++i){
            letterCounter = textin.charAt(i);
            if(letterCounter >= 'A' && letterCounter <='Z' ) {
                letterCounter = letterCounter - 'A' + 'a';
            }
            if(letterCounter < 'a' || letterCounter > 'z') {
                continue;
            }
            aux = letterCounter - 'a';
            textOut = textOut + aux;
        }
        System.out.println("For the given string '"+textin+"' the output should be "+textOut);

    }

    public static void exercise14()
    {
        String text1 = "Hello javva worldd";
        String text2 = "";
        for(int i = 0 ; i < text1.length() ;++i){
            text2+=text1.charAt(i);
            if(i < text1.length() - 1 && text1.charAt(i) == text1.charAt(i+1))
            {
                text2+='#';
            }
        }
        System.out.println("Given the following string '"+text1+"' the output should be '"+text2+"'");
    }

    public static void exercise15()
    {
        boolean PalindromCond = true;
        String text1 = "aaabccbaaa";
        int nr = text1.length() / 2;
        int textlength = text1.length() - 1;
        for(int i = 0; i <= nr; ++i){
            if(text1.charAt(i) != text1.charAt(textlength - i)) {
                PalindromCond = false;
                break;
            }
        }
        System.out.println("Given the following string '"+text1+"' should return "+PalindromCond);
    }


}

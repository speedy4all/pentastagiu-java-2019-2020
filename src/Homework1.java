public class Homework1 {

    //Problem 1: sums all numbers from 0 up to a target number
    public static void addNumbers(int target) {
        int sum = 0;

        for (int i=0;i<=target;i++)
            sum += i;

        System.out.println("The sum of all numbers from 0 to "+target+" = "+sum);
    }

    //Problem 2: calculates the average and sum of all numbers between the range of two numbers
    public static void averageAndSum(int lowRange, int highRange) {
        int counter = 0, sum = 0;
        float average = 0f;

        for (int i = lowRange; i<= highRange; i++) {
            sum += i;
            counter++;
        }

        //cast sum to float in order to obtain the correct result
        average = (float)sum / counter;
        System.out.println("Sum for range "+lowRange+" to "+highRange+" : "+sum);
        System.out.println("Average for range "+lowRange+" to "+highRange+" : "+average);
    }

    //Problem 3: prints the first x fobonacci numbers and calculates their average value
    public static void fibonacciNumbers(int x) {
        //first and second variables will hold the two previous fibonacci numbers in the progression, while third holds the current number
        int first = 1, second = 1, third = 0, sum = 0;
        float average = 0f;
        //add the first two numbers to the total sum
        sum = first+second;
        System.out.println("The first "+x+" fibonacci numbers are:");
        System.out.print(first+" "+second+" ");

        for (int i = 0; i < x - 2; i++) {
            third = first + second;
            first = second;
            second = third;
            sum += third;
            System.out.print(third+" ");
        }

        System.out.println();
        //casting sum to float in order to obtain the correct result
        average = (float)sum / x;
        System.out.println("The average of the first "+x+" fibonacci numbers is "+average);
    }

    //Problem 4: Checks if the first and last elements of an array are equal
    public static void checkFirstAndLastElement(int[] array) {
        if (array[0] == array[array.length-1]) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }

    //Problem 5: Checks to see if two int arrays are equal
    public static void arraysEquality(int[] a, int[] b) {

        //first checking to see if the arrays have the same length
        if(a.length != b.length) {
            System.out.println("FALSE");
            return;
        }

        //go through the arrays and compare the elements at the same index
        for (int i=0;i<a.length-1;i++) {
            if (a[i] != b[i]) {
                System.out.println("FALSE");
                return;
            }
        }

        //all conditions have been met
        System.out.println("TRUE");
    }

    //Problem 6: Concatenates two arrays
    public static void concatenateArrays(int[] a1, int[] a2) {
        //declare the concatenated array and reserve memory for it
        int[] finalArray = new int[a1.length+a2.length];

        //copy first array
        for (int i = 0; i < a1.length; i++) {
            finalArray[i] = a1[i];
        }

        //copy second array
        for (int i = 0; i< a2.length; i++) {
            finalArray[a1.length+i] = a2[i];
        }

        //print the concatenated array;
        for (int i = 0; i< finalArray.length; i++) {
            System.out.print(finalArray[i]+" ");
        }
        System.out.println();
    }

    //Problem 7: calculates the min, max and average for all numbers in an array
    public static void minMaxAverage(int[] a) {
        //initialize min and max with opposing maximum/minimum values
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        float average = 0;

        //go through the array to check min, max, while also adding each element
        for (int i = 0; i < a.length; i++) {
            if (min > a[i])
                min = a[i];
            if (max < a[i])
                max = a[i];
            sum += a[i];
        }

        average = (float)sum / a.length;
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Average: "+average);

    }

    //Problem 8: finds the index of an element in an array
    public static void getIndex(int[] a, int target) {

        //check each element and see if it is equal to the target
        for (int i = 0; i< a.length; i++) {
            if (a[i] == target){
                System.out.println("The index of the element "+target+" is "+i);
                return;
            }
        }
        //Print a message if the element was not found
        System.out.println(target+" was not found in this array.");
    }

    //Problem 9: counts odd and even elements in an array
    public static void oddOrEven(int[] a) {
        int odd = 0, even = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Odd elements count:"+odd);
        System.out.println("Even elements count:"+even);
    }

    //Problem 10: checks to see if a base string contains a target string
    public static void containsString(String baseString, String targetString) {
        if (baseString.contains(targetString))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }

    //Problem 11: counts how many times a target character is contained in a string
    public static void charCounter(String baseString, char target) {
        int count = 0;
        //first check to see if the base string is valid
        if ((baseString == null) || (baseString.length() == 0)) {
            System.out.println("Error: the String you entered is not valid");
            return;
        }
        //compare each letter with the target and increment counter when found
        for(int i = 0; i < baseString.length(); i++) {
            if (baseString.charAt(i) == target)
                count++;
        }

        if (count == 0)
            System.out.println("The "+target+" character was not found in this string");
        else
            System.out.println("The "+target+" appears "+count+" times in this string");
    }

    //Problem 12: check if a base string ends with a target substring
    public static void stringEndsWith(String baseString, String target) {
        //check to see if the strings are valid
        if ((baseString == null) || (baseString.length()== 0) || (target ==null) || (target.length() ==0) ) {
            System.out.println("Error: empty or null strings!");
            return;
        }

        if (baseString.endsWith(target))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }

    //Problem 13: encrypt a string with corresponding number: a-z (0-25) and A-Z (26-50)
    public static void encryptString(String s) {
        //create a new string that will store the encrypted values
        String encrypted="";

        //convert each character to its ASCII value and substract 97 for lowercase letters and 39 for uppercase ones in order to meet the cypher requirements
        for(int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                encrypted += (int)s.charAt(i) - 97;
            } else {
                encrypted += (int)s.charAt(i) - 39;
            }
        }

        System.out.println("The encryption for "+s+" is "+encrypted);
    }

    //Problem 14: Insert a # character between two identical letters in a string
    public static void findDuplicates(String s) {
        //Create a new string by concatenating into it each letter and the corresponding # symbols
        String processed ="";
        //check if each letter is equal to the next one and if so, insert an extra # symbol in the processed string
        for (int i = 0; i < s.length()-1; i++) {
            processed += s.charAt(i);

            if (s.charAt(i) == s.charAt(i+1)) {
                processed +='#';
            }
        }
        //add the final character (which wasn't checked in the for loop)
        processed += s.charAt(s.length()-1);
        System.out.println(processed);
    }

    //Problem 15: Checks if a string is a palindrome or not
    public static void isPalindrome(String s) {
        //first check if the string is null or empty
        if ((s == null) || (s.length() == 0)) {
            System.out.println("Error: The string must contain at least one letter");
            return;
        }
        //create two variables that represent the first and last character
        int i = 0;
        int j = s.length()-1;

        //check if elements from opposite ends are equal and increment/decrement accordingly
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("FALSE");
                return;
            }
            i++;
            j--;
        }
        //all conditions have been met
        System.out.println("TRUE");
    }

    public static void main(String[] args) {
//		Pb. 1
//		int target = 5;
//		addNumbers(target);


//		Pb. 2
//		int lowRange = 1;
//		int highRange = 100;
//		averageAndSum(lowRange, highRange);


//		Pb. 3
//		int fiboNumber = 20;
//		fibonacciNumbers(fiboNumber);


//		Pb. 4
//		int[] array1 = {13,6,2,8,2,3};
//		int[] array2 = {13,6,2,6,2,13};
//		checkFirstAndLastElement(array1);
//		checkFirstAndLastElement(array2);


//		Pb. 5
//		int[] a1 = {1,2,3,4};
//		int[] a2 = {1,2,3,4};
//		int[] a3 = {1,3,2};
//		int[] a4 = {1,3};
//		int[] a5 = {1,2,4,3};
//		int[] a6 = {};
//		int[] a7 = {};
//		arraysEquality(a1, a2);
//		arraysEquality(a6, a7);
//		arraysEquality(a3, a4);
//		arraysEquality(a1, a5);


//		Pb. 6
//		int[] a1 = {1,2,3,4};
//		int[] a2 = {5,6,7,8};
//		concatenateArrays(a1,a2);


//		Pb. 7
//		int[] a = {13,20,14,5,2,8};
//		int[] b = {-55,2503,-5667,0,25000};
//		minMaxAverage(a);
//		minMaxAverage(b);


//		Pb. 8
//		int[] a = {13,20,14,5,2,8};
//		int target = 5;
//		getIndex(a, target);


//		Pb. 9
//		int[] a = {13,20,14,5,2,8};
//		oddOrEven(a);


//		Pb. 10
// 		String baseString = "Hello java world";
// 		String targetString = "java";
// 		containsString(baseString,targetString);


//		Pb. 11
//		String baseString = "Hello java world";
// 		char target = 'a';
//		charCounter(baseString, target);


//		Pb. 12
//		String baseString = "Hello java world";
// 		String target = "orld";
//		stringEndsWith(baseString, target);


//		Pb. 13
//		String s1 = "HelloJavaWorld";
//		String s2 = "abcd";
//		encryptString(s1);
//		encryptString(s2);


//		Pb. 14
//		String s1 = "HelloJavaWorld";
//		String s2 = "hhhaaalloo";
//		findDuplicates(s1);
//		findDuplicates(s2);


//		Pb. 15
//		String s1 ="aaabccbaaa";
//		String s2 ="abccbb";
//		isPalindrome(s1);
//		isPalindrome(s2);

    }
}


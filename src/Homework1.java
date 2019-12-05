public class Homework1 {

    public static void main(String[] args) {
        int problem = 1;
        switch (problem) {
            case 1: Problem1();
                    break;
            case 2: Problem2();
                break;
            case 3: Problem3();
                break;
            case 4: Problem4();
                break;
            case 5: Problem5();
                break;
            case 6: Problem6();
                break;
            case 7: Problem7();
                break;
            case 8: Problem8();
                break;
            case 9: Problem9();
                break;
            case 10: Problem10();
                break;
            case 11: Problem11();
                break;
            case 12: Problem12();
                break;
            case 13: Problem13();
                break;
            case 14: Problem14();
                break;
            case 15: Problem15();
                break;
            default:
                System.out.println("Wrong problem");
        }
    }

    public static void Problem1()
    {
        int inputNumber = 5;
        int sum = 0;
        for(int i = 1; i<=inputNumber; ++i){
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void Problem2()
    {
        int a = 1;
        int b = 100;
        int sum = 0;
        double avg;
        for(int i = a; i <= b; ++i) {
            sum+=i;
        }
        avg = sum / (b - a + 1);
        System.out.println("Sum for range " + a + " to " +b + " : " + sum);
        System.out.println("Average for range " + a + " to " +b + " : " + avg);
    }
    public static void Problem3()
    {
        int a = 1;
        int b = 1;
        int c;
        int sum = 2;
        int x = 20;
        double avg;
        System.out.print(a + " " + b);
        for(int i = 3; i <= x; ++i) {
            c = a + b;
            System.out.print(" " + c);
            sum += c;
            a = b;
            b = c;
        }
        avg = (double) sum / x;
        System.out.println("\nThe average is " + avg );


    }
    public static void Problem4()
    {
        int[] myArray = {13, 6, 2, 8, 2, 3};
        boolean isFirstEqualToLast;
        if(myArray.length>=2) {
            if(myArray[0] == myArray[myArray.length - 1]) {
                isFirstEqualToLast = true;
            }
            else {
                isFirstEqualToLast = false;
            }
            System.out.println("For the following input " + "the output should be: " + isFirstEqualToLast);
        }

        else {
            System.out.println("The array has not a good length");
        }
    }
    public static void Problem5()
    {
        boolean areEqual = true;
        int[] a = {1,2,3,4};
        int[] b = {1,2,4,3};
        if(a.length != b.length){
            areEqual = false;
        }
        else
        {
            for(int i = 0; i < a.length; ++i) {
                if(a[i] != b[i]) {
                    areEqual = false;
                    break;
                }
            }
        }
        System.out.println(areEqual);
    }
    public static void Problem6()
    {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        while(i < a.length) {
            c[i] = a[i];
            ++i;
        }
        while(j < b.length) {
            c[i] = b[j];
            ++j;
            ++i;
        }
        for(int k = 0; k < c.length; ++k) {
            System.out.print(c[k]);
            if(k == c.length - 1)
                continue;
            else
                System.out.print(" ");
        }

    }
    public static void Problem7()
    {
        int[] v = {13, 20, 14, 5, 2, 8};
        int minV = v[0];
        int maxV = minV;
        int sum = minV;
        double avg;
        for(int i = 1; i < v.length; ++i) {
            sum += v[i];
            if(v[i] < minV) {
                minV = v[i];
            }
            if(v[i] > maxV) {
                maxV = v[i];
            }

        }
        avg = (double) sum / v.length;
        System.out.println("MaxV: " + maxV);
        System.out.println("MinV: " + minV);
        System.out.println("Avg: " + avg);

    }
    public static void Problem8()
    {
        boolean iFoundIt = false;
        int searchingValue = 5;
        int[] v = { 13, 20, 14, 2, 8, 5, 5 };
        for(int i = 0; i < v.length; ++i) {
            if(v[i] == searchingValue) {
                iFoundIt = true;
                System.out.println("I found " + searchingValue + " at position " + i);
            }
        }
        if(iFoundIt == false) {
            System.out.println("The value " + searchingValue + " was not found");
        }

    }
    public static void Problem9()
    {
        int[] v = { 13, 20, 14, 5, 2, 8 };
        int evenCounter = 0;
        int oddCounter = 0;
        for(int i = 0; i < v.length; ++i) {
            if(v[i] % 2 == 0){
                evenCounter ++;
            }
            else{
                oddCounter++;
            }
        }
        System.out.println("Odd elements count: " + oddCounter);
        System.out.println("Even elements count: " + evenCounter);
    }
    public static void Problem10()
    {
        String s1 = "Hello java world";
        String s2 = "zorld";
        boolean isS2inS1;
        isS2inS1 = s1.contains(s2);
        System.out.println(isS2inS1);
    }
    public static void Problem11()
    {
        String s = "Hello java world";
        char c = 'a';
        int noOfCinS = 0;
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == c){
                noOfCinS++;
            }
        }
        System.out.println(noOfCinS);
    }
    public static void Problem12()
    {
        String s1 = "Hello java world";
        String s2 = "java";
        boolean isSufix;
        isSufix = s1.endsWith(s2);
        System.out.println(isSufix);
    }
    public static void Problem13()
    {
        String s = "2abcd12";
        int aux;
        int ch;
        for(int i = 0; i < s.length(); ++i){
            ch = s.charAt(i);
            if(ch < 'a' || ch > 'z') {
                continue;
            }
            aux = ch - 'a';
            System.out.println(aux);
        }
    }
    public static void Problem14()
    {
        String s = "Hello worldd";
        String newS = "";
        for(int i = 0 ; i < s.length() ;++i){
            newS+=s.charAt(i);
            if(i < s.length() - 1 && s.charAt(i) == s.charAt(i+1))
            {
                newS+='#';
            }
        }
        System.out.println(newS);
    }

    public static void Problem15() {
        boolean isPalindrom = true;
        //String s = "aaaaa";
        String s = "bbccbb";
        int n = s.length() / 2;
        int length = s.length() - 1;
        for(int i = 0; i <= n; ++i){
            if(s.charAt(i) != s.charAt(length - i)) {
                isPalindrom = false;
                break;
            }
        }
        System.out.println(isPalindrom);
    }

}

import java.util.Scanner;

public class Homework1_WEBINAR2 {

    public static int GaussSum(int n) { ///pentru metoda statica nu am nevoie de obiect, o apelez ca pe o functie " regular in C"
        return n * (n + 1) / 2;

    }

    public static int IntervalSum(int a, int b) {
        int sum = 0, i;
        for (i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
    // Q: Cum as putea returna valoarea lui 'i' ca parametru al functiei, dar sa nu fie varibila statica si fara getters si setters?


    public static int GenerateFibo(int x) {
        int i = 0, sum = 0;
        int f1 = 1, f2 = 1, f = 1;
        i = 2;
        if (x == 0) {
            System.out.println("NO FIBO NUMBER TO PRINT OUT");
            return 0;
        } else if (x == 1) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print("1 1 ");
            for (i = 2; i < x; i++) {
                f = f1 + f2;
                f1 = f2;
                f2 = f;
                sum += f;
                System.out.print(f + " ");
            }
            return sum + 2;
        }
    }

    public static void arrayEquality(int[] a, int[] b, int n, int m) {
        if (n != m) {
            System.out.println("NOT EUQAL- different sizes");
            ///Q: HOW TO Print kind of error message?
        } else {

            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    System.out.println(a[i] + " " + b[i]);
                    ok = false;
                    break;
                }
            }

            if (ok == true)
                System.out.println("!!they are equal");
            else
                System.out.println("!!not equal at all");

        }
    }

    public static void ArithmticalOp(int[] a, int n) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
            sum += a[i];

        }
        System.out.println("MAX: " + max + ", MIN: " + min + " , Avergage of the array: " + (double) sum / n);
    }

    public static int elementSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == x)
                return i;

        return -1;

    }

    public static void OddEven(int[] a) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] % 2 == 1)
                odd++;
            else
                even++;

        System.out.println(odd + " odd numbers and " + even + " even numbers");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ///1ST EXERCISE
        System.out.println("1.Enter a number for getting the first sum: ");
        int a = input.nextInt();
        /// daca scriu sout - imi da shorcut la system out println
        System.out.println(" Our sum would be " + GaussSum(a) + "\n\n");

        ///2nd exercise
        System.out.println("2.Read another 2 elements (a<=b) ");
        a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Sum would be " + IntervalSum(a, b) + " and their interval's Average " + IntervalSum(a, b) / ((double) (Math.abs(a - b) + 1)));

        ///3rd exercise
        System.out.println("\n3.How many fibo numbers you wanna see? - ");
        int x = input.nextInt();
        int fiboSum = GenerateFibo(x);
        System.out.println("\nfibo average would be " + fiboSum / (double) x);

        ///4th exercise
        System.out.println("4. Enter a number of elements for an array and its elements");
        int n = input.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = input.nextInt();
        }
        if (myArray[0] == myArray[n - 1])
            System.out.println(" TRUE- FIRST ELEM EQUALS LAST ELEM");
        else
            System.out.println(" false- first!= last");


        ///5th exercise
        System.out.println("\n\n5. We are gonna test the equality between 2 arrays. Using the first one ( from ex 4), type another number of elements and the elements for the second one:");
        int m = input.nextInt();
        int[] myArray2 = new int[m];
        for (int i = 0; i < m; i++) {
            myArray2[i] = input.nextInt();
        }
        arrayEquality(myArray, myArray2, n, m);

        ///6th exercise
        System.out.println("\n\n6. we will concat those 2 previous arrays");


        int[] result = new int[n + m];
        for (int i = 0; i < n; i++)
            result[i] = myArray[i];

        for (int i = 0; i < m; i++)
            result[n + i] = myArray2[i];

        for (int i = 0; i < n + m; i++)
            System.out.print(result[i] + " ");

        ///7th exercise
        System.out.println("\n\n7.This exercise will find the maximum, minimum and the average value for the first array typed");
        ArithmticalOp(myArray, n);

        ///8th exercise
        System.out.println("\n\n8.Find a given element in array... \n What element are you looking for? ");
        x = input.nextInt();

        int found = elementSearch(myArray, x);
        if (found == -1)
            System.out.println(" your number doesn' t exist in our array");
        else
            System.out.println("element found at index " + found);

        ///9th exercise
        System.out.println("\n\n9.In our first array we have- ");
        OddEven(myArray);

        //10th exercise
        System.out.println("\n\n10. We are done with ints :)) Now, type 2 strings pressing ENTER between in order to check if the second ones appears in the first one");
        String s1, s2;
        ///s1 = input.nextLine();
        s1 = input.nextLine();
        s1=input.nextLine();
        s2 = input.nextLine();
        boolean ok1 = false;
        for (int i = 0; i < s1.length() - s2.length() +1; i++) {
            if ((s1.substring(i, i+s2.length())).equals(s2)) {
                ok1 = true;
                System.out.println("s2 is substring of s1");
                break;
            }

        }
        if (ok1 == false)
            System.out.println("nu s- a gasit");


        //11th
        System.out.println("\n11. Almost done! - read another string to test if your first string ends with this one!");
        String s3 = input.nextLine();

        if ((s1.substring(s1.length() - s3.length() , s1.length())).equals(s3))
            System.out.println("s1 ends with s3");
        else
            System.out.println("nope, s1 does not end with s3");


        //12th
        System.out.println("12. Encoding -type a string to be encoded: ");
        String s4=input.nextLine();
        int[] s5=new int[s4.length()];
        System.out.println("OUR ENCODING WOULD LOOK LIKE - ");
        for(int i=0;i<s4.length();i++) {
            s5[i]=(int)(s4.charAt(i)-'a'); ///really awkward to traverse a string in Java ( bcz it an object)
            System.out.print(s5[i]);
        }

        ///13th - not done yet
        System.out.println("\n\n13. Mark with # the duplicates. Enter a String! ");
        String s6=input.nextLine();
        int lung=s6.length();
        for(int i=0;i<s6.length()-1;i++)
        {
            if(s6.charAt(i)==s6.charAt(i+1))
            {
                String aux1=s6.substring(0,i+1);
                String aux2=s6.substring(i+1,s6.length());
                s6=aux1+'#';
                s6=s6+aux2;
                i++;
            }


        }
        System.out.println(s6);


        //16th exercise
        System.out.println("\n16. Type a string to check if it is a palindrome or not!");
        String s7=input.nextLine();
        int okk=1;
        for(int j=0;j<((s7.length())/2);j++)
            if(s7.charAt(j)!=s7.charAt(s7.length()-j-1))
            {okk=0;
                break;}


        if(okk==1)
            System.out.println("YESSSS!!!! We have a palindrome!!!");
        else
            System.out.println("We do not have a palidrome!!!");

    }


}

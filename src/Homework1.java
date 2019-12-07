import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;


public class Homework1 {

    public static void main(String[] args) {

        int numar, prbl;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti numarul problemei: ");
        prbl = input.nextInt();

        switch (prbl) {
            case 1:
                // Problem 1
                System.out.println("Problema 1");
                System.out.print("Scrie un numar: ");
                numar = input.nextInt();
                problem1(numar);
                break;
            case 2:
                // Problem 2
                System.out.println("Problema 2");
                System.out.print("Scrie un numar: ");
                numar = input.nextInt();
                problem2(numar);
                break;
            case 3:
                //Problem 3
                System.out.println("Problema 3");
                System.out.print("Scrie un numar: ");
                numar = input.nextInt();
                problem3(numar);
                System.out.println();
                break;
            case 4:
                // Problem 4
                System.out.println("Problema 4");
                int[] arr = {13, 6, 2, 8, 2, 3};
                boolean equal = problem4(arr);
                System.out.println("Output-ul pentru 13, 6, 2, 8, 2, 3 este " + equal);
                int[] arrr = {13, 6, 2, 8, 2, 13};
                equal = problem4(arrr);
                System.out.println("Output-ul pentru 13, 6, 2, 8, 2, 13 este " + equal);
                System.out.println();
                break;

            case 5:
                // Problem 5
                System.out.println("Problema 5");
                int[] arr1 = {1, 2, 3, 4}, arr2 = {}, arr3 = {1, 3, 2}, arr4 = {1, 3}, arr5 = {1, 2, 4, 3};

                System.out.println("Pentru [1,2,3,4] si [1,2,3,4] output-ul este: " + problem5(arr1, arr1));
                System.out.println("Pentru [] si [] output-ul este: " + problem5(arr2, arr2));
                System.out.println("Pentru [1,3,2] si [1,3] output-ul este: " + problem5(arr3, arr4));
                System.out.println("Pentru [1,2,3,4] si [1,2,4,3] output-ul este: " + problem5(arr1, arr5));
                break;

            case 6:
                //Problem 6
                int[] arrr1 = {1, 2, 3, 4};
                System.out.println("Problem 6");
                int[] arr6 = {5, 6, 7, 8, 9};
                problem6(arrr1, arr6);
                System.out.println();
                break;

            case 7:
                //Problem 7
                System.out.println("Problem 7");
                int[] arr7 = {13, 20, 14, 5, 2, 8};
                problem7(arr7);
                System.out.println();
                break;

            case 8:
                //Problem 8
                System.out.println("Problem 8");
                int[] arr8 = {13, 20, 14, 5, 2, 8};
                int index = problem8(arr8, 5);
                System.out.println("Elem 5 din [13,20,14,5,2,8] se alfa la pozitia: " + index);
                System.out.println();
                break;

            case 9:
                //Problem 9;
                System.out.println("Problem 9");
                String s1 = "Hello java world", s2 = "java";
                System.out.println(s1 + " contine " + s2 + " : " + problem9(s1, s2));
                System.out.println();
                break;

            case 10:
                // Problem 10
                String ss1 = "Hello java world";
                System.out.println("Problem 10");
                int times = problem10(ss1, 'a');
                System.out.println("Caracterul a apare de " + times + " ori in " + ss1);
                System.out.println();
                break;

            case 11:
                // Problem 11
                System.out.println("Problem 11");
                String ss11 = "Hello java world";
                boolean contine = problem11(ss11, "orld");
                System.out.println(ss11 + " se terimina cu orld: " + contine);
                System.out.println();
                break;

            case 12:
                // Problem 12
                System.out.println("Problem 12");
                String code = problem12("abcd");
                System.out.println("Codul obtinut este: " + code);
                System.out.println();
                break;

            case 13:
                //Problem 13
                System.out.println("Problem 13");
                String out = problem13("Hello java world");
                System.out.println("Stringul este " + out);
                break;

            case 14:
                //Problem 14
                System.out.println("Problem 14");
                boolean palindrome = problem14("aabccbaa");
                System.out.println("aabccbaa este polindrom: " + palindrome);
                break;

            case 15:
                //Problem 15
                System.out.println("Problem 15");
                int[] arr15 = {13,20,14,5,2,8};
                problem15(arr15);
                break;

            default:
                System.out.println("Numar gresit");
                break;
        }

    }

    private static void problem1(int numar) {
        int sum = 0, i;
        for(i=0; i <= numar; i++)
            sum += i;

        System.out.println("Suma este: " + sum + "\n");
    }

    private static void problem2(int numar) {
        int i, sum = 0;
        float medie;

        for(i=0; i<=numar; i++) {
            sum += i;
        }
        medie = (float)sum / numar;
        System.out.println("Suma este: " + sum);
        System.out.println("Media este " + medie + "\n");
    }

    private static void problem3(int numar) {
        int i, n1 = 0, n2 = 1, n3, sum = 0;
        float medie;

        System.out.print("Primele " + numar + " numere Fibonacci sunt: 1 ");
        for (i=2; i<= numar; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            sum += n3;
        }
        medie = (float)sum / numar;
        System.out.println("\nMedia este: " + medie);
    }

    private static boolean problem4(int[] arr) {
        return arr[0] == arr[arr.length - 1];
    }

    private static boolean problem5(int[] arr, int[] arrr) {
        int lungime;
        if (arr.length == arrr.length)
            lungime = arr.length;
        else
            return false;

        for(int i = 0; i<lungime; i++) {
            if(arr[i] != arrr[i])
                return false;
        }

        return true;
    }

    private static void problem6(int[] arr, int[] arrr) {
        int lungime = arr.length + arrr.length;
        int[] arrNou = new int[lungime];
        for(int i =0 ; i<arr.length; i++)
            arrNou[i] = arr[i];
        for(int i = arr.length; i<lungime; i++)
            arrNou[i] = arrr[i-arr.length];
        System.out.println("Noul array este: ");
        for(int i =0; i< lungime; i++)
            System.out.print(arrNou[i] + " ");

    }

    private static void problem7(int[] arr) {
        int min = arr[0], max = arr[1];
        float medie=0;

        for(int i = 0; i<arr.length; i++ ) {
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
            medie += arr[i];
        }

        medie /= arr.length;

        System.out.println("Maximul este " + max);
        System.out.println("Minimul este " + min);
        System.out.println("Media este " + medie);
    }

    public static int problem8(int[] arr, int elem) {
        int index = 0;
        for(int i=0; i<arr.length; i++)
            if (arr[i] == elem)
                index = i;

        return index;
    }

    private static boolean problem9(String str, String inStr) {
        boolean contine = false;
        String[] temp = str.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals(inStr)) {
                contine = true;
                break;
            }
        }
        return contine;
    }

    private static int problem10(String str, Character chr) {
        int times = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp == chr)
                times++;
        }
        return times;
    }

    private static boolean problem11(String str, String end) {
        String[] chars = str.split("(?!^)");
        String[] charsEnd = end.split("(?!^)");
        int i = 0, j;
        for(j=(chars.length - charsEnd.length); i<= charsEnd.length - 1 && j <= chars.length-1; i++,j++)
//                System.out.println(charsEnd[i] + "  " + chars[j]);
                if(!chars[j].equals(charsEnd[i]))
                    return false;
        return true;
    }

    private static String problem12(String str) {
        String code = "";
        char[] chars = str.toLowerCase().toCharArray();
//        Character[] alfabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
//        'r', 's', 't', 'u', 'v', 'w', 'z'};
//        for(int i = 0; i < chars.length; i++ ){
//            for (int j = 0; j < 24 ; j++){
//                if(chars[i].equals(alfabet[j].toString())) {
//                    code += j;
//                }
//            }
//        }
        for(int i = 0; i< chars.length; i++) {
            if (Character.isWhitespace(chars[i]))
                code += " ";
            code += chars[i] - 97;
        }
        return code;
    }

    private static String problem13(String str) {
        String[] chars = str.split("(?!^)");
        String out = "";
        for(int i =0; i< chars.length-1; i++) {
            out += chars[i];
            if(chars[i].equals(chars[i+1])){
                out += "#";
                }
        }
        out += chars[chars.length-1];

        return out;
    }

    private static boolean problem14(String str) {
        if(str.length() % 2 != 0)
            return false;
        char[] chars = str.toCharArray();
        for(int i = 0; i < str.length()/2; i++)
            if(chars[i] != chars[str.length() - i-1])
                return false;
        return true;
    }

    private static void problem15(int[] arr) {
        int odd = 0, even = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Numere pare: " + even);
        System.out.println("Numere pare: " + odd);

    }

}

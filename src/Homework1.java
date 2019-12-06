import java.util.Scanner;


public class Homework1 {

    public static void main(String[] args) {

        int numar;
        Scanner input = new Scanner(System.in);

        // Problem 1
        System.out.println("Problema 1");
        System.out.print("Scrie un numar: ");
        numar = input.nextInt();
        problem1(numar);

        // Problem 2
        System.out.println("Problema 2");
        System.out.print("Scrie un numar: ");
        numar = input.nextInt();
        problem2(numar);


        //Problem 3
        System.out.println("Problema 3");
        System.out.print("Scrie un numar: ");
        numar = input.nextInt();
        problem3(numar);
        System.out.println();

        // Problem 4
        System.out.println("Problema 4");
        int[] arr = {13, 6, 2, 8, 2, 3};
        boolean equal = problem4(arr);
        System.out.println("Output-ul pentru 13, 6, 2, 8, 2, 3 este " + equal );

        int [] arrr = {13, 6, 2, 8, 2, 13};
        equal = problem4(arrr);
        System.out.println("Output-ul pentru 13, 6, 2, 8, 2, 13 este " + equal );
        System.out.println();

        // Problem 5
        System.out.println("Problema 5");
        int[] arr1 = {1, 2, 3, 4}, arr2 = {}, arr3 = {1, 3, 2}, arr4 = {1, 3}, arr5 = {1, 2, 4, 3};

        System.out.println("Pentru [1,2,3,4] si [1,2,3,4] output-ul este: " + problem5(arr1, arr1));
        System.out.println("Pentru [] si [] output-ul este: " + problem5(arr2, arr2));
        System.out.println("Pentru [1,3,2] si [1,3] output-ul este: " + problem5(arr3, arr4));
        System.out.println("Pentru [1,2,3,4] si [1,2,4,3] output-ul este: " + problem5(arr1, arr5));

        //Problem 6
        System.out.println("Problem 6");
        int[] arr6 = {5, 6, 7, 8, 9};
        problem6(arr1, arr6);
        System.out.println();

        //Problem 7
        System.out.println("Problem 7");
        int[] arr7 = {13,20,14,5,2,8};
        problem7(arr7);
        System.out.println();

        //Problem 8
        System.out.println("Problem 8");
        int[] arr8 = {13,20,14,5,2,8};
        int index = problem8(arr8, 5);
        System.out.println("Elem 5 din [13,20,14,5,2,8] se alfa la pozitia: "+ index);


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

    private static int problem8(int[] arr, int elem) {
        int index = 0;
        for(int i=0; i<arr.length; i++)
            if (arr[i] == elem)
                index = i;

        return index;
    }


}

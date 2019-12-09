import java.util.Arrays;

public class Homework1 {

    public static void main(String[] args) {
        //Exercitiu 1
        int inputnumar=5; //Prin modificarea acestui numar se modifica implicit si rezultatul
        int[] ints = new int[inputnumar+1];
        ints[0] = 0;
        for (int i = 1; i <ints.length; i++) {

            ints[i] = ints[i - 1] + 1;

        }
        int j = 0;
        int sum = 0;

        while (j < ints.length) {
            sum = sum + ints[j];
            j = j + 1;

        }
        System.out.println("----Exercitiu 1----");
        System.out.println("Sirul tau arata asa: "+Arrays.toString(ints)+ " iar suma numerelor sirului este " +sum);

        //Exercitiu2
        int maximumrange=100; //Prin modificarea acestui numar se modifica implicit si rezultatul
        int[] ints2 = new int[maximumrange+1];
        ints2[0] = 0;
        for (int i = 1; i <ints2.length; i++) {
            ints2[i] = ints2[i - 1] + 1;

        }
        int k = 0;
        int sum2 = 0;

        while (k < ints2.length) {
            sum2 = sum2 + ints2[k];
            k = k + 1;

        }
        float medie = sum2/maximumrange;

        System.out.println("----Exercitiul 2----");
        /*System.out.println("Sirul tau arata asa: "+Arrays.toString(ints2); //Aici putem afisa sirul insa este cam lung */
        System.out.println("Suma numerelor de la "+ints2[0]+" pana la "+maximumrange+" este "+sum2);
        System.out.println("Media aritmetica a celor "+maximumrange+" de numere este "+medie );

        //Exercitiul 3
        System.out.println("----Exercitiu 3 ----");
        System.out.println("Cele n numere ale lui Fibonacci sunt ");
        printFibonacciNumbers(20);


        //Exercitiul 4
        System.out.println("\n----Exercitiul 4----");
        int[] ints3 = {13,6,2,8,2,3};
        int first=ints[0];
        int last;
        last = ints3[ints3.length-1];
        System.out.println("Primul element este egal cu ultimul?");


        if(first==last){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }

        int[] arr1 = new int [] {1, 2, 3, 4};
        int[] arr2 = new int [] {1, 2, 3, 4};

        //Exercitiul 5
        System.out.println("\n----Exercitiul 5----");
        if(Arrays.equals(arr1, arr2)) {
            System.out.println("arr1 este egal cu arr2 : ");
        }
        else
        {
            System.out.println("arr1 nu este egal cu arr2 : ");
        }
        //Exercitiul 6
        System.out.println("\n----Exercitiul 6----");

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];
        System.arraycopy(array1, 0, result,0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);
        System.out.println("Sirul 1 : "+Arrays.toString(array1));
        System.out.println("Sirul 2 : "+Arrays.toString(array2));
        System.out.println("Cele 2 siruri concatenate sunt:"+Arrays.toString(result));

        //Exercitiul 7
        System.out.println("\n----Exercitiul 7----");
        int[] ints4 = {13,20,14,5,2,8};
        int first2=ints4[0];
        int last2= ints4[0];
        int index = 0;

        for (int i = 0; i < ints4.length; i++)
        {
            if (last2 < ints4[i])
            {
                last2 = ints4[i];
                index = i;
            }
        }

        for (int i = 0; i < ints4.length; i++)
        {
            if (first2 > ints4[i])
            {
                first2 = ints4[i];
                index = i;
            }
        }
        System.out.println("Sirul tau este"+Arrays.toString(ints4));
        System.out.println("Maximul este: "+last2);
        System.out.println("Minumul este: "+first2);

        int se = 0;
        double suma = 0;

        while (se < ints4.length) {
            suma = suma + ints4[se];
            se = se + 1;

        }
        double lungime=ints4.length;
        double media = suma/lungime;
        System.out.println("Media aritmetica a numerelor sirului este: "+media);
        //Exercitiul 8
        System.out.println("\n----Exercitiul 8----");
        int[] ints5 = {13,20,14,5,2,8};
        int target=5;//<---Aici targetul se poate modifica
        System.out.println("Sirul tau este"+Arrays.toString(ints5));;
        for (int p=0;p< ints5.length;p++) {
            if (target==ints5[p]) {
                System.out.println("Indexul pe care se afla targetul "+target +" este "+p);

            }
        }
        //Exercitiul 9
        System.out.println("\n----Exercitiul 9----");
        int[] ints6 = {13,20,14,5,2,8};
        int numerepare=0;
        int numereimpare=0;

        for (int p=0;p< ints6.length;p++) {
            if(ints6[p]%2==0){
                numerepare++;
            }
            else{
                numereimpare++;
            }
        }
        System.out.println("Odd elements count " +numereimpare);
        System.out.println("Even elements count " +numerepare);
        //Exercitiul 10
        System.out.println("\n----Exercitiul 10----");
        String  caracter ="Hello java world";
        String  caracter2 ="java";
        if(caracter.contains(caracter2)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
        //Exercitiul 10
        System.out.println("\n----Exercitiul 10----");
        String  caracter3 ="Hello java world";
        int litera=0;
        for(int i=0;i<caracter3.length();i++){
            if(caracter3.charAt(i) == 'a') {
                litera++;
            }
        }
        System.out.println("String-ul contine litera a de "+litera+" ori");

        //Exercitiul 11
        System.out.println("\n----Exercitiul 11----");
        String  caracter4 ="Hello java world";
        if(caracter4.endsWith("orld")){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
    static void printFibonacciNumbers(int n)
    {
        int f1 = 0, f2 = 1, i;

        if (n < 1)
            return;

        for (i = 1; i <= n; i++)
        {
            System.out.print(f2+" ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }


    }


}




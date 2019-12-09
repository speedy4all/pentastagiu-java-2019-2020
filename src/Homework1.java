public class Homework1 {

    public static void main(String[] args) {
        // first exercise
        int sum = 0;
        int requestednum = 5;

        for (int i = 0; i <= requestednum; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);


        // second exercise
        int a = 1;
        int b = 100;
        int sumr = 0;
        float avg = 0f;

        for (int i = a; i <= b; i++) {
            sumr += i;
        }
        avg = sumr / (b - a+1); // idk if there was an error at exercise or we didn't need to use (float) ??
        System.out.println("The second sum is " + sumr);
        System.out.println("The average " + avg);

        //third exercise
        int f1 = 1;
        int f2 = 1;
        int fsum = 2;
        int howmany = 20;
        int aux = 0;
        double favg = 0f;
        for (int i = 2; i < howmany; i++)    //we already have the first 2 numbers
        {
            aux = f2;
            f2 = f1 + f2;
            f1 = aux;
            fsum += f2;

        }
        favg = (float) fsum / howmany;
        System.out.println("The faverage " + favg);


        //exercise 4
        int v[] = {13, 6, 2, 8, 2, 13};
        if (v[0] == v[v.length - 1]) //we have 6 elements but because the array starts from 0 the last element will be the lenght-1
        {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        //exercise 5
        int v1[] = {1, 2, 3, 4};
        int v2[] = {1, 2, 3};
        boolean sem = true;
        if (v1.length != v2.length) {
            sem = false;
        } else {
            for (int i = 0; i < v1.length; i++)
                if (v1[i] != v2[i]) {
                    sem = false;
                }
        }
        System.out.println("The arrays are equal ? " + sem);

        //exercise 6
        int firsta[] = {1, 2, 3, 4};
        int seconda[] = {5, 6, 7, 8};
        int concat[];
        concat = new int[firsta.length + seconda.length];

        for (int i = 0; i < firsta.length; i++) {
            concat[i] = firsta[i];
        }
        for (int i = 0; i < seconda.length; i++) {
            concat[firsta.length + i] = seconda[i];
        }
        for (int i = 0; i < concat.length; i++) {
            System.out.print(concat[i]);
        }
        // exercise 7
        int a7[] = {13, 20, 14, 5, 2, 8};
        int max7 = 0;
        int min7 = Integer.MAX_VALUE;
        float avg7 = 0f;
        for (int i = 0; i < a7.length; i++) {
            if (a7[i] < min7) {
                min7 = a7[i];
            }
            if (a7[i] > max7) {
                max7 = a7[i];
            }
            avg7 += a7[i];
        }
        avg7 = avg7 / a7.length;
        System.out.println("The max value is" + max7 + "The min value is " + min7 + "The avg is" + avg7);

        //exercise 8
        int a8[] = {13, 20, 14, 5, 2, 8};
        int index = 5;
        int k=0;
        while(k<a8.length)
        {
            if(index==a8[k])
                System.out.println("The index of the number is " + k);
            k++;
        }

        //exercise 9
        int a9[] = {13, 20, 14, 5, 2, 8};
        int odd = 0;
        int even = 0;
        for (int i = 0; i < a9.length; i++)
        {
            if(a9[i]%2==0)

            {
                even++;
            }
            else

            {
                odd++;
            }
        }
        System.out.println("The number of even numbers " + even + " The number of odd numbers " + odd);


        //exercise 10
        String MyString="Hello java world";
        String givenString="java";
        if(MyString.contains(givenString))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

        //exercise 11
        String MyString11="Hello java world";
        char mychar='a';
        int app=0;
        for(int i=0; i<MyString11.length();i++)
        {
            if(MyString11.charAt(i)==mychar)
            {
                app++;
            }

        }
        System.out.println("The number of app " + app);

        //exercise 12
        String MyString12="Hello java world";
        String stringend="orld";
        boolean sem12=true;
        for(int i=(MyString12.length()-stringend.length());i<MyString12.length();i++)
        {
            if(MyString12.charAt(i) != stringend.charAt(i-MyString12.length()+stringend.length()))
            {
                sem12=false;
            }
        }
        System.out.println("The string ends with the specified string? "+sem12 );

        //exercise 13
        String Mystring13="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String dat="abcd";
        int numere[];
        numere=new int[52];
        for(int i=0;i<numere.length;i++)
        {
            numere[i]=i;
        }
        for(int  j=0;j<dat.length();j++)
            for(int i=0;i<Mystring13.length();i++)
            {
                if(Mystring13.charAt(i)==dat.charAt(j))
                    System.out.print( " " + numere[i]);
            }
        // exercise 14
        String MyString14="Hello world";
        String result = new String();
        int i=0;
        while(i<(MyString14.length()-1))
        {
            result += MyString14.charAt(i);
            if(MyString14.charAt(i)==MyString14.charAt(i+1))
            {

                result +="#" ;
            }

            i++;
        }
        result+=MyString14.charAt(i);
        System.out.println(result);


        //exercise 15
        String MyString15="aaabccbaaa";
        boolean sem15=true;
        for(int j=0; j<(MyString15.length()/2);j++)
        {
            if(MyString15.charAt(j)!=MyString15.charAt(MyString15.length()-j-1))
            {
                sem15=false;
            }
        }
        System.out.println(sem15);
    }

}


import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

     //problem 1
       System.out.println("1.Please insert a target number ");
       int x1=scan.nextInt();
       int sum1=0;
       for(int i=0;i<=x1;i++)
           sum1=sum1+i;
        System.out.println("Sum is "+ sum1);

     //problem 2
        System.out.println("2.Please insert a and b");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int sum2=0, c=0;
        for (int i=a;i<=b;i++)
        {
            sum2=sum2+i;
            c++;
        }
        System.out.println("Sum for range "+ a +" to " +b +":"+sum2);
        System.out.println("Average for range"+ a +" to " +b +":" + sum2/c);

     //problem 3
        System.out.println("3.Please insert a target number for Fibonacci series ");
        int x3=scan.nextInt();
        if(x3==1)
            System.out.println("The first Fibonacci number is 1 and the average is 1");
        else if(x3==2)
            System.out.println("The first 2 Fibonacci numbers are 1 1 and the average is 1");
        else
        {
            int sum3=2,c3=2;
            int f1,f2,f3;
            f1=1;
            f2=1;
            System.out.print("The first " + x3 + " Fibonacci numbers are :" + f1 + " " + f2 );
            do{
                f3=f1+f2;
                f1=f2;
                f2=f3;
                sum3=sum3+f3;
                c3++;
                System.out.print(" " + f3);
                x3--;
            }while(x3>2);
            float avg3= (float) sum3/c3;
            System.out.println("\nThe average is " + avg3);
        }

     //problem 4
        System.out.println("4.Please insert array size");
        int n4=scan.nextInt();
        System.out.println("Insert numbers");
        int[] v =new int[n4];
        for(int i=0;i<n4;i++)
            v[i]=scan.nextInt();
        if(v[0]==v[n4-1]) System.out.println("TRUE");
        else System.out.println("FALSE");

     //problem 5
        System.out.println("5.Please insert first array size");
        int n5_1=scan.nextInt();
        System.out.println("Insert first array");
        int[] v5_1 =new int[n5_1];
        for(int i=0;i<n5_1;i++)
            v5_1[i]=scan.nextInt();
        System.out.println("Please insert second array size");
        int n5_2=scan.nextInt();
        System.out.println("Insert second array");
        int[] v5_2 =new int[n5_2];
        for(int i=0;i<n5_2;i++)
            v5_2[i]=scan.nextInt();
        if(n5_1!=n5_2) System.out.println("FALSE");
        else
        {
            int ok=1;
            for(int i=0;i<n5_1;i++)
                if(v5_1[i]!=v5_2[i]) ok=0;
            if(ok==1) System.out.println("TRUE");
            else  System.out.println("FALSE");
        }

    //problem 6
        System.out.println("6.Please insert first array size");
        int n6_1=scan.nextInt();
        System.out.println("Insert first array");
        int[] v6_1 =new int[n6_1];
        for(int i=0;i<n6_1;i++)
            v6_1[i]=scan.nextInt();
        System.out.println("Please insert second array size");
        int n6_2=scan.nextInt();
        System.out.println("Insert first array");
        int[] v6_2 =new int[n6_2];
        for(int i=0;i<n6_2;i++)
            v6_2[i]=scan.nextInt();
        int n6_3=n6_1+n6_2;
        int[] v6_3 =new int[n6_3];
        for(int i=0;i<n6_1;i++)
            v6_3[i]=v6_1[i];
        for(int i=n6_1;i<n6_3;i++)
            v6_3[i]=v6_2[i-n6_1];
        System.out.print("Final array: ");
        for(int i=0;i<n6_3;i++)
            System.out.print(v6_3[i] + " ");

     //problem7
        System.out.println("\n7.Please insert array size");
        int n7=scan.nextInt();
        System.out.println("Insert  array");
        int[] v7 =new int[n7];
        int min=scan.nextInt();
        int max=min;
        int sum7=max;
        int c7=1;
        for(int i=1;i<n7;i++)
        {
            v7[i]=scan.nextInt();
            if(v7[i]>max) max=v7[i];
            if(v7[i]<min) min=v7[i];
            sum7=sum7+v7[i];
            c7++;
        }
        System.out.println("Min is " +min);
        System.out.println("Max is " +max);
        System.out.println("Avg is " +(float)sum7/c7);

     //problem 8
        System.out.println("8.Please insert array size");
        int n8=scan.nextInt();
        System.out.println("Insert  array");
        int[] v8 =new int[n8];
        for(int i=0;i<n8;i++)
            v8[i]=scan.nextInt();
        System.out.println("Please insert x element from array");
        int x8=scan.nextInt();
        int ok7=0;
        for(int i=0;i<n8;i++)
        {
            if(x8==v8[i])
            {
                System.out.println("Index is " +i);
                ok7=1;
            }
        }
        if(ok7==0) System.out.println("The x element was not found in array");

     //problem 9
        System.out.println("9.Please insert array size");
        int n9=scan.nextInt();
        System.out.println("Insert  array");
        int[] v9 =new int[n9];
        int c9_0=0;
        int c9_1=0;
        for(int i=0;i<n9;i++)
        {
            v9[i]=scan.nextInt();
            if(v9[i]%2==0) c9_0++;
            else c9_1++;
        }
        System.out.println("Even elements count: "+c9_0);
        System.out.println("Odd elements count: "+c9_1);
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class HomeWork1 {
    public static void GetSum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the target number:");

        int targetNumber=in.nextInt();
        int sum = 0;
        for(int i=0;i<=targetNumber;i++)
        {
            sum = sum + i;
        }
        System.out.println("The sum is " +sum);

    }
    public static void GetSumAndAverage()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the start number:");
        int startNumber=in.nextInt();
        System.out.println("Please enter the end number:");
        int endNumber=in.nextInt();

        int sum=0;
        int contor=0;
        for(int i=startNumber;i<=endNumber;i++)
        {
            sum = sum + i;
            contor++;
        }
        int average=sum/contor;

        System.out.println("Sum for range " +startNumber+" to " + endNumber+" : "+sum);
        System.out.println("Average for range " +startNumber+" to " + endNumber+" : "+average);
    }
    public static void GetFibonacciAndAverage()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of Fibonacci numbers you want to be printed:");

        int Numbers=in.nextInt();
        int Fibo1=1;
        int Fibo2=1;
        int FiboNext=0;
        int i=0;
        double sum=Fibo1+Fibo2;
        System.out.println("The first "+Numbers+" Fibonacci numbers are:\n "+ Fibo1 +"\n "+ Fibo2);
        while(i<Numbers-2)
        {
            FiboNext=Fibo1+Fibo2;
            sum=sum+FiboNext;
            Fibo1=Fibo2;
            Fibo2=FiboNext;
            System.out.println(" "+FiboNext);
            i++;
        }
        System.out.println("The average is "+sum/Numbers);
    }
    public static void TestFirstLastElement()
    {
        int []userInput=new int [100];
        int limit;
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the length of the array:");
        limit=in.nextInt();
        System.out.println("Please enter the INT array you want to be tested:");
        for(int i=0;i<limit;i++)
        {
            userInput[i]=in.nextInt();
        }
        if(userInput[0]==userInput[limit-1]) {
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }

    }
    public static void TestEqualityOfArrays()
    {
        Scanner in = new Scanner(System.in);
        int []userInput1=new int [100];
        int limit1;
        int []userInput2=new int [100];
        int limit2;

        System.out.println("Please enter the length of the array 1:");
        limit1=in.nextInt();
        System.out.println("Please enter the INT array you want to be tested:");
        for(int i=0;i<limit1;i++)
        {
            userInput1[i]=in.nextInt();
        }

        System.out.println("Please enter the length of the array 2:");
        limit2=in.nextInt();
        System.out.println("Please enter the INT array you want to be tested:" );
        for(int j=0;j<limit2;j++)
        {
            userInput2[j]=in.nextInt();
        }

        if(limit1!=limit2){
            System.out.print(false);
        }
        else
        {
            int i=0;
            while( i< limit1)
            {
                if(userInput1[i]!=userInput2[i])
                {
                    System.out.print(false);
                    return;
                }
                i++;
            }
            System.out.print(true);

        }
    }
    public static void ConcatenateArrays()
    {
        int[] array1={1,2,3,4};
        int[] array2={5,6,7,8};

        System.out.println("Array1 :"+ Arrays.toString(array1));
        System.out.println("Array2 :"+ Arrays.toString(array2));
        int arr1Length=array1.length;
        int arr2Length=array2.length;

        int[] concatenate=new int[arr1Length+arr2Length];
        System.arraycopy(array1,0,concatenate,0,arr1Length);
        System.arraycopy(array2,0, concatenate,arr1Length,arr2Length);

        System.out.println("Concatenated: "+ Arrays.toString(concatenate));

    }
    public static void GetMaxMinAverage()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int len=in.nextInt();
        int[] array=new int[100];
        System.out.println("Please enter the INT values of the array: ");
        for(int i=0;i<len;i++)
        {
            array[i]=in.nextInt();
        }
        int max=array[0];
        for(int i=0;i<len;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        int min=array[0];
        for(int i=0;i<len;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        int sum=0;
        for(int i=0;i<len;i++)
        {
            sum=sum+array[i];
        }
        float average=(float)sum/len;
        System.out.println("Max: "+ max+ "\n Min: "+min+ " \n Average: "+ average);

    }
    public static void GetIndexOfTarget()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int len=in.nextInt();
        int[] array=new int[100];
        System.out.println("Please enter the INT values of the array: ");
        for(int i=0;i<len;i++)
        {
            array[i]=in.nextInt();
        }
        boolean OK=false;
        System.out.println("Please type the target number:");
        int target=in.nextInt();
        for(int i=0;i<len;i++)
        {
            if(array[i]==target)
            {
                System.out.println(i);
                OK=true;
            }
        }
        if(OK==false)
        {
            System.out.println("The target is not present in this array");
        }
    }
    public static void GetOddEvenCount()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int len=in.nextInt();
        int[] array=new int[100];
        System.out.println("Please enter the INT values of the array: ");
        for(int i=0;i<len;i++)
        {
            array[i]=in.nextInt();
        }
        int odd=0;
        int even=0;
        for(int i=0;i<len;i++)
        {
            if(array[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Odd elements count: "+ odd+ "\nEven elements count: "+ even);
    }
    public static void CheckIfContainsSubString()
    {
        String container=null;
        String target=null;

        System.out.println("Please enter the big string:");
        Scanner in=new Scanner(System.in);
        container=in.nextLine();

        System.out.println("Please enter the small string:");
        target=in.nextLine();
        boolean isFound=container.contains(target);

        System.out.println("The result is: " + isFound);
    }
    public static void GetCharacterCount()
    {
        int count=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Please type the string: ");
        String str= in.nextLine();
        System.out.println("Please type the character you are looking for:");
        char character=in.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==character)
            {
                count++;
            }
        }
        System.out.println("The character "+ character+ " appears "+ count+ " times");
    }
    public static void TestEnd()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Please type the main string ");
        String mainString=in.nextLine();
        System.out.println("Please type the substring");
        String subString=in.nextLine();
        boolean check=mainString.endsWith(subString);
        System.out.println("The main string ends with the substring: "+ check);
    }
    public static void ConvertLetterToNumber()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please type the string: ");
        String str = in.nextLine();
        char[] characters = str.toCharArray();
        int[] numbersArray = new int[40];
        for (int i = 0; i < str.length(); i++) {
            int number = (int) characters[i];

            int lettersStart = 97;
            if (number <= 122 & number >= 97) {
                numbersArray[i] = number - lettersStart;

            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(numbersArray[i]);
        }
    }
    public static void InsertBetweenDuplicates()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please type the string: ");
        String Duplicate=in.nextLine();
        int len=Duplicate.length();
        for (int i=0;i<len;i++)
        {

            if (Duplicate.charAt(i)==Duplicate.charAt(i+1))
            {
                Duplicate=Duplicate.substring(0,i+1)+"#"+Duplicate.substring(i+1,Duplicate.length());
            }
        }
        System.out.println(Duplicate);



    }
    public static void CheckPalindrome()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please type the string to be checked: ");
        String palindrome=in.nextLine();
        char[] palindromeArray=palindrome.toCharArray();
        for(int i=0;i<=palindrome.length()/2;i++)
        {
            if(palindromeArray[i]!=palindromeArray[palindrome.length()-1-i])
            {
                System.out.println(false);
                return;

            }
        }
        System.out.println(true);

    }
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the number of the exercise you wanna see(1-15)");
        int option=in.nextInt();
        switch (option) {
            case 1:
                GetSum();
                break;

            case 2:
                GetSumAndAverage();
                break;

            case 3:
                GetFibonacciAndAverage();
                break;

            case 4:
                TestFirstLastElement();
                break;

            case 5:
                TestEqualityOfArrays();
                break;

            case 6:
                ConcatenateArrays();
                break;

            case 7:
                GetMaxMinAverage();
                break;

            case 8:
                GetIndexOfTarget();
                break;

            case 9:
                GetOddEvenCount();
                break;

            case 10:
                CheckIfContainsSubString();
                break;

            case 11:
                GetCharacterCount();
                break;

            case 12:
                TestEnd();
                break;

            case 13:
                ConvertLetterToNumber();
                break;

            case 14:
                InsertBetweenDuplicates();
                break;

            case 15:
                CheckPalindrome();
                break;
            default:
                System.out.println("You have entered an option that doesn't fit anywhere");
        }
    }

}

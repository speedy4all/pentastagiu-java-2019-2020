
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Homework1 {
    public static void main(String[] args) {
        int[] number = {0, 1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("The sum is: " + sum);

        System.out.println();


        int aba[] = new int[100];
        int suma = 0;
        for (int i = 0; i < aba.length; i++)
            aba[i] = i + 1;
        for (int i = 0; i < aba.length; i++)
            suma = suma + aba[i];
        System.out.println("Sum for range 1 to 100 : " + suma);
        float average = suma / aba.length;
        System.out.println("Average for range 1 to 100 : " + average);

        System.out.println();

        int max = 20;
        int n1 = 0;
        int n2 = 1;
        int sum3 = 0;
        float averagefibonacci = 0f;
        System.out.println("The first 20 Fibonacci numbers are: ");
        for (int i = 1; i <= max; i++) {
            System.out.print(n2 + " ");
            sum3 = n1 + n2;
            n1 = n2;
            n2 = sum3;
            sum3 += n1;
        }
        averagefibonacci = sum3 / max;
        System.out.println("\nThe average is " + averagefibonacci);

        System.out.println();

        int[] num = {13, 6, 2, 8, 2, 3};
        if (num[0] == num[5]) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        int[] num2 = {13, 6, 2, 8, 2, 13};
        if (num2[0] == num2[5]) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        System.out.println();

        int[] num3 = {1, 2, 3, 4};
        int[] num4 = {1, 2, 3, 4};
        if (Arrays.equals(num3, num4)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        int[] num5 = {0};
        int[] num6 = {0};
        if (Arrays.equals(num5, num6)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        int[] num7 = {1, 3, 2};
        int[] num8 = {1, 3};
        if (Arrays.equals(num7, num8)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        int[] num9 = {1, 2, 3, 4};
        int[] num10 = {1, 2, 4, 3};
        if (Arrays.equals(num9, num10)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        System.out.println();

        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        int aLen = a.length;
        int bLen = b.length;
        int[] result = new int[aLen + bLen];
        System.arraycopy(a, 0, result, 0, aLen);
        System.arraycopy(b, 0, result, aLen, bLen);
        System.out.println(Arrays.toString(result));

        System.out.println();

        int[] nums = {13, 20, 14, 5, 2, 8};
        int sum4 = 0;
        float average2 = 0;
        Arrays.sort(nums);
        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length - 1]);
        for (int ii = 0; ii < nums.length; ii++)
            sum4 = sum4 + nums[ii];
        average2 = sum4 / nums.length;
        System.out.println("Average is:" + average2);

        System.out.println();

        List<Integer> lista = new LinkedList<>();
        lista.add(13);
        lista.add(20);
        lista.add(14);
        lista.add(5);
        lista.add(2);
        lista.add(8);
        System.out.println(lista.indexOf(5));

        System.out.println();

        int[] num12 = {13, 20, 14, 5, 2, 8};
        int par = 0;
        for (int i = 0; i < num12.length; i++) {
            if (num12[i] % 2 == 0)
                par++;
        }
        System.out.println("Even elements count : " + par);
        System.out.println("Odd elements count : " + (num12.length - par));

        System.out.println();

        String aa = "Hello java world";
        String bb = "java";
        System.out.println(aa.contains(bb));

        System.out.println();

        String name = "Hello java world";
        char vocala = 'a';
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == vocala) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println();

        String name1 = "Hello java world";
        String end = "orld";
        boolean endname = name1.endsWith(end);
        System.out.println(endname);

        System.out.println();

        String one = "abcd";
        char[] ch = one.toCharArray();
        for (char c : ch) {
            int temp = (int) c;
            int temp_integer = 97;
            if (temp <= 122 & temp >= 97)
                System.out.print(temp - temp_integer);
        }
        System.out.println();

        String world="Hello world";
        String insert=world.replaceAll("(\\w)\\1", "$1#$1");
        System.out.println(insert);

        System.out.println();

        String name3 = "aaabccbaaa";
        String name4= "abccbb";
        String reverse3 = "";
        String reverse4 = "";
        for (int i = name3.length() -1; i >= 0; i--) {
            reverse3 = reverse3 + name3.charAt(i);
        }
        for (int i = name4.length() -1; i >= 0; i--) {
            reverse4 = reverse4 + name4.charAt(i);
        }
        if(name3.equals(reverse3) ) {
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
        if(name4.equals(reverse4)){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }

    }
}







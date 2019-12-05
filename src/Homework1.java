public class Homework1 {

    public static void main(String[] args) {
        //Test1
        System.out.println(sumUp(5));
        //Test2
        sumRange(1,100);
        //Test3
        fibonacci(20);
        //Test4
        System.out.println(firstAndLast(new int[] {13,6,2,8,2,3}));
        System.out.println(firstAndLast(new int[] {13,6,2,8,2,13}));
        //Test5
        System.out.println(testArrayEquality(new int[] {1,2,3,4}, new int[] {1,2,3,4}));
        System.out.println(testArrayEquality(new int[] {}, new int[] {}));
        System.out.println(testArrayEquality(new int[] {1,3,2}, new int[] {1,3}));
        System.out.println(testArrayEquality(new int[] {1,2,3,4}, new int[] {1,2,4,3}));
        //Test6
        concateneeteArrays(new int[] {1,2,3,4}, new int[] {5,6,7,8});
        //Test7
        minMaxAvg(new int[] {13,20,14,5,2,8});
        //Test8
        System.out.println(indexOfTarget(new int[] {13,20,14,5,2,8}, 5));
        //Test9
        oddEvenCounter(new int[] {13,20,14,5,2,8});
        //Test10
        System.out.println(testString("Hello java world", "java"));
        //Test11
        System.out.println(countAppearances("Hello java world", 'a'));
        //Test12
        System.out.println(endsInString("Hello java world", "orld"));
        //Test13
        System.out.println(alphabetIndex("abcd"));
        //Test14
        insertInString("Hello wooorld!");
        //Test15
        System.out.println(isPalindrome("aaabccbaaa"));
        System.out.println(isPalindrome("abccbb"));
    }

    //1
    public static int sumUp(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    //2
    public static void sumRange(int first, int second) {
        int sum = 0;
        for (int i = first; i <= second; i++) {
            sum += i;
        }
        System.out.println("Sum for range " + first + " to " + second + ": " + sum);
        System.out.println("Average for range " + first + " to " + second + ": " + (sum/(first+second)));
    }

    //3
    public static void fibonacci(int limit) {
        int first = 1, second = 1;
        int count = 1;
        int total = 1;
        System.out.println("The first " + limit + " Fibonacci numbers are: ");
        System.out.print(first + " ");
        while (count < limit) {
            System.out.print(second + " ");
            total += second;
            int sum = first + second;
            first = second;
            second = sum;
            count++;
        }
        System.out.println("\nThe average is " + ((double)total/limit));
    }

    //4
    public static boolean firstAndLast(int[] arr) {
        if (arr[0] == arr[arr.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    //5
    public static boolean testArrayEquality(int[] first, int[] second) {
        if (first.length == second.length) {
            if (first.length == 0 && second.length == 0) {
                return true;
            } else {
                for (int i = 0; i < first.length; i++) {
                    if(first[i] != second[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    //6
    public static void concateneeteArrays(int[] first, int[] second){
        int n = first.length + second.length;
        int[] concat = new int[n];
        int k = 0;
        for(int i = 0; i<n; i++) {
            if (i < first.length) {
                concat[i] = first[i];
            } else {
                concat[i] = second[k];
                k++;
            }
        }
        //print
        for (int j = 0; j < n; j++) {
            System.out.print(concat[j] + " ");
        }
    }

    //7
    public static void minMaxAvg(int[] arr) {
        int min = arr[0], max = arr[0], sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min: " + min + "\nMax: " + max + "\nAverage: " + ((double)sum/arr.length));
    }

    //8
    public static int indexOfTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        //target not found
        return -1;
    }

    //9
    public static void oddEvenCounter(int[] arr) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Odd elements: " + odd + "\nEven elements: " + even);

    }

    //10
    public static boolean testString(String base, String target) {
        if (base.contains(target)) {
            return true;
        }
        return false;

    }

    //11
    public static int countAppearances(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    //12
    public static boolean endsInString(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                int k = i;
                if(str1.charAt(i) == str2.charAt(j)) {
                    i++;
                    if (i > str1.length() - 1) {
                        return true;
                    }
                } else {
                    i = k;
                    break;
                }

            }
        }
        return false;
    }

    //13
    public static String alphabetIndex(String str) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        for (int i = 0; i < alphabet.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (alphabet.charAt(i) == str.charAt(j)) {
                    result += alphabet.indexOf(alphabet.charAt(i));
                }
            }
        }
        return result;
    }

    //14
    public static void insertInString(String str) {
        String modified = "";
        int j = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i+1)) {
                modified += str.charAt(i);
            }  else {
                modified += str.charAt(i);
                modified += "#";
            }
        }
        System.out.println(modified);
    }

    //15
    public static boolean isPalindrome(String str) {
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }

        if (str2.equals(str)) {
            return true;
        }
        return false;
    }
}

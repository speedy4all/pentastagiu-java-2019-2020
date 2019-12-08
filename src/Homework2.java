public class Homework2 {

    public static int sumNumber(int targetNumber) {

        int sum = 0;

        for (int i = 0; i <= targetNumber; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumNumber(3));

    }


}

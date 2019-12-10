public class Main {
    public static void main(String[] args) {
        int[] array = {13, 6, 2, 8, 2, 13};
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            j++;
        }
        if (array[0] == array[j]) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}

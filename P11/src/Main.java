public class Main {
    public static void main(String[] args) {
        String string = "Hello java world";
        int j = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                j++;
            }
        }
        System.out.println(j);
    }
}

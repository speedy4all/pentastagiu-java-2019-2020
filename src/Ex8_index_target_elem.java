//     Write a java program to return the index of a target element.
//     For example:
//     Given  the following array [13,20,14,5,2,8] and a target
//     element 5 the output should be : 3 (because 5 is located at index 3 in the array)

public class Ex8_index_target_elem {
    public static void main(String[] args) {
        int arr[] = {13, 20, 14, 5, 2, 8};
        int value = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                int index = i;
                System.out.println("Element 5 was found at index: " + index);
            }
        }
    }
}

package arrays.arrayTraversal;

public class ReverseArrayTraversal {
    public static void reverseArray(int[] arr) {
        System.out.println("Print Array in reverse: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");
        }
    }
}

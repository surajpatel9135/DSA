package arrays.arrayTraversal;

public class ArrayReverse {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        
        while(left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Array after reverse: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

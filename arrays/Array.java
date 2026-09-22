package arrays;

import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        // array creation
        int[] arr = new int[n];

        // read values
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Arrays: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}

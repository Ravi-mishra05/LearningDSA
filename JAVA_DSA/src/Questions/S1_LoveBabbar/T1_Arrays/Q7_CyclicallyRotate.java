package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.Arrays;

public class Q7_CyclicallyRotate {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, n);
    }

    private static void rotate(int arr[], int n) {
//        Given an array, rotate the array by one position in clock-wise direction.
        for (int i = n-1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

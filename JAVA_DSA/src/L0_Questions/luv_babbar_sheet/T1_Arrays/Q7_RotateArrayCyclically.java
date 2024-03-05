package L0_Questions.luv_babbar_sheet.T1_Arrays;

import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
public class Q7_RotateArrayCyclically {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotate(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    static public void rotate(int arr[], int n) {
        for (int i = n - 1; i >= 1; --i) {
            // int temp = arr[i];
            // arr[i] = arr[i-1];
            // arr[i-1] = temp;
            swap(arr, i, i-1);
        }
    }
    static public void swap(int[] arr, int a, int b){
        int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
    }

    
}

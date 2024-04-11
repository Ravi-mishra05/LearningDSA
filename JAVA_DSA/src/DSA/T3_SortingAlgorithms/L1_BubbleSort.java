package DSA.T3_SortingAlgorithms;

import java.util.Arrays;

public class L1_BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 5, 4, 2 };
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }

    static int[] BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];   // swap.
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

}

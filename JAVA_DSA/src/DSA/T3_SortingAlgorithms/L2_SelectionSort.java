package DSA.T3_SortingAlgorithms;

import java.util.Arrays;

public class L2_SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int max = findMax(arr, 0, last);
            swap(arr, last, max);
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public static int findMax(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }
}

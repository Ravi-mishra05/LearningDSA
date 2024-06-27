package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.Arrays;

public class Q5_SegregateElements {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateElements(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void segregateElements(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        int mid = count, start = 0;

        int[] positiveElements = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) positiveElements[start++] = arr[i];
            else positiveElements[mid++] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = positiveElements[i];
        }
    }

}

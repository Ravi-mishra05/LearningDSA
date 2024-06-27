package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.Arrays;

public class Q4_sort012 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        sort012a(arr);
        sort012(arr);
    }

    private static void sort012(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int num : arr) {
            if (num == 0) count0++;
            if (num == 1) count1++;
            if (num == 2) count2++;
        }

        int i = 0;
        while (count0 > 0) {
            arr[i++] = 0;
            count0--;
        }

        while (count1 > 0) {
            arr[i++] = 1;
            count1--;
        }

        while (count2 > 0) {
            arr[i++] = 2;
            count2--;
        }

        System.out.println(Arrays.toString(arr));
    }

//    Approach 2: Dutch National Flag algorithm, also known as the Three-Way Partitioning algorithm.

    private static void sort012a(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int temp;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.Arrays;

public class Q35_FindMedian {
    public static void main(String[] args) {
        int[] arr = {90,100,78,89,67};
        System.out.println(find_median(arr));
    }
    private static int find_median(int[] array) {
        int size = array.length;
        Arrays.sort(array);
        if (size % 2 == 0) {
            // Length is even
            int median1 = array[size / 2 - 1];
            int median2 = array[size / 2];
            return (median1 + median2) / 2;
        } else {
            // Length is odd
            return array[size / 2];
        }
    }
}

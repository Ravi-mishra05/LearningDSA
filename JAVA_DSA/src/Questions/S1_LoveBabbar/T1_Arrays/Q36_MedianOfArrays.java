package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.Arrays;

public class Q36_MedianOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9};
        int[] arr2 = {2, 3, 6, 7};
        System.out.println(medianOfArrays(3, 4, arr1, arr2));
    }

    private static double medianOfArrays(int n, int m, int a[], int b[]) {
        // Your Code Here
        int size = n + m;
        int[] array = new int[size];
        int index = 0;
        for (int i : a){
            array[index] = i;
            index++;
        }
        for (int i : b){
            array[index] = i;
            index++;
        }
        Arrays.sort(array);
        if (size % 2 == 0) {
            // Length is even
            int median1 = array[size / 2 - 1];
            int median2 = array[size / 2];
            return (median1 + median2) / 2.0;
        } else {
            // Length is odd
            return array[size / 2];
        }
    }
}

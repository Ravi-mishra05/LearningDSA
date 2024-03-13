package T2_luv_babbar_sheet.T1_Arrays;

import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1

// solved with some help.
public class Q9_MinimiseHeights2 {
    public static void main(String[] args) {
        // int[] arr = { 1, 5, 8, 10 };
        int[] arr = { 5, 1, 2, 9, 4, 10 };
        System.out.println(minimiseHeight(arr, 1, 6));
    }

    // @SuppressWarnings("unused")
    private static int minimiseHeight(int arr[], int k, int n) {
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];

        int largest = arr[n - 1] - k;
        int smallest = arr[0] + k;

        for (int i = 0; i < n - 1; i++) {
            int min = Math.min(smallest, arr[i + 1] - k);
            int max = Math.max(largest, arr[i] + k);
            if (min < 0)
                continue;
            ans = Math.min(ans, max - min);
        }

        return ans;
    }

}

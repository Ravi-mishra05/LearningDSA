package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.Arrays;

public class Q9_MinimizeTheHeightsII {
    public static void main(String[] args) {
        int k = 2, n = 4;
        int[] arr = {1, 5,6,7, 8, 10};
        int ans = getMinDiff(arr, n, k);
        System.out.println(ans);
    }

    private static int getMinDiff(int[] arr, int n, int k) {
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

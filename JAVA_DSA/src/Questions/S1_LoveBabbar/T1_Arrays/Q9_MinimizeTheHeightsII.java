package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.Arrays;

public class Q9_MinimizeTheHeightsII {
    public static void main(String[] args) {
        int k = 2, n = 4;
        int[] arr = {1, 5, 8, 10};
        int ans = getMinDiff(arr,n,k);
        System.out.println(ans);
    }
    public static int getMinDiff(int[] arr, int n, int k) {
        if (n == 1) return 0;
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];

        for (int i = 0;i < n;i++) {
            if (arr[i] < k) continue;
            int curr_min = Math.min(arr[0] + k, arr[i] - k);
            int curr_max = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            if (curr_max < curr_min) continue;
            ans = Math.min(ans, curr_max - curr_min);
        }
        return ans;
    }
}

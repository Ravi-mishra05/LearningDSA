package L0_Questions.luv_babbar_sheet.T1_Arrays;

// https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
public class Q8_KadanesAlgorithm {
    public static void main(String[] args) {

    }

    public static long maxSubarraySum(int arr[], int n) {

        // Your code here
        long max_sum = Long.MIN_VALUE;
        long currsum = 0;
        for (int i = 0; i < n; i++) {
            currsum = currsum + arr[i];
            max_sum = Math.max(currsum, max_sum);
            if (currsum < 0) {
                currsum = 0;
            }
        }
        return max_sum;
    }

}

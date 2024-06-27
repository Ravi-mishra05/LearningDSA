package Questions.S1_LoveBabbar.T1_Arrays;

public class Q13_MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        System.out.println(maxSubarraySum(arr, 5));
    }
//    Kadane's Algorithm is a dynamic programming algorithm that finds the largest sub-array sum in a given array of numbers.
//    The algorithm is known for its simplicity and effectiveness, and it has applications in fields such as image processing, data analysis, and algorithmic problem-solving.


private static long maxSubarraySum(int arr[], int n) {
        long maxSum = Long.MIN_VALUE;
        long currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum = currSum + arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}

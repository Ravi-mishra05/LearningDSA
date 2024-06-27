package Questions.S1_LoveBabbar.T1_Arrays;

public class Q8_KadanesAlgo {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,-2,5};
        long ans = maxSubarraySum(arr,n);
        System.out.println(ans);
    }
    private static long maxSubarraySum(int arr[], int n){
        long maxSum = Long.MIN_VALUE;
        long currSum = 0;
        for(int i = 0; i< n ; i++){
            currSum = currSum + arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}


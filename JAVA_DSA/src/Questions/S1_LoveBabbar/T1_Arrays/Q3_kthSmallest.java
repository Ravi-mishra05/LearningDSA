package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.Arrays;

public class Q3_kthSmallest {
    public static void main(String[] args) {
        int[] arr = {99, 22, 3 , 5 , 6, 7, 1};
        System.out.println(kthSmallest(arr,3));
    }
    private static int kthSmallest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}

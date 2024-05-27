//package Questions.S1_LoveBabbar.T1_arrs;
//
//public class Q33_MinimumSweeps {
//    public static void main(String[] args) {
//        int[] arr = {2, 7, 9, 5, 8, 7, 4};
//        System.out.println(minSwap(arr, 7, 6));
//    }
//
//    public static int minSwap(int arr[], int n, int k) {
//        //Complete the function
//        if (n <= 2) {
//            return 0;
//        }
//        int count = 0;
//        for(int i: arr){
//            if (i <= k)
//                count++;
//        }
//        return count-1;
//    }
//    public static void swap(int[]arr , int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}

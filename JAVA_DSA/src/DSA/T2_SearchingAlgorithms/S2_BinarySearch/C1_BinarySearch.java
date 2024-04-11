package DSA.T2_SearchingAlgorithms.S2_BinarySearch;

public class C1_BinarySearch {
    public static void main(String[] args) {
        // int a = Integer.MAX_VALUE;
        int [] arr = {1, 3, 5, 6, 7, 8, 9,};
        System.out.println(binarySearch(arr, 7));

    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

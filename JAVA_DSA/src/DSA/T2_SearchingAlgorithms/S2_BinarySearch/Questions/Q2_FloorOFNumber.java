package DSA.T2_SearchingAlgorithms.S2_BinarySearch.Questions;

public class Q2_FloorOFNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        int target = 2;
        System.out.println(floorOfANumber(arr, target));
    }

    public static int floorOfANumber(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[end];
    }
}

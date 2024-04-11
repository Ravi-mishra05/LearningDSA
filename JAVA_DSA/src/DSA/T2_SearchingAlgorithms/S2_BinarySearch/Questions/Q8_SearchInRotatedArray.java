package DSA.T2_SearchingAlgorithms.S2_BinarySearch.Questions;

public class Q8_SearchInRotatedArray {

    public static void main(String[] args) {
        int[] arr = { 6, 7, 8, 1, 2, 4, 5, };
        System.out.println(findPivot(arr));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (target == nums[pivot]) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // public static int searchWithDuplicateValues(int[] nums, int target) {

    // }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

    static int findPivot(int[] nums) { // for distinct integers in an array.

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}

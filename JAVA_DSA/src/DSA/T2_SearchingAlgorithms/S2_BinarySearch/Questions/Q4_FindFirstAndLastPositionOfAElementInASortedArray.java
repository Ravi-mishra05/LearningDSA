package DSA.T2_SearchingAlgorithms.S2_BinarySearch.Questions;

public class Q4_FindFirstAndLastPositionOfAElementInASortedArray {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = binarySearch(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = binarySearch(nums, target, false);
        }
        return ans;
    }

    static int binarySearch(int[] nums, int target, boolean checkFirst) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                ans = mid;
                if (checkFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                // return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}

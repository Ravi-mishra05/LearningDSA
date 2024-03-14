package T1_Dailly_Questions_LC_2024;

public class march14 {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0, 0 };
        System.out.println(numSubarraysWithSum(arr, 0));
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int tempSum = nums[i];
            if (nums[i] == goal) {
                ans++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                tempSum += nums[j];
                if (tempSum == goal) {
                    ans++;
                }
            }
        }
        return ans;
    }

}

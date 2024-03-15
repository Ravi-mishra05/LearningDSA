package T1_Dailly_Questions_LC_2024.marchArpil;

import java.util.Arrays;

public class march15 {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4 };
        int[] arr = { 0, 0 };
        int[] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

    // time limit execeeded.
    public static int[] productExceptSelf1(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int newElement = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    newElement *= nums[j];
                }
            }
            ans[i] = newElement;
        }
        return ans;
    }
}

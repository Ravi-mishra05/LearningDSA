package T1_Dailly_Questions_LC_2024.M1_2_JanFeb;

// https://leetcode.com/problems/missing-number/description/?envType=daily-question&envId=2024-02-20
// 268. Missing Number
public class feb20 {
    public static void main(String[] args) {

    }

    class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int missing = n;

            for (int i = 0; i < n; i++)
                missing ^= i ^ nums[i];

            return missing;
        }
    }
}

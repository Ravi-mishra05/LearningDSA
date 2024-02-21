package L0_Questions.Dailly_Questions_LC_2024;

// https://leetcode.com/problems/bitwise-and-of-numbers-range/?envType=daily-question&envId=2024-02-21
// 201. Bitwise AND of Numbers Range
public class feb21 {
    public static void main(String[] args) {

    }

    class Solution {
        public int rangeBitwiseAnd(int left, int right) {
            int shift = 0;
            // Find the common MSB (Most Significant Bit) of left and right
            while (left < right) {
                left >>= 1;
                right >>= 1;
                shift++;
            }
            // Left shift left by the number of common MSB bits
            return left << shift;
        }

    }
}

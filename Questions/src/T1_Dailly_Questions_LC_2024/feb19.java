package L0_Questions.Dailly_Questions_LC_2024;

// https://leetcode.com/problems/power-of-two/description/?envType=daily-question&envId=2024-02-19
// 231. Power of Two
public class feb19 {
    public static void main(String[] args) {
        
    }

    
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if(n<1) return false;
            int x= n & (n - 1);
            return x==0;
        }
    }
}

package T1_Dailly_Questions_LC_2024.M3_March;

import java.util.HashMap;

public class March16 {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 0, 0, 0, 1, 1 };
        System.out.println(findMaxLength(arr));

    }

    public static int findMaxLength(int[] nums) {
        // Create a hashmap to store count and index
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize the map with 0 count at index -1
        int maxLen = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            // If the current element is 0, decrement count; otherwise, increment count
            count += (nums[i] == 0) ? -1 : 1;
            // Check if the count has been encountered before
            if (map.containsKey(count)) {
                // Calculate the length of the subarray
                maxLen = Math.max(maxLen, i - map.get(count));
            } else {
                // If the count is encountered for the first time, put it into the map
                map.put(count, i);
            }
        }
        return maxLen;
    }

    // wrong answer for int[] arr = { 0,0,1,0,0,0,1,1 };
    public static int findMaxLength1(int[] nums) {
        int ans = 0;
        if (nums.length == 1)
            return 0;

        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else {
                count1++;
            }

            if (count0 == count1) {
                ans = count0 + count1;
            }
        }
        return ans;
    }
}

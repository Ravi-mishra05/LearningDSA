package DSA.T3_SortingAlgorithms.Questions;

// https://leetcode.com/problems/missing-number/
public class Q1_MissingNumbers {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 4, 1, 6 };
        System.out.println(missingNumber0(arr));
    }

    // approach 1
    public static int missingNumber0(int[] nums) {
        int n = nums.length;
        int missing = n;

        for (int i = 0; i < n; i++)
            missing ^= i ^ nums[i];

        return missing;
    }

    // approach 2
    // if range is (0,n) -- sum of numbers - each element
    static int missingNumber1(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int sum = (max * (max + 1)) / 2;

        if (min != 0) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
            if (sum == 0) {
                sum = max + 1;
            }
        }

        return sum;
    }

    // Approach 3
    // if range is from (x,y) -- create a boolean array to check which element is
    // not available.

    // static int missingNumber2(int[] arr) {

    // }

}
package T2_Sheets.S1_LoveBabbar.T1_Arrays;

// https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
public class Q10_MinimumJumps {
    public static void main(String[] args) {
        // int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int[] arr = { 1, 4, 3, 2, 6, 7 };
        System.out.println(minJumps(arr));

    }

    static int minJumps(int[] arr) {
        // your code here
        int n = arr.length;
        if (n <= 1)
            return 0;

        if (arr[0] == 0)
            return -1;

        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;
        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jumps;
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;
            if (steps == 0) {
                if (i >= maxReach)
                    return -1;
                steps = maxReach - i;
                jumps++;
            }
        }
        return -1;
    }
}

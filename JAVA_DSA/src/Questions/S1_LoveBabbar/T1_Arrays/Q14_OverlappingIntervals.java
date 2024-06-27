package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.Arrays;

public class Q14_OverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = {{6,8},{1,9},{2,4},{4,7}};
        System.out.println(Arrays.deepToString(overlappedInterval(arr)));
    }
    private static int[][] overlappedInterval(int[][] Intervals) {
        
        return new int[][]{{0, 0}, {0, 0}};
    }
}

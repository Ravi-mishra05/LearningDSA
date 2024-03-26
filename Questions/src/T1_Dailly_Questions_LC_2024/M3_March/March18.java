package T1_Dailly_Questions_LC_2024.M3_March;

import java.util.Arrays;
import java.util.Comparator;

public class March18 {
    public static void main(String[] args) {

    }

    public static int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        // Sort balloons based on their end points
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });

        int arrows = 1; // Initial arrow count
        int end = points[0][1]; // End point of the first balloon

        // Iterate through each balloon
        for (int i = 1; i < points.length; i++) {
            // If the current balloon starts after the previous balloon's end,
            // a new arrow is required and update the end point
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            }
        }

        return arrows;
    }

}
package T1_Dailly_Questions_LC_2024.M3_March;

import java.util.ArrayList;
import java.util.List;

public class March17 {
    public static void main(String[] args) {

    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Add all intervals that end before the new interval starts
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        // Add all remaining intervals
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        // Convert list to array
        int[][] mergedIntervals = new int[result.size()][2];
        for (int j = 0; j < result.size(); j++) {
            mergedIntervals[j] = result.get(j);
        }

        return mergedIntervals;
    }
}

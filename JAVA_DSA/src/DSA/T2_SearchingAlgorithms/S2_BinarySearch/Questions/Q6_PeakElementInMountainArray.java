package DSA.T2_SearchingAlgorithms.S2_BinarySearch.Questions;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Q6_PeakElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 7, 6, 3, 2 };
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        // solution
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        return start;
    }
}

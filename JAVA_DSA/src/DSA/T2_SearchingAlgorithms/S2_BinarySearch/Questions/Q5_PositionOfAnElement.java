package DSA.T2_SearchingAlgorithms.S2_BinarySearch.Questions;

public class Q5_PositionOfAnElement {
    // find position of an element in a sorted array of an infinite numbers
    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 90;
        System.out.println(positionOfAnElement(arr, target));

    }

    static int positionOfAnElement(int arr[], int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newstart = end + 1;
            end = end + (end - start) + 1;
            start = newstart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

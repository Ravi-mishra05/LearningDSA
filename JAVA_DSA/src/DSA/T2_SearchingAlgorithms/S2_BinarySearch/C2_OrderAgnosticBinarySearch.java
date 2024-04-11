package DSA.T2_SearchingAlgorithms.S2_BinarySearch;

public class C2_OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 9, 7, 6, 3, 2, 1 };
        System.out.println(orderAgnousticBinarSearch(arr, 2, 0, 5));

    }

    static int orderAgnousticBinarSearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}

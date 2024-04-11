package DSA.T11_Recursion;

public class C3_BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9 };
        System.out.println(search(arr, 9, 0, 7));
    }

    public static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return search(arr, target, start, mid - 1);
        } else {
            return search(arr, target, mid + 1, end);
        }
    }
}

package T2_luv_babbar_sheet.T1_Arrays;

// https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1
public class Q9_MinimiseHeights2 {
    public static void main(String[] args) {
        // int[] arr = { 1, 5, 8, 10 };
        int[] arr = { 5, 1, 2, 9, 4, 10 };
        System.out.println(minimiseHeight(arr, 1, 6));
    }

    // @SuppressWarnings("unused")
    private static int minimiseHeight(int arr[], int k, int n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > k) {
                arr[i] -= k;
            } else {
                arr[i] += k;
            }

            if (arr[i] > max) {
                max = Math.max(arr[i], max);
            } else {
                min = Math.min(arr[i], min);
            }

        }

        // for (int i = 0; i < arr.length; i++) {

        // }
        return (max - min);
    }

}

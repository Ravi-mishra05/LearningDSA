package L0_Questions.luv_babbar_sheet.T1_Arrays;

import java.util.Arrays;

public class Q5_MoveAllNegatives {
    public static void main(String[] args) {
        int[] arr = { 1, -1, 3, 2, -7, -5, 11, 6 };
        segregateElements(arr, 8);
    }
    public static void segregateElements(int arr[], int n) { //solution
        int cnt = 0;
        for (int i = 0; i < n; i++) {
        if (arr[i] >= 0) cnt++;
        }
        int mid = cnt, start = 0;
        int[] positiveElements = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) positiveElements[start++] = arr[i];
            else positiveElements[mid++] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = positiveElements[i];
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void segregateElements1(int arr[], int n) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                x++;
            }
        }
        // System.out.println(x);
        int[] positives = new int[x];
        int[] negatives = new int[n - x];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positives[k] = arr[i];
                k++;
            }
        }

        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negatives[l] = arr[i];
                l++;
            }
        }
        // System.out.println(Arrays.toString(positives));
        // System.out.println(Arrays.toString(negatives));

        //  now changing the main array
        for (int i = 0; i < positives.length; i++) {
            arr[i] = positives[i];
        }
        
        for(int i = 0; i< negatives.length ;i++){
            arr[x+i] = negatives[i];
        }

        System.out.println(Arrays.toString(arr));

    }
}
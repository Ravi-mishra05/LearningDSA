package L0_Questions.luv_babbar_sheet.T1_Arrays;

import java.util.Arrays;

public class Q5_MoveAllNegatives {
    public static void main(String[] args) {
        int[] arr = { 1, -1, 3, 2, -7, -5, 11, 6 };
        segregateElements(arr, 8);
    }

    public static void segregateElements(int arr[], int n) {
        // Your code goes here
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                k++;
            }
        }
        int[] positive = new int[n - k];
        int[] negative = new int[k];

        int x = 0;
        int y = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive[x] = arr[i];
                x++;
            } else {
                negative[y] = arr[i];
                y++;
            }
        }
        // System.out.print(Arrays.toString(positive));
        // System.out.print(Arrays.toString(negative));
        int z = 0;
        for(int i = 0; i< positive.length; i++){
            arr[z] = positive[i];      
            z++;
        }
        for(int i = 0; i< negative.length; i++){
            arr[z] = negative[i];      
            z++;
        }

        System.out.println(Arrays.toString(arr));
        

    }
}
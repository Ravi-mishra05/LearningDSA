package L0_Questions.luv_babbar_sheet.T1_Arrays;

import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
public class Q4_SortArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 0, 0 };
        sortArray(arr, 6);

    }

    // we cannot use Arrays.sort(arr);
    static void sortArray(int[] arr, int n) {
        // int n = arr.length;
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                var0++;
            } else if (arr[i] == 1) {
                var1++;
            } else {
                var2++;
            }
        }
        int k = 0;
        int[] newArr = new int[n];
        for (int i = 0; i < var0; i++) {
            newArr[k] = 0;
            k++;
        }
        for (int i = 0; i < var1; i++) {
            newArr[k] = 1;
            k++;

        }
        for (int i = 0; i < var2; i++) {
            newArr[k] = 2;
            k++;

        }

        System.out.println(Arrays.toString(newArr));
    }
}

// solution:
// public static void sort012(int arr[], int n)
//     {
//           // int n = arr.length;
//         int var0 = 0;
//         int var1 = 0;
//         int var2 = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == 0) {
//                 var0++;
//             } else if (arr[i] == 1) {
//                 var1++;
//             } else {
//                 var2++;
//             }
//         }
//         int k = 0;
        
//         for (int i = 0; i < var0; i++) {
//             arr[k] = 0;
//             k++;
//         }
//         for (int i = 0; i < var1; i++) {
//             arr[k] = 1;
//             k++;

//         }
//         for (int i = 0; i < var2; i++) {
//             arr[k] = 2;
//             k++;

//         }
//     }
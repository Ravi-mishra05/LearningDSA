package DSA.T1_ArraysAndArraylists;

import java.util.Arrays;
import java.util.Scanner;

public class L2_2Darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // define a 2D array
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] arr2 = new int[3][3];

        // input in an 2d array
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = in.nextInt();
            }
        }

        // printing the array.
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println();

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        in.close();
    }
}

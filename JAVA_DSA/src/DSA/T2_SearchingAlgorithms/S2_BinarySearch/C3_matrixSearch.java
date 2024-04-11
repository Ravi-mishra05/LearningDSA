package DSA.T2_SearchingAlgorithms.S2_BinarySearch;

import java.util.Arrays;

public class C3_matrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 8 },
                { 2, 4, 6, 9 },
                { 10, 13, 15, 18 },
                { 20, 22, 25, 30 }
        };
        System.out.println(Arrays.toString(traversal(matrix, 13)));
        System.out.println((searchMatrix(matrix, 13)));

    }

    static int[] traversal(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static public boolean searchMatrix(int[][] arr, int target) {
        int row = 0;
        int col = arr[row].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return true;
            }

            // Target lies in further row
            if (arr[row][col] < target) {
                row++;
            }
            // Target lies in previous column
            else {
                col--;
            }
        }
        return false;
    }

}

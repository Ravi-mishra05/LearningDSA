package L6B_BinarySearchIn2DArrays;

import java.util.Arrays;

public class L1_matrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 8 },
                { 2, 4, 6, 9 },
                { 10, 13, 15, 18 },
                { 20, 22, 25, 30 }
        };
        System.out.println(Arrays.toString(traversal(matrix, 13)));
        System.out.println(Arrays.toString(rowColMatrix(matrix, 13)));

    }

    static int[] traversal(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (matrix[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] rowColMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length - 1 && col > 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            }

            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[] { -1, -1 };
    }

    // static int[] sortedMatrix(int [][] matrix, int target){

    // }
}

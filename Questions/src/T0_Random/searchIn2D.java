package T0_Random;

import java.util.Arrays;

public class searchIn2D {
    public static void main(String[] args) {
        int[][] arr = {{12, 4, 2},
                    {13, 1, 8, 10},
                    {0, 54, 23}
                };
        int target  = 100;   // 2,0
        String ans = SearchArr(arr, target);
        System.out.println(ans);

    }
    static String SearchArr(int[][] arr, int target){
        for(int row = 0; row< arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    int[] ans = {row,col} ;
                
                return Arrays.toString(ans);
                }
            }
        }
        // return new int[]{-1,-1};
        return "-1";
    }
}
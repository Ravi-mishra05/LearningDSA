package T0_Random;

public class SearchIn2dd {
    public static void main(String[] args) {
        int[][] arr = {
                    {12, 4, 2},
                    {13, 1, 8, 10},
                    {0, 54, 23}
                };
        int target  = 0;
        int[] ans = SearchArr(arr, target); // answer is stored in vr ans.
        
        for(int i = 0; i< ans.length;i++){
            System.out.print(ans[i] + " ");
        }

    }

    static int[] SearchArr(int[][] arr, int target){
        for(int row = 0; row< arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                   
                return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

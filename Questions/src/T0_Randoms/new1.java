package L0_Questions.others;
// package L00_Others;

// import java.util.Arrays;

// public class new1 {
    
//     private static final char[] SearchRange = null;
//     //find the first and last position of element in a sorted array.
//     public static void main(String[] args) {
//         int[] arr = {5,7,7,7,7,8,8,10};
//         int target = 7;
//         System.out.println(Arrays.toString(SearchRange(arr,target)));
        
//     }//will check the first and last index
//     public static int[] SearchRange(int[] arr, int target){
//         int[] ans = {-1,-1};
//         int start = Position(arr, target, true);
//         int end = Position(arr, target, false);

//         ans[0] = start;
//         ans[1] = end;
//         return ans;

//     }
//     //this method will return the index values of the target
//     static int Position(int[] arr, int target, boolean firstStartIndex){
//         int ans= -1;
//         int start = 0;
//         int end = arr.length-1;
//         while(start<=end){
//             int mid = (start+end)/2;
//             if(target< arr[mid]){
//                 end = mid-1;
//             }else if(target> arr[mid]){
//                 start = mid+1;
//             }else{
//                 ans = mid;
//                 if(firstStartIndex){
//                     end = mid-1;
//                 }else{
//                     start = mid+1;
//                 }
//             }
//         }
//         return ans;
//     }
    
// }


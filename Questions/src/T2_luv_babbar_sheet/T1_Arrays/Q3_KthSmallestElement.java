package T2_luv_babbar_sheet.T1_Arrays;
// https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1

import java.util.Arrays;

// Given an array arr[] and an integer K where K is smaller than size of array,
//  the task is to find the Kth smallest element in the given array.
//  It is given that all array elements are distinct.
public class Q3_KthSmallestElement {
    public static void main(String[] args) {
        
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        l = 0;
        r = arr.length -1;
        Arrays.sort(arr);
        return arr[k-1];
        
    }
    
}

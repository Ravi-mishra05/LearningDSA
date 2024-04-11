package DSA.T2_SearchingAlgorithms.S2_BinarySearch.Questions;

// https://leetcode.com/problems/find-in-mountain-array/
public class Q7_FindInMountainArray {
    public static void main(String[] args) {

    }

    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface MountainArray {
     * public int get(int index) {}
     * public int length() {}
     * }
     */

    // class Solution {
    // public int findInMountainArray(int target, MountainArray mountainArr) {
    // int peak = findPeakElement(mountainArr) ;
    // int ans1 = orderAgnousticBinarySearch(mountainArr, target, 0 , peak);
    // if(ans1 == -1){
    // return orderAgnousticBinarySearch(mountainArr,target, peak+1,
    // mountainArr.length() -1);
    // } else{
    // return ans1;
    // }
    // }
    // static int orderAgnousticBinarySearch(MountainArray arr, int target, int
    // start, int end) {
    // boolean isAsc = arr.get(start) < arr.get(end);

    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (arr.get(mid) == target) {
    // return mid;
    // }

    // if (isAsc) {
    // if (target > arr.get(mid)) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // } else {
    // if (target > arr.get(mid)) {
    // end = mid - 1;
    // } else {
    // start = mid + 1;
    // }
    // }
    // }

    // return -1;
    // }

    // static int findPeakElement(MountainArray arr){
    // int start = 0;
    // int end = arr.length() -1;
    // while (start < end){
    // int mid = start + (end - start)/2;

    // if(arr.get(mid) > arr.get(mid+1)){
    // end = mid;
    // } else {
    // start = mid +1;
    // }

    // }
    // return start;
    // }
    // }

}

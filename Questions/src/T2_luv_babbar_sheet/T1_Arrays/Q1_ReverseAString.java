package T2_luv_babbar_sheet.T1_Arrays;
// https://www.geeksforgeeks.org/problems/reverse-a-string/1

// solved

public class Q1_ReverseAString {
    // You are given a string s. You need to reverse the string.
    // Example 1:
    // Input:
    // s = Geeks
    // Output: skeeG
    public static void main(String[] args) {

    }

    public static String reverseWord(String str) {
        // Reverse the string str
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }

}

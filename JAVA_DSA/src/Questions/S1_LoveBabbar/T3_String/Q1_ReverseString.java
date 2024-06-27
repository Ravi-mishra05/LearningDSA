package Questions.S1_LoveBabbar.T3_String;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Q1_ReverseString {
    public static void main(String[] args) {
        String str = "Ravi";
        System.out.println(reverseWord(str));
        System.out.println(reverseWord1(str));
        System.out.println(reverseWord2(str));
        System.out.println(reverseWord3(str));
        System.out.println(reverseWord4(str));
        System.out.println(reverseWord5(str));
        System.out.println(reverseWord6(str));
    }


    //    Approach 1: convert to array and then perform the action      -- two pointer approach.
    private static String reverseWord(String str) {
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

    //    approach 2: perform directly on string    -- Using StringBuilder
    private static String reverseWord1(String str) {
        StringBuilder sb = new StringBuilder(str);
        String ans = sb.reverse().toString();
        return ans;
    }

    // Approach 3: using a For loop
    private static String reverseWord2(String str){
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    //    approach 3: Recursive  -- not for big inputs
    private static String reverseWord3(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseWord2(str.substring(1)) + str.charAt(0);
    }

    //      Approach 4: Using Java 8 Streams
    private static String reverseWord4 (String str){
        String ans = new StringBuilder(str).reverse().toString();
        return ans;
    }

    //      Approach 5: Using Stack
    private static StringBuilder reverseWord5 (String str){
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans;
    }

    //      Approach 6: using Dequeue -- doubly ended queue
    private static StringBuilder reverseWord6 (String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.addFirst(c);
        }
        StringBuilder ans = new StringBuilder();
        while (!deque.isEmpty()) {
            ans.append(deque.pollFirst());
        }
        return ans;
    }
}

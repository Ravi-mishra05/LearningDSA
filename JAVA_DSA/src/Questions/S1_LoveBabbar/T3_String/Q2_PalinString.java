package Questions.S1_LoveBabbar.T3_String;

import java.util.Stack;

public class Q2_PalinString {
    public static void main(String[] args) {
        String s = "abaaba";
        String st = "abc";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome1(s));
        System.out.println(isPalindrome2(s));
        System.out.println(isPalindrome3(s));
        System.out.println(isPalindrome4(s));
        System.out.println(isPalindrome(st));
        System.out.println(isPalindrome1(st));
        System.out.println(isPalindrome2(st));
        System.out.println(isPalindrome3(st));
        System.out.println(isPalindrome4(st));

    }
    // Approach 1: using StringBuilder to reverse and compare -- correct
    private static int isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        if (str.equals(rev)) {
            return 1;
        }
        return 0;
    }
    
    // Approach 2 : Using for loop  -- two pointer -- CORRECT
    private static int isPalindrome1(String str) {
        int start = 0;
        int end = str.length() -1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }

    // Approach 3: Using Recursion 
    private static int isPalindrome2(String str){
        return isPalindromeHelper(str, 0, str.length() - 1);
    }
    private static int isPalindromeHelper(String str, int left, int right) {
        if (left >= right) {
            return 1;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return 0;
        }
        return isPalindromeHelper(str, left + 1, right - 1);
    }

    // Approach 4: Using a Stack
    private static int isPalindrome3(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        if (str.equals(reversed.toString())) {
            return 1;
        }
        return 0;
    }

    // Approach 5: Using char Array
    private static int isPalindrome4(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }

     
}
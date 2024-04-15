package Questions.S1_LoveBabbar.T1_Arrays;

public class Q1_ReverseWord {
    public static void main(String[] args) {
        String str = "Ravi";
        System.out.println(reverseWord2(str));

    }

    //    Approach: convert to array and then perform the action
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

    //    approach: perform directly on string
    public static String reverseWord1(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String ans = sb.toString();
        return ans;
    }

    //    approach : Recursive  -- not for big inputs
    public static String reverseWord2(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverseWord2(s.substring(1)) + s.charAt(0);
    }

}

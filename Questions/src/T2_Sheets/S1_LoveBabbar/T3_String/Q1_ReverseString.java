package T2_Sheets.S1_LoveBabbar.T3_String;

import java.util.Arrays;

public class Q1_ReverseString {
    public static void main(String[] args) {
        char[] s = { 'H', 'E', 'l', 'l', 'o' };
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i <= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}

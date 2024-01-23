package L0_Questions.Questions.Basic;

public class Q4_palindrome {
    public static void main(String[] args) {
        // int num = 12321;
        System.out.println(isPalin("peaek"));
    }

    static boolean isPalin(int num) {
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int last = num % 10;
            reverse = (reverse * 10) + last;
            num /= 10;
        }

        return original == reverse;
    }

    static boolean isPalin(String str) { //to work on this.
        // int length = s.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

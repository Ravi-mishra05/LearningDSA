package DSA.T11_Recursion.Questions1;

public class Q4 {

    public static int reverse(int num) {
//        Iterative approach
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans = (ans * 10) + rem;
            num /= 10;
        }
        return ans;
    }

    public static void reverseRecc0(int num) {
//      Recursive Approach
        if (num <= 0) {
            return;
        }
        System.out.print(num % 10);
        reverseRecc0(num / 10);
    }

    //    Method 1:
    static int sum = 0;

    public static void reverseRecc1(int num) {
        if (num == 0)
            return;

        int rem = num % 10;
        sum = sum * 10 + rem;
        reverseRecc1(num / 10);
    }


    //    method 2
    public static int reverseRecc2(int n) {
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n)
            return n;
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }


    public static void main(String[] args) {
        System.out.println(reverse(345));
        reverseRecc0(3456);
        System.out.println();
        reverseRecc1(34567);
        System.out.println(sum);
        System.out.println(reverseRecc2(345678));
    }
}

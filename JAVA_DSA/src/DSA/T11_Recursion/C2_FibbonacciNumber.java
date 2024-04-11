package DSA.T11_Recursion;

public class C2_FibbonacciNumber {
    public static void main(String[] args) {
        System.out.println(FibonacciNumber(6));
    }

    public static int FibonacciNumber(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return FibonacciNumber(n - 1) + FibonacciNumber(n - 2);
    }
}

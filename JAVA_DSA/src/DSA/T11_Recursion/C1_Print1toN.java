package DSA.T11_Recursion;

public class C1_Print1toN {
    public static void main(String[] args) {
        printnum(1);
    }

    static void printnum(int n) {
        // int start = 0;
        if (n == 5) { // base conditon
            System.out.print(5);
            return;
        }

        System.out.print(n + " "); // body
        printnum(n + 1); // recursive call
    }
}

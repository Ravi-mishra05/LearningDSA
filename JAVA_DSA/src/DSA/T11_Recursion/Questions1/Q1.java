package DSA.T11_Recursion.Questions1;

public class Q1 {
    public static void main(String[] args) {
        printTill1(5);
    }

    static void printTill1(int n) {
        if (n == 0) {
            System.out.println("end");
            return;
        }
        System.out.print(n + " ");
        printTill1(n - 1);
    }

    static void printTillN(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printTillN(n - 1);
        System.out.print(n + " ");
    }
}

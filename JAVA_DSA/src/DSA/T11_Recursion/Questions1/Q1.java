package DSA.T11_Recursion.Questions1;

public class Q1 {
    public static void main(String[] args) {
        printTillN(5);
    }

    static void printTillN(int n) {
        if (n == 0) {
            System.out.println("end");
            return;
        }
        System.out.print(n + " ");
        printTillN(n - 1);
    }
}

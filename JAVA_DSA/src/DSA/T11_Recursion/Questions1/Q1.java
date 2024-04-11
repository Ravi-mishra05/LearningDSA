package T11_Recursion.Questions1;

public class Q1 {
    public static void main(String[] args) {
        printTillN(5);
    }

    static void printTillN(int n) {
        if (n == 0)
            return;
        if (n == 1) {
            System.out.print(n + "  End");
        }
        System.out.print(n + " ");
        printTillN(n - 1);
    }
}

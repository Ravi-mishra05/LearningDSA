package L1_ConditionalsAndLoops;

import java.util.Scanner;

public class C3_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        int count = 2;
        // int i =0;
        while (count <= n) {
            int temp = b;
            b = b+a;
            a = temp;
            count++;
            System.out.print(b + " ");
        }

        sc.close();
    }
}

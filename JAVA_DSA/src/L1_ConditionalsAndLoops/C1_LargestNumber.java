package L1_ConditionalsAndLoops;

import java.util.Scanner;

public class C1_LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // approach 1:
        // int max =0;
        // if (a>b) {
        //     max = a;
        // } else{
        //     max =b;
        // }
        // if (max>c) {
        //     System.out.println(max);
        // } else {
        //     System.out.println(c);
        // }

        // Approach 2:
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

        sc.close();
    }
}

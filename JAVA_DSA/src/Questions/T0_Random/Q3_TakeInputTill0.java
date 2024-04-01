package T0_Random;

import java.util.Scanner;

public class Q3_TakeInputTill0 {
    // Take integer inputs till the user enters 0 and print the sum of all numbers

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        // do {
        // n = sc.nextInt();
        // sum += n;
        // } while (n != 0);

        while (true) {
            num = sc.nextInt();
            sum += num;

            if (num == 0) {
                break;
            }
        }

        System.out.println();
        System.out.println(sum);
        sc.close();
    }
}

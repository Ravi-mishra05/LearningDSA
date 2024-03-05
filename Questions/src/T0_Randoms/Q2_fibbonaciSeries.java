package L0_Questions.Questions.Basic;

import java.util.Scanner;

public class Q2_fibbonaciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int next = 0;
        int count = 0;

        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.print(first + ", ");
            next = first + second;
            first = second;
            second = next;

            count++;
        }
        System.out.println();
        System.out.println(count);

        in.close();
    }
}

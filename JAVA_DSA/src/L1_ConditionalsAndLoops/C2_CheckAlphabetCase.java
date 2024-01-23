package L1_ConditionalsAndLoops;

import java.util.Scanner;

public class C2_CheckAlphabetCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        } else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        } else {
            System.out.println("wrong input");
        }

        sc.close();
    }
}

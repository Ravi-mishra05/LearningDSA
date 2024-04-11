package DSA.T1_ArraysAndArraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class L1_Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // define an arraylist
        ArrayList<Integer> list1 = new ArrayList<>();

        // manually add element in list
        list1.add(5);
        list1.add(10);
        list1.add(15);
        list1.add(20);
        list1.add(25);
        list1.add(30);
        list1.add(35);

        // printing the list
        System.out.println(list1);
        System.out.println(list1.size());

        // remove an element from list
        list1.remove(1);

        for (int i = 0; i < 6; i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        System.out.println(list1.size());

        sc.close();
    }

}

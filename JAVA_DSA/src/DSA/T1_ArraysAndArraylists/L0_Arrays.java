package DSA.T1_ArraysAndArraylists;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class L0_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // define a array
        int[] arr = { 1, 3, 5, 7, 9 };

        System.out.println(Arrays.toString(arr)); // print the array by converting it to string.

        int[] arr2 = new int[5];

        // Input an array
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
        }

        // printing an array - using foreach loop.
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        // return;
        in.close();
        return;
    }
}

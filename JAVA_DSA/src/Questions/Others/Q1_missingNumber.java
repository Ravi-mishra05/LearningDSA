package Questions.Others;

// import java.util.Arrays;

public class Q1_missingNumber {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
        System.out.println(missingNumber(arr, 10));
    }

    public static int missingNumber(int array[], int n) {
        // Your Code Here
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

}

package L0_Questions.luv_babbar_sheet.T1_Arrays;

// https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1

public class Q6_UnionOfTwoArrays {
    public static void main(String[] args) {

    }
    public static int doUnion(int a[], int n, int b[], int m){
        //requires hashmap to solve.
        return 0;
    }

    // time limit exceeded
    public static int doUnion0(int a[], int n, int b[], int m) {
        // Count of elements in the union
        int unionCount = 0;

        // Traverse both arrays and count unique elements in the union
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;

            // Check if the element from array 'a' is already in the union
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                // Include a[i] in the union
                unionCount++;
            }
        }

        for (int i = 0; i < b.length; i++) {
            boolean isDuplicate = false;

            // Check if the element from array 'b' is already in the union
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                // Include b[i] in the union
                unionCount++;
            }
        }

        return unionCount;
    }

    // time limit exceeded
    public static int doUnion1(int a[], int n, int b[], int m) {
        int count = m + n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j])
                    count--;
            }
        }
        return count;
    }
}

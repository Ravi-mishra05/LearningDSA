package DSA.T2_SearchingAlgorithms.S1_LinearSearch;

public class C1_LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 44, 9, 12 };
        System.out.println(linearSearch(arr, 9));
    }

    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == target)) {
                return i;
            }
        }
        return -1;
    }

}

package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.Arrays;

public class Q2_FindMinMaxFromArray {
    /*
     * class Pair
     * {
     * long first, second;
     * public Pair(long first, long second)
     * {
     * this.first = first;
     * this.second = second;
     * }
     * }
     *
     * Java users need to return result in Pair class
     * For Example -> return new Pair(minimum,maximum)
     */
//    static Pair getMinMax(long a[], long n)
//    {
//        //Write your code here
//        long max = Long.MIN_VALUE;
//        long min = Long.MAX_VALUE;
//        for (int i = 0; i < n; i++) {
//            if(a[i] > max) {
//                max = a[i];
//            }
//            if(a[i] < min) {
//                min = a[i];
//            }
//        }
//        return new Pair(min,max);
//    }

    public static void main(String[] args) {
        long[] arr = {3, 2, 1, 56, 10000, 167};
        int[] arr1 = {3, 2, 1, 56, 10000, 167};
        System.out.println(Arrays.toString(maxMin(arr, 6)));
        System.out.println(Arrays.toString(maxMin1(arr1)));
    }

    //Approach 1: iteration
    public static long[] maxMin(long[] a, long n) {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        return new long[]{max, min};
    }

    //    Approach 2: Sorting
    public static int[] maxMin1(int[] a) {
        Arrays.sort(a);
        int min = a[0];
        int max = a[a.length - 1];
        return new int[]{max, min};
    }

    //    Approach 3: Divide and Conquer
    public static int[] maxMin2(int[] a) {
        Arrays.sort(a);
        int min = a[0];
        int max = a[a.length - 1];
        return new int[]{max, min};
    }

    //    Approach 4: Using Java Streams
    public static long[] maxMin3(long[] a, long n) {
        long max = Arrays.stream(a).max().orElse(Long.MIN_VALUE);
        long min = Arrays.stream(a).min().orElse(Long.MAX_VALUE);
        return new long[]{max, min};
    }
}

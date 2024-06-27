package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q12_Merge {
    public static void main(String[] args) {
        long[] arr1 = {1, 3, 5, 7};
        long[] arr2 = {0, 2, 6, 8, 9};
        merge(arr1,arr2,4,5);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void merge(long arr1[], long arr2[], int n, int m) {
        // code here
        ArrayList<Long> list = new ArrayList<>();
        for(long i : arr1){
            list.add(i);
        }
        for(long i : arr2){
            list.add(i);
        }
        Collections.sort(list);
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = list.get(index);
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = list.get(index);
            index++;
        }
    }
}

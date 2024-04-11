package DSA.T3_SortingAlgorithms;

import java.util.Arrays;

public class L4_CycleSort {
    public static void main(String[] args) {
       int [] arr = {2,4,3,1,6,5};
       cycleSort(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int finalposition = arr[i] -1;
            if(i+1 != arr[i]){
                swap(arr, i , finalposition);
            } else {
                i++;
            } 
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

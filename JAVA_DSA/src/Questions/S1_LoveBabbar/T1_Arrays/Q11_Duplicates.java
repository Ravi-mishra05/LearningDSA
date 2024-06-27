package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Q11_Duplicates {
//    Not complete
    public static void main(String[] args) {
        int[] arr = {3, 4, 12, 3, 12, 3, 4, 4, 12, 7, 11, 6, 5};
        System.out.println(duplicates(arr, 13));
        System.out.println(duplicates1(arr, 13));

    }
    private static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap <Integer,Integer> map = new HashMap<>();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i, 0) + 1);
        }

        for (int i : arr) {
            if (map.get(i) > 1 && !list.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }

    //  Time limit exceeded.
    private static ArrayList<Integer> duplicates1(int arr[], int n) {
        // code here
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        for (int i : arr) {
            if (list1.contains(i)) {
                if (!list2.contains(i)) {
                    list2.add(i);
                }
            } else {
                list1.add(i);
            }
        }
        if (list2.isEmpty()) {
            list2.add(-1);
        }
        Collections.sort(list2);
        return list2;
    }

}

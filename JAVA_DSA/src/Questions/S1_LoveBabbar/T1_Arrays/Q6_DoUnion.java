package Questions.S1_LoveBabbar.T1_Arrays;

import java.util.HashMap;

public class Q6_DoUnion {
    public static void main(String[] args) {
        int [] arr = {85, 25, 1, 32, 54, 6};
        int [] arr1 = {85, 2};
//        doUnion(arr,6, arr1,2);
        System.out.println(doUnion(arr,6, arr1,2));
    }
    private static int doUnion(int a[], int n, int b[], int m) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], a[i]);
        }
        for (int i = 0; i < m; i++) {
            map.put(b[i], b[i]);
        }

        return map.size();
    }
}

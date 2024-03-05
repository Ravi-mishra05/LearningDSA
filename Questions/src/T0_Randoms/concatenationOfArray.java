package L0_Questions.others;

import java.util.ArrayList;

public class concatenationOfArray {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        ArrayList <Integer> list = new ArrayList<>();

        for(int i =0; i<arr.length; i++){
            list.add(arr[i]);
        }
        for(int i =0; i<arr.length; i++){
            list.add(arr[i]);
        }
        System.out.println(list);
    }

}

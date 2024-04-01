package T0_Random;

public class searchinrange {
    public static int search(int target, int[] arr, int start, int end){
        // int l = 0;
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                // System.out.println("the number found at index:"+i);
                System.out.println("hello hello");
                return i;
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 9;
        int start = 2;
        int end = 7;
        System.out.println("index = " + search(target, arr, start, end));
    }
}

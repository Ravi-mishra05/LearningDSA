package Questions.S1_LoveBabbar.T1_Arrays;

public class Q34_pallinArray {
    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 115};
        System.out.println(palinArray(arr, 5));
    }

    private static int palinArray(int[] a, int n) {
        //add code here.
        for (int i : a) {
            if (!checkPalin(i)) {
                return 0;
            }
        }
        return 1;
    }

    private static boolean checkPalin(int n) {
        int num = n;
        int last;
        int newNum = 0;
        while(n > 0){
            last = n % 10;
            newNum = newNum * 10 + last;
            n = n/10;
        }
        return newNum == num;
    }
}

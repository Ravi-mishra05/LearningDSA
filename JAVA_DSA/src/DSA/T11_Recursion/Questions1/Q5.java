package DSA.T11_Recursion.Questions1;

public class Q5 {
    public static void main(String[] args) {
        System.out.println(countZeroes(10010));
    }
    public static int countZeroes(int n){
        return helper(n,0);
    }

    private static int helper(int n, int count){
        if (n == 0){
            return count;
        }
        int rem = n %10;
        if(rem == 0){
            return helper(n/10,count+1);
        } else {
            return helper(n/10, count);
        }
    }

}

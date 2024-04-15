package DSA.T11_Recursion.Questions1;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(reverse(345));
        reverseRecc(3456);
    }

//  reverse a number
    public static int reverse(int num){
//        Iterative approach
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans = (ans * 10) + rem;
            num /= 10;
        }
        return ans;
    }


    public static void reverseRecc(int num){
//      Recursive Approach
        if(num <= 0) {
            return;
        }
        System.out.print(num%10);
        reverseRecc(num/10);
    }

}

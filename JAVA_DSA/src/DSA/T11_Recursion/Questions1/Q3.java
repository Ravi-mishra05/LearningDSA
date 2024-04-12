package DSA.T11_Recursion.Questions1;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }
//    sum of digits of a number
    static int sumOfDigits(int n){
//        if(n/10 == 0){
//            return n%10;
//        }
        if (n ==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}

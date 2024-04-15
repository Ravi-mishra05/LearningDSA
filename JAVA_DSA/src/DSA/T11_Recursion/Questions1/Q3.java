package DSA.T11_Recursion.Questions1;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(productOfDigits(1234));
        System.out.println(sumOfDigits(1234));
    }
    static int sumOfDigits(int n){
        if (n ==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
    static int productOfDigits(int n){
        if(n%10 == n){
            return n;
        }

        return n%10 * productOfDigits(n/10);
    }
}

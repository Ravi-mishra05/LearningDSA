package DSA.T11_Recursion.Questions1;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sumOfN(3));
    }
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }

        return  factorial(n-1)*n;
    }

    public static int sumOfN(int n){
        if(n <= 1) return 1;
        return n + sumOfN(n-1);
    }
}

package T1_Dailly_Questions_LC_2024.marchArpil;

public class march13 {
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }

    public static int pivotInteger(int n) {
        int sum = 0;
        int i = n;
        while (i >= 0) {
            sum += i;
            int sumOfNNaturalNumbers = (i * (i + 1)) / 2;
            if (sum == sumOfNNaturalNumbers) {
                return i;
            }
            i--;
        }
        return -1;
    }
}

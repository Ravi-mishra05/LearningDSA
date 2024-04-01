package T1_Dailly_Questions_LC_2024.M4_April;

public class April1 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/length-of-last-word/submissions/1220362596/?envType=daily-question&envId=2024-04-01
        String str = "Hello world ";
        System.out.println(lengthOfLastWord(str));

    }

    public static int lengthOfLastWord(String s) {
        String[] a = s.split(" ");
        String x = a[a.length - 1];
        return x.length();
    }
}

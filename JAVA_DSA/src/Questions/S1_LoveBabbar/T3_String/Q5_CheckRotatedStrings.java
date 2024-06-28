package Questions.S1_LoveBabbar.T3_String;

public class Q5_CheckRotatedStrings {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        System.out.println(areRotations(s1, s2));
        System.out.println(areRotations1(s1, s2));
    }

    private static boolean areRotations(String s1, String s2 ){
        // return s1.equals(s2);
        if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.equals(s2)) {
            return true;
        }

        String temp = s1 + s1;
        if(temp.contains(s2)){      //-- time limit exceeded
            return true;
        }
        return false;
    }


    // Approac 2
    private static boolean areRotations1(String s1, String s2 )
    {
        // Your code here
        String str = s1 + s1;
        int i=0; int j=0;
        while(i<str.length() && j<s2.length()){
            if(str.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        
        return j==s2.length();
    }
}

package Questions.S1_LoveBabbar.T3_String;

import java.util.HashMap;

public class Q3_FindDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(duplicates(str));
    }

    private static String duplicates(String str){
        HashMap <Character , Character> map = new HashMap<>();
        String ans = "";
        StringBuilder sb = new StringBuilder(ans);
        for(int i = 0; i< str.length(); i++){
            if (!map.containsValue(str.charAt(i))) {
                map.put(str.charAt(i), str.charAt(i));
            } else{
                sb.append(str.charAt(i));
                // ans = ans + str.charAt(i);  -- using concatenation.
            }
        }

        return sb.toString();
    }
}

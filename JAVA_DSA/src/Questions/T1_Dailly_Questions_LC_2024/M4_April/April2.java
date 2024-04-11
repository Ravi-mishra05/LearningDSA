package T1_Dailly_Questions_LC_2024.M4_April;

import java.util.HashMap;

public class April2 {
    // https://leetcode.com/problems/isomorphic-strings/description/?envType=daily-question&envId=2024-04-02
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) || map.containsValue(t.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }

}

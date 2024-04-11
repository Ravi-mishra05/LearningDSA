package DSA.T9_HashMapAndHashTable;

import java.util.HashMap;

public class C1_HashMap {
    public static void main(String[] args) {
        // Integer num = 9998996;
        // String name = "Ravi";
        // int code = num.hashCode();
        // int code1 = name.hashCode();
        // System.out.println(code);
        // System.out.println(code1);

        hashMap();
    }

    public static void hashMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map);
    }

}
package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by никита on 23.04.14.
 */
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(5, "a");
        linkedHashMap.put(4, "b");
        linkedHashMap.put(3, "c");
        linkedHashMap.put(2, "d");
        linkedHashMap.put(1, "e");
        System.out.println("linkedHashMap");
        System.out.println(linkedHashMap);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "a");
        hashMap.put(4, "b");
        hashMap.put(3, "c");
        hashMap.put(2, "d");
        hashMap.put(1, "e");
        System.out.println("hashMap");
        System.out.println(hashMap);

        System.
    }
}

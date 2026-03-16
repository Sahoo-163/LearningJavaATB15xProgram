package EX_29_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program_MAP_001 {
    public static void main(String[] args) {
        Map m1 = new HashMap<>();
        Map m2 = new LinkedHashMap();
        Map m3 = new TreeMap();

        Map< String, Integer> m5 = new HashMap<>(); // hashmap no guuarewntee order
        m5.put("Chinmay",90);
        m5.put("Sahoo", 20);
        m5.put("Umesh", 40);
        m5.put("Pihu", 80);
        System.out.println(m5);

        System.out.println(m5.get("Chinmay"));
        System.out.println(m5.get("Sahoo"));
        System.out.println(m5.getOrDefault("Rama", 0));
        System.out.println(m5.put("Sahoo", 77));
        System.out.println(m5);
        System.out.println(m5.put("Honna", 66));
        System.out.println(m5);
        System.out.println(m5.containsKey("Sahoo"));
        System.out.println(m5.containsKey("Ops"));
        System.out.println(m5.containsValue(77));
        System.out.println(m5.size());

        System.out.println(m5.remove("Chinmay"));
        System.out.println(m5);
    }
}

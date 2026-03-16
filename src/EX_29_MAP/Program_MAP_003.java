package EX_29_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program_MAP_003 {
    public static void main(String[] args) {
        Map< String , String> m1 = new HashMap<>();
        m1.put("Name", "Chinmay");
        m1.put("Age", "90");
        m1.put("Phone", "8276123");
        System.out.println(m1);

        Map < String, Integer> m2 = new LinkedHashMap<>();
        m2.put("Name", 90);
        m2.put("Roll", 903);
        m2.put("Stpigen", 900000);
        System.out.println(m2);

        Map < String, Float> m3 = new TreeMap<>();
        m3.put("dssad", 90.09F);
        m3.put("Aroma", 9.9F);
        m3.put("Bomma", 0.0F);
        System.out.println(m3);





    }
}

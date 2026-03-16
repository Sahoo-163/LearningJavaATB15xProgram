package EX_29_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program_MAP_004 {
    public static void main(String[] args) {
        Map<String, Object > m1 = new HashMap<>();
        m1.put("Dome", 726134712);
        m1.put("Name", "Sahoo");
        m1.put("House", 90.09);
        m1.put("Addres", 90.0028828);
        System.out.println(m1);

        Map<Integer,Object> m2 = new LinkedHashMap<>();
        m2.put(900, "String vALUES");
        m2.put(0, 123123);
        m2.put((int) 0.10, "dfsa");
        m2.put(90, "09.90");
        System.out.println(m2);

        Map<Integer, Object> m3 = new TreeMap<>();
        m3.put(878123, "Name");
        m3.put(02,"Sahoo");
        m3.put(90002,"opp");
        m3.put(892719831, " Phone no");
        System.out.println(m3);



    }
}

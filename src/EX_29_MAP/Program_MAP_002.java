package EX_29_MAP;

import java.util.*;
import java.util.Map;

public class Program_MAP_002 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Panesh", "Age");
        m1.put("roll", 90);
        m1.put("Mhone", 981738913);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("Name", "Jannia");
        m2.put("Yam", 87982731);
        m2.put("Ophone", 90.09);
        System.out.println(m2);

        Map m3 = new TreeMap();
        m3.put("opsdbnas", 90);
        m3.put("House*11", "8726218");
        m3.put("pHONE", 880.111);
        System.out.println(m3);



    }
}

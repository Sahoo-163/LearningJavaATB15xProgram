package EX_29_MAP;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Program_MAP_006 {
    public static void main(String[] args) {
        Hashtable <Integer, String> map = new Hashtable<>();
        map.put(90, " gom");
        map.put(30, "sedan");
        map.put(44, "Sahoo");
        map.put(22, "Chinmay");
      //  map.put(null,"pramod"); --> Null cannot be invoked in Hashtable
        System.out.println(map);

        Map< Integer, String> map2 = new HashMap<>();
        map2.put(90, null);
        map2.put(11, "RAMU");
        map2.put(66, " SHAM");
        map2.put(00,"Hoen");
        map2.put(null," 77");
        System.out.println(map2);
    }
}

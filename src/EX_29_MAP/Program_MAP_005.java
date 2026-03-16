package EX_29_MAP;

import java.util.HashMap;
import java.util.Map;

public class Program_MAP_005 {
    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap<>();
        map.put("one", 10);
        map.put("three", 40);
        map.put("two", 22);
        map.put("four", 44);
        System.out.println(map);

        for(Map.Entry<String, Integer> item : map.entrySet()){
            System.out.println(item.getKey()+" -->"+ item.getValue());
        }
    }
}

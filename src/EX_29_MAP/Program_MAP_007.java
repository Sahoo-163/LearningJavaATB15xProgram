package EX_29_MAP;

import java.util.HashMap;
import java.util.Map;

public class Program_MAP_007 {
    public static void main(String[] args) {
        Map <String, String> maps = new HashMap<>();
        maps.put("preprod", "https://preprod.com");
        maps.put("staging", "https://staging.com");
        maps.put("uat", "https://uat.com");
        System.out.println(maps);

        Map < String, String> Credentials = new HashMap<>();
        Credentials.put("ussr 243", " password");
        Credentials.put("user 112", " password01");
        Credentials.put("user 220", "Password02");
        Credentials.put("null","200");
        System.out.println(Credentials);

    }
}

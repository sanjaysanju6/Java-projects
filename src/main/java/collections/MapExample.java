package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("myName", "Sanjay");
        map.put("actor", "PK");
        map.put("cricketer", "Rohit");

        Set<String> keys = map.keySet();
        for(String key : keys)
        {
            System.out.println(key +  " "+ map.get(key));
        }
            System.out.println(map);

    }
}

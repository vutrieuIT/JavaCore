package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        // init map
        Map map = new HashMap();
        // add elements to map
        map.put(1, "Java");
        map.put(3, "C++");
        map.put(2, "PHP");
        map.put(4, "Python");
        // show Map
        Set set = map.keySet();
        for (Object key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }
}

package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

// dung Iterator duyet HashMap
public class HashMapEx3 {
    public static void main(String args[]) {
        // khoi tao map
        HashMap<String, String> map = new HashMap<String, String>();
        // them cac phan tu vao map
        map.put("J", "Java");
        map.put("C", "C++");
        map.put("P", "PHP");
        map.put("Py", "Python");
        // show hashMap
        Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(map.get(itr.next()));
        }
    }
}

package properties;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

// lấy ra các thuộc tính của hệ thống
public class PropertiesEx1 {
    public static void main(String[] args) throws Exception {
        // get system properties
        Properties properties = System.getProperties();
        Set set = properties.entrySet();
        // show system properties
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}

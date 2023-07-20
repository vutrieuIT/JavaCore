package properties;


import java.io.FileReader;
import java.util.Properties;

// đọc thông tin từ file db.properties
public class PropertiesEx {
    public static void main(String[] args) throws Exception {
        // create reader object
        FileReader reader = new FileReader("db.properties");
        // crate properties object
        Properties properties = new Properties();
        properties.load(reader);
        // show file info
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }
}

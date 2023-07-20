package properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

// lớp Properties tạo file .properties
public class PropertiesEx2 {
    public static void main(String[] args) throws IOException {
        // create properties object
        Properties properties = new Properties();

        // add property in to properties object
        properties.setProperty("user", "admin");
        properties.setProperty("password", "admin123");

        // write properties to file
        properties.store(new FileWriter("info.properties"), "user info");
    }
}

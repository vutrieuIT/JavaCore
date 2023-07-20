package resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleEx {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("greeting", new Locale("vn"));
        System.out.printf("lời chào trong tiếng Việt: %s\n", rb.getString("hello"));

        rb = ResourceBundle.getBundle("greeting", new Locale("en"));
        System.out.printf("lời chào trong tiếng Anh: %s\n", rb.getString("hello"));
    }
}


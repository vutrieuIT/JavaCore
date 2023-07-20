package java_io.fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

// ghi chuỗi vào file
public class FileOutputStreamEx1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("src/java_io/fileoutputstream/FileOutputStream.txt");
            String s = "hello world";
            byte[] b = s.getBytes();
            fo.write(b);
            System.out.println("success...");
        } catch (Exception e){
            System.out.println(e);
        } finally {
            fo.close();
        }
    }
}

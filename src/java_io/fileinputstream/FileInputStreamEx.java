package java_io.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

// đọc 1 ký tự từ file
public class FileInputStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/java_io/fileinputstream/FileInputStream.txt");
            int i = fin.read();
            System.out.println((char) i);

            fin.close();
        } catch (Exception e){
            System.out.println(e);
        } finally {
            fin.close();
        }
    }
}

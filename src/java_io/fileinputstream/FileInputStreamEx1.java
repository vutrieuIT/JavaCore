package java_io.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

// đọc toàn bộ file
public class FileInputStreamEx1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/java_io/fileinputstream/FileInputStream.txt");
            int i = 0;
            while ((i = fin.read()) != -1){
                System.out.print((char) i);
            }
        } catch (Exception e){
            System.out.println(e);
        } finally {
            fin.close();
        }
    }
}

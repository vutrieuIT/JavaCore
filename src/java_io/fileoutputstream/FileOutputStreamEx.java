package java_io.fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

// ghi 1 byte vào file
public class FileOutputStreamEx {
    public static void main(String args[]) throws IOException {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("src/java_io/fileoutputstream/FileOutputStream.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // close file output stream
            fout.close();
        }
    }
}

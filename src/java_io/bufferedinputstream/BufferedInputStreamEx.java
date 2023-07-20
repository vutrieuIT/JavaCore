package java_io.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        BufferedInputStream bin = null;

        try {
            fin = new FileInputStream("src/java_io/bufferedinputstream/BufferedInputStream.txt");
            bin = new BufferedInputStream(fin);
            int i;
            while ((i= bin.read()) != -1){
                System.out.print((char) i);
            }
        } catch (Exception e){
            System.out.println(e);
        } finally {
            bin.close();
            fin.close();
        }
    }
}

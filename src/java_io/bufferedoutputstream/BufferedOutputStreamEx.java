package java_io.bufferedoutputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
    public static void main(String args[]) throws IOException {
        FileOutputStream fout = null;
        BufferedOutputStream bout = null;

        try {
            fout = new FileOutputStream("src/java_io/bufferedoutputstream/BufferedOutputStream.txt");
            bout = new BufferedOutputStream(fout);
            String s = "Buffered output stream.";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            bout.close();
            fout.close();
        }

        System.out.println("success!");
    }
}

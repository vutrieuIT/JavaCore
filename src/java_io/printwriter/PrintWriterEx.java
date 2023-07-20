package java_io.printwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {
    public static void main(String[] args) throws FileNotFoundException {
        // ghi dữ liệu lên console
        PrintWriter writer = new PrintWriter(System.out);
        writer.println("Xin chào");
        writer.flush();
        writer.close();

        // ghi dữ liệu vào file dùng auto flush
        PrintWriter writer1 = null;

        writer1 = new PrintWriter(new File("src/java_io/printwriter/PrintWriterEx.txt"));

        // mở autoflush
        writer1.flush();

        writer1.println("Java, C, C#, Python, PHP, Javascript");
        writer1.close();
    }
}

package java_io;

import java.io.IOException;

public class JavaIOEx {
    public static void main(String[] args) throws IOException {

        int i = System.in.read();
        System.out.println( (char) i);

        System.out.println("đây là câu in thông thường");
        System.err.println("đây là câu in lỗi");
    }
}

package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOEceptionEx {
    public static void main(String[] args) {
        try {
            funcIOException("src/exception/IOExceptionEx.txt");
        } catch (IOException e){
            System.out.println("have an IOException");
        }

    }

    public static void funcIOException(String path) throws IOException {
        File file = new File(path);
        FileInputStream fin = new FileInputStream(file);
        int i = fin.read();
        System.out.println(i);
    }
}

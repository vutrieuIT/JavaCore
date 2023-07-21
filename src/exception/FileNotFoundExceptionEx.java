package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileNotFoundExceptionEx {
    public static void main(String[] args) {
        try {
            readFailingFile("src/exception/FileNotFoundExceptionEx.txt");
        } catch (FileNotFoundException e){
            System.out.println("have a FileNotFoundException");
        }
    }

    public static void readFailingFile(String path) throws FileNotFoundException {
        File file = new File(path);
        FileInputStream fin = new FileInputStream(file);
        if (fin != null){
            System.out.println("file is founded");
        }
    }
}

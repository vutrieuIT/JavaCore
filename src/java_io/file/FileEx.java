package java_io.file;

import java.io.File;
import java.io.IOException;

// tạo một tệp mới
public class FileEx {
    public static void main(String[] args) {
        try {
            File file = new File("src/java_io/file/file.txt");
            if (file.createNewFile()){
                System.out.println("tạo tệp");
            } else {
                System.out.println("tệp đã có từ trước");
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}

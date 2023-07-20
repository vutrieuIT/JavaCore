package java_io.file;

import java.io.File;

// xóa file
public class FileEx2 {
    public static void main(String[] args) {
        File file = new File("src/java_io/file/file.txt");
        if (file.exists()){
            file.delete();
            System.out.println("đã xóa file");
        } else {
            System.out.println("file không tồn tại");
        }
    }
}

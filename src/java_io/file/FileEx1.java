package java_io.file;

import java.io.File;

//  kiểm tra thông tin
public class FileEx1 {
    public static void main(String[] args) {
        File file = new File("src/java_io/file/file.txt");
        if (file.exists()) {
            System.out.println("Tên tệp: " + file.getName());
            System.out.println("Đường dẫn tuyệt đối: " + file.getAbsolutePath());
            System.out.println("Tệp có thể đọc được: " + file.canRead());
            System.out.println("Tệp có thể ghi được: " + file.canWrite());
            System.out.println("Kích thước tệp: " + file.length() + " byte");
            System.out.println("Thời gian sửa đổi lần cuối: " + file.lastModified());
            System.out.println("Đây là một tệp: " + file.isFile());
            System.out.println("Đây là một thư mục: " + file.isDirectory());
        } else {
            System.out.println("Tệp không tồn tại.");
        }
    }
}

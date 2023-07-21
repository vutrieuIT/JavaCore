package exception;

import java.io.UnsupportedEncodingException;

// sử dụng String để chuyển đổi một mảng byte sang chuỗi sử dụng một bộ giải mã không hợp lệ
public class UnsupportedEncodingExceptionEx {
    public static void main(String[] args) {
        byte[] byteArray = { 72, 101, 108, 108, 111 }; // Mảng byte chứa chuỗi "Hello"

        try {
            String str = new String(byteArray, "UTF-7"); // Thử tạo chuỗi từ mảng byte với bộ giải mã không hợp lệ
            System.out.println(str);
        } catch (UnsupportedEncodingException e) {
            System.err.println("Unsupported Encoding: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

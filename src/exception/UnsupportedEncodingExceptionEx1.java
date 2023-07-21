package exception;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

// sử dụng InputStreamReader để chuyển đổi một mảng byte sang chuỗi
// sử dụng một bộ giải mã không hợp lệ
public class UnsupportedEncodingExceptionEx1 {
    public static void main(String[] args) {
        byte[] byteArray = {72, 101, 108, 108, 111}; // Mảng byte chứa chuỗi "Hello"

        try {
            // Cố gắng đọc mảng byte sử dụng bộ giải mã không hợp lệ "InvalidEncoding"
            InputStreamReader reader = new InputStreamReader(new ByteArrayInputStream(byteArray), "UTF-7");

            // Đọc dữ liệu và in ra kết quả
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (UnsupportedEncodingException e) {
            System.err.println("Unsupported Encoding: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

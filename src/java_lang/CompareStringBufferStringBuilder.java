package java_lang;

import java.lang.reflect.Method;

public class CompareStringBufferStringBuilder {
    public static void main(String[] args) {
        int n = 100000;
        long startTime, endTime;

        // Sử dụng StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            stringBuffer.append("Hello");
        }
        endTime = System.currentTimeMillis();
        long stringBufferTime = endTime - startTime;

        // Sử dụng StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("Hello");
        }
        endTime = System.currentTimeMillis();
        long stringBuilderTime = endTime - startTime;

        System.out.println("Thời gian thực hiện với StringBuffer: " + stringBufferTime + "ms");
        System.out.println("Thời gian thực hiện với StringBuilder: " + stringBuilderTime + "ms");
    }
}


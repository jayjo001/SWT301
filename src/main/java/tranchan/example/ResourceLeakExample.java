package tranchan.example;

import java.io.*;

public class ResourceLeakExample {

    public static void readFile(String fileName) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Không đóng fis → gây rò rỉ tài nguyên
    }
}

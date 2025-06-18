package tranchan.example;

import java.io.*;

public class PathTraversalExample {

    public static void readFile(String fileName) {
        File file = new File("C:/data/" + fileName); // Không kiểm tra file path (có thể bị tấn công Path Traversal)
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // In nội dung file ra console (không an toàn)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

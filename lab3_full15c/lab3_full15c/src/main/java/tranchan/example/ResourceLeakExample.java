package tranchan.example;

import java.io.*;

public class ResourceLeakExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/test/resources/example.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        // Forgetting to close the resources causes leaks
    }
}

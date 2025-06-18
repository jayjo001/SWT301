package tranchan.example;

import org.junit.jupiter.api.Test;

public class ResourceLeakExampleTest {

    @Test
    public void testReadFile() {
        ResourceLeakExample.readFile("example.txt");
    }
}

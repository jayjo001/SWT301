package tranchan.example;

import org.junit.jupiter.api.Test;

public class PathTraversalExampleTest {

    @Test
    public void testReadFileWithNormalPath() {
        PathTraversalExample.readFile("example.txt");
    }

    @Test
    public void testReadFileWithTraversalPath() {
        PathTraversalExample.readFile("..\\..\\windows\\system.ini");
    }
}

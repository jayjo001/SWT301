package tranchan.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PathTraversalExampleTest {

    @Test
    void testReadFileWithTraversalPath() {
        assertThrows(IOException.class, () -> {
            PathTraversalExample.readFile("../../windows/system.ini");
        });
    }

    @Test
    void testReadFileWithNormalPath() {
        assertThrows(IOException.class, () -> {
            PathTraversalExample.readFile("src/test/resources/example.txt");
        });
    }
}

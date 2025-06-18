package tranchan.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ResourceLeakExampleTest {

    @Test
    void testMainRunsWithoutException() {
        assertDoesNotThrow(() -> ResourceLeakExample.main(null));
    }
}

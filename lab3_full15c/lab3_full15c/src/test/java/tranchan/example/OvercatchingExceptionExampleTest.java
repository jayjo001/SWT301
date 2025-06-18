package tranchan.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class OvercatchingExceptionExampleTest {

    @Test
    void testMainRunsWithoutException() {
        assertDoesNotThrow(() -> OvercatchingExceptionExample.main(null));
    }
}

package tranchan.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class CatchGenericExceptionExampleTest {

    @Test
    void testDivisionHandling() {
        assertDoesNotThrow(() -> CatchGenericExceptionExample.main(null));
    }
}

package tranchan.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class NullPointerExampleTest {

    @Test
    void testNullPointerExceptionThrown() {
        assertThrows(NullPointerException.class, () -> NullPointerExample.main(null));
    }
}

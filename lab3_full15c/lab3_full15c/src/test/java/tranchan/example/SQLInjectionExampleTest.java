package tranchan.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class SQLInjectionExampleTest {

    @Test
    void testLoginSimulation() {
        assertDoesNotThrow(() -> SQLInjectionExample.main(null));
    }
}

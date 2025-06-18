package tranchan.example;

import org.junit.jupiter.api.Test;

class UnreachableCodeExampleTest {

    @Test
    void testMain() {
        // main method just returns, nothing to assert
        UnreachableCodeExample.main(null);
    }
}

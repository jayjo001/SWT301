package tranchan.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class TightCouplingExampleTest {

    @Test
    void testStartCar() {
        TightCouplingExample car = new TightCouplingExample();
        assertDoesNotThrow(car::startCar);
    }
}

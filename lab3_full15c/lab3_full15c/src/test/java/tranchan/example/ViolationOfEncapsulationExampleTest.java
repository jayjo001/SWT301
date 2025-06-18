package tranchan.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViolationOfEncapsulationExampleTest {

    @Test
    void testNameAssignment() {
        ViolationOfEncapsulationExample obj = new ViolationOfEncapsulationExample();
        obj.name = "Test";
        assertEquals("Test", obj.name);
    }
}

package tranchan.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InterfaceFieldModificationExampleTest {

    @Test
    void testFieldModification() {
        InterfaceFieldModificationExample obj = new InterfaceFieldModificationExample();
        assertEquals(100, obj.VALUE); // giá trị bị thay đổi
    }
}

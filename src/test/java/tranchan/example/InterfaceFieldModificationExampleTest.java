package tranchan.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterfaceFieldModificationExampleTest {

    @Test
    public void testConstantValue() {
        // Kiểm tra xem hằng số không thay đổi
        assertEquals(100, Constants.MAX_USERS);
    }
}

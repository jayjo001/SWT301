package tranchan.example;

import org.junit.jupiter.api.Test;

public class MissingOverrideAnnotationExampleTest {

    @Test
    public void testDisplayOutput() {
        Base obj = new MissingOverrideAnnotationExample();
        obj.display();
    }
}

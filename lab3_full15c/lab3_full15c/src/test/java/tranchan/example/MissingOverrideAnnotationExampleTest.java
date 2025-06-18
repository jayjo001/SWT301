package tranchan.example;

import org.junit.jupiter.api.Test;

class MissingOverrideAnnotationExampleTest {

    @Test
    void testShowMessage() {
        MissingOverrideAnnotationExample obj = new MissingOverrideAnnotationExample();
        obj.showMessage();
    }
}

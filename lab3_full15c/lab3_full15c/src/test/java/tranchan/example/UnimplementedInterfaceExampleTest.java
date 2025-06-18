package tranchan.example;

import org.junit.jupiter.api.Test;

class UnimplementedInterfaceExampleTest {

    @Test
    void testCallOnlyImplementedMethod() {
        UnimplementedInterfaceExample obj = new UnimplementedInterfaceExample();
        obj.methodA(); // methodB vẫn chưa được implement
    }
}

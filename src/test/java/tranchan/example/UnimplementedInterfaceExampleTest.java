package tranchan.example;

import org.junit.jupiter.api.Test;

public class UnimplementedInterfaceExampleTest {

    @Test
    public void testInterfaceImplementation() {
        MyInterface obj = new UnimplementedInterfaceExample();
        obj.doSomething();
    }
}

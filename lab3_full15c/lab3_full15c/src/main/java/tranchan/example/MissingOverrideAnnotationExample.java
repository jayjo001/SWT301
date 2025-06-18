package tranchan.example;

class Base {
    public void greet() {
        System.out.println("Hello from base");
    }
}

public class MissingOverrideAnnotationExample extends Base {
    public void greet() {  // should add @Override
        System.out.println("Hello from child");
    }
}

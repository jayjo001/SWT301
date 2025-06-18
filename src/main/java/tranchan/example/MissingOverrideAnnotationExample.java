package tranchan.example;

class Base {
    void display() {
        System.out.println("Display in Base");
    }
}

public class MissingOverrideAnnotationExample extends Base {
    // ⚠️ Không có @Override
    void display() {
        System.out.println("Display in Child");
    }
}

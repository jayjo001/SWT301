package tranchan.example;

interface SampleInterface {
    void methodA();
    void methodB();
}

public class IncompleteInterfaceImplementationExample implements SampleInterface {
    public void methodA() {
        System.out.println("Method A implemented");
    }
    // forgot to implement methodB()
}

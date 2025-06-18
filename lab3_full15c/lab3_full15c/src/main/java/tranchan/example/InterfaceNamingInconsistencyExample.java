package tranchan.example;

interface service {
    void execute();
}

public class InterfaceNamingInconsistencyExample implements service {
    public void execute() {
        System.out.println("Executing service");
    }
}

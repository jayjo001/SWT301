package tranchan.example;

interface Config {
    int TIMEOUT = 1000;
}

public class InterfaceFieldModificationExample implements Config {
    public void updateTimeout() {
        // Illegal attempt to change final variable
        // TIMEOUT = 500;
    }
}

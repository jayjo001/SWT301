package tranchan.example;

class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

public class TightCouplingExample {
    private Engine engine = new Engine();

    public void startCar() {
        engine.start(); // tightly coupled with Engine class
    }

    public static void main(String[] args) {
        TightCouplingExample car = new TightCouplingExample();
        car.startCar();
    }
}

package tranchan.example;

public class ViolationOfEncapsulationExample {
    public String name;

    public static void main(String[] args) {
        ViolationOfEncapsulationExample obj = new ViolationOfEncapsulationExample();
        obj.name = "Test"; // directly accessing field instead of using getter/setter
        System.out.println("Name: " + obj.name);
    }
}

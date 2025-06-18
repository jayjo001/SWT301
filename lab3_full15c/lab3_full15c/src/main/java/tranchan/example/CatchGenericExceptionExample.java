package tranchan.example;

public class CatchGenericExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }
    }
}

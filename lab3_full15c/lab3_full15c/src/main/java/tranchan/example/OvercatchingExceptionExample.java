package tranchan.example;

public class OvercatchingExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            System.out.println(numbers[10]);
        } catch (Exception e) {
            // Overcatching: catching generic Exception instead of specific IndexOutOfBoundsException
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

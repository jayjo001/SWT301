package tranchan.example;

public class OvercatchingExceptionExample {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); //
        } catch (Throwable t) { //
            System.out.println("Có lỗi xảy ra: " + t.getMessage());
        }
    }
}

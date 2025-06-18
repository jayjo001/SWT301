package tranchan.example;

public class CatchGenericExceptionExample {

    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}

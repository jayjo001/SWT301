package tranchan.example;

public class HardcodedCredentialsExample {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123"; // Hardcoded password

    public static void main(String[] args) {
        if (authenticate(USERNAME, PASSWORD)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }

    public static boolean authenticate(String username, String password) {
        // Insecure credential comparison
        return "admin".equals(username) && "password123".equals(password);
    }
}

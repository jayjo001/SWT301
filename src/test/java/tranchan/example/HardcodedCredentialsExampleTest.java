package tranchan.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HardcodedCredentialsExampleTest {

    @Test
    public void testCorrectCredentials() {
        System.setProperty("APP_USERNAME", "admin");
        System.setProperty("APP_PASSWORD", "password123");

        boolean result = HardcodedCredentialsExample.authenticate("admin", "password123");
        assertTrue(result, "Login should succeed with correct credentials");
    }

    @Test
    public void testWrongUsername() {
        System.setProperty("APP_USERNAME", "admin");
        System.setProperty("APP_PASSWORD", "password123");

        boolean result = HardcodedCredentialsExample.authenticate("user", "password123");
        assertFalse(result, "Login should fail with wrong username");
    }

    @Test
    public void testWrongPassword() {
        System.setProperty("APP_USERNAME", "admin");
        System.setProperty("APP_PASSWORD", "password123");

        boolean result = HardcodedCredentialsExample.authenticate("admin", "wrongpass");
        assertFalse(result, "Login should fail with wrong password");
    }
}

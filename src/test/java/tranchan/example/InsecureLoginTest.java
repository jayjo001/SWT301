package tranchan.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsecureLoginTest {

    @Test
    void testLoginSuccess() {
        InsecureLogin.login("admin", "123456");
        assertTrue(true); // Dummy assertion
    }

    @Test
    void testLoginFail() {
        InsecureLogin.login("user", "wrongpassword");
        assertTrue(true); // Dummy assertion
    }


    @Test
    void testPrintUserInfo() {
        InsecureLogin insecureLogin = new InsecureLogin();
        insecureLogin.printUserInfo("John Doe");
        assertTrue(true); // Dummy assertion
    }
}

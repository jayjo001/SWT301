package tranchan.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {

    private AccountService accountService;

    @BeforeEach
    void setUp() {
        accountService = new AccountService();
    }

    @ParameterizedTest(name = "Test {index} => username={0}, password={1}, email={2}, expected={3}")
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
    @DisplayName("Parameterized Test - Register account from CSV")
    void testRegisterAccount(String username, String password, String email, boolean expected) {
        boolean result = accountService.registerAccount(username, password, email);
        assertEquals(expected, result);
    }

    @Test
    void testValidEmail() {
        assertTrue(accountService.isValidEmail("abc@mail.com"));
    }

    @Test
    void testInvalidEmail() {
        assertFalse(accountService.isValidEmail("wrongemail"));
    }

    @Test
    void testNullEmail() {
        assertFalse(accountService.isValidEmail(null));
    }
}
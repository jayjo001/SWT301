package tranchan.example;

import org.junit.jupiter.api.Test;

public class SQLInjectionExampleTest {

    @Test
    public void testNormalLogin() {
        SQLInjectionExample.login("admin", "123456");
    }

    @Test
    public void testSQLInjection() {
        // Nếu hệ thống không an toàn, câu lệnh này có thể qua mặt bảo mật
        SQLInjectionExample.login("' OR '1'='1", "' OR '1'='1");
    }
}

package tranchan.example;

import java.sql.*;

public class SQLInjectionExample {
    public void login(String username, String password) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "123456");
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                System.out.println("Login successful");
            } else {
                System.out.println("Login failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

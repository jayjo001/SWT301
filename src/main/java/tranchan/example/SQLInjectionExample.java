package tranchan.example;

import java.sql.*;

public class SQLInjectionExample {

    public static void login(String username, String password) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "password";

        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();
            // LỖI: Gộp trực tiếp input vào câu truy vấn
            String query = "SELECT * FROM users WHERE username = '" + username +
                    "' AND password = '" + password + "'";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                System.out.println("Login successful");
            } else {
                System.out.println("Login failed");
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

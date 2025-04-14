package come.training.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/userdb";
        String user = "admin";  // أو postgres إذا كنت تستخدمه
        String password = "1234";

        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}

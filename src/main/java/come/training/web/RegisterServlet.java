package come.training.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.mindrot.jbcrypt.BCrypt; // Importing BCrypt

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Database connection details
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "pass123";   

    public RegisterServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hashing the password using BCrypt
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        PreparedStatement stmt = null;
        Connection conn = null;

        try {
            // Load PostgreSQL driver
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Check if the username already exists
            String checkSql = "SELECT * FROM users1 WHERE username = ?";
            stmt = conn.prepareStatement(checkSql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // If username exists, prompt user to choose another one
                out.println("<h2>Username already exists. Please choose another one.</h2>");
            } else {
                // Insert the user with the hashed password
                String sql = "INSERT INTO users1 (username, password) VALUES (?, ?)";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, username);
                stmt.setString(2, hashedPassword); // Storing the hashed password

                int rows = stmt.executeUpdate();
                if (rows > 0) {
                    out.println("<h2>Registration Successful!</h2>");
                    out.println("<a href='login.jsp'>Go to Login Page</a>");
                } else {
                    out.println("<h2>Registration failed. Please try again later.</h2>");
                }
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h2>Error: " + e.getMessage() + "</h2>");
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

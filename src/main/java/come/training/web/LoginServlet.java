package come.training.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.mindrot.jbcrypt.BCrypt; // استيراد BCrypt
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "pass123";   

    public LoginServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());


        response.setContentType("text/html");
        PreparedStatement stmt= null;
        Connection conn = null;
        try {
            // تحميل Driver
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            String sql = "SELECT * FROM users1 WHERE username = ? AND password= ?";
             stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            ResultSet rs = stmt.executeQuery();

            if (rs.isBeforeFirst()) {
                // استرجاع كلمة المرور المشفرة من قاعدة البيانات
               
                    request.setAttribute("user", username);
                    RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
                    rd.forward(request, response);
                }
            else {
                    RequestDispatcher rd = request.getRequestDispatcher("failure.jsp");
                    rd.forward(request, response);
                }
            

           
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
        	 try {
				stmt.close();
				 conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
        }
    }
}

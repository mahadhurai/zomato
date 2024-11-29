package pkg1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginSt", urlPatterns = {"/login"})
public class LoginSt extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        String name, pwd;
        name = req.getParameter("iname");
        pwd = req.getParameter("ipwd");
        try {
            if (pwd.equals("1234")) {
                Cookie c1 = new Cookie("name", name);
                Cookie c2 = new Cookie("pwd", pwd);
                res.addCookie(c1);
                res.addCookie(c2);
                RequestDispatcher rdis = req.getRequestDispatcher("./index.html");
                rdis.include(req, res);
                out.println("<script>alert('Successfully Logged')</script>");
            }
            else{
                RequestDispatcher rdis = req.getRequestDispatcher("./index.html");
                rdis.include(req, res);
                out.println("<script>alert('Wrong or invalid password')</script>");
            }
        } catch (Exception ex) {
            out.println("<script>alert('" + ex + "')</script>");
        }
    }
}

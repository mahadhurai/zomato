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

@WebServlet(name = "SignSt", urlPatterns = {"/signup"})
public class SignSt extends HttpServlet {

    public ResultSet r;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html;charset=UTF-8");
        String name, pwd;
        name = req.getParameter("uname");
        pwd = req.getParameter("upwd");

        try {
//            Cookie c1 = new Cookie("name", name);
//            Cookie c2 = new Cookie("pwd", pwd);
//            res.addCookie(c1);
//            res.addCookie(c2);
//            out.println("<script>alert('Successfully signed')</script>");
//            RequestDispatcher rdis = req.getRequestDispatcher("./index.html");
//            rdis.include(req, res);
        } catch (Exception ex) {
            out.println("<script>alert('Sign Error:'" + ex + "')</script>");
        }
    }
}

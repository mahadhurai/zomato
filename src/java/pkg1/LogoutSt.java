package pkg1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LogoutSt", urlPatterns = {"/logout"})
public class LogoutSt extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        Cookie[] cookies = req.getCookies();
        if (cookies == null) {
            RequestDispatcher rdis = req.getRequestDispatcher("./index.html");
            rdis.include(req, res);
            out.println("<script>alert('First login after logout')</script>");
        } else {
            for (Cookie c1 : cookies) {
                c1.setValue("");
                c1.setMaxAge(0);
                res.addCookie(c1);
            }
            RequestDispatcher rdis = req.getRequestDispatcher("./logut.html");
            rdis.include(req, res);
            out.println("<script>alert('Successfully Logout')</script>");
        }

    }
}

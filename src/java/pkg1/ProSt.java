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

@WebServlet(name = "ProSt", urlPatterns = {"/profile"})
public class ProSt extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        Cookie[] cookies = req.getCookies();
        if (cookies == null) {
            RequestDispatcher rdis = req.getRequestDispatcher("./index.html");
            rdis.include(req, res);
            out.println("<script>alert('First login after see your profile')</script>");
        } else {
            for (Cookie c1 : cookies) {
                if (c1.getName().equals("name")) {
//                   out.println("<h1 id=pro1>"+c1.getValue()+"</h1>");
                    out.println("<!DOCTYPE html>\n"
                            + "\n"
                            + "<html>\n"
                            + "    <head>\n"
                            + "        <title>Zomato</title>\n"
                            + "        <link rel=\"icon\" href=\"./image/z1\">\n"
                            + "        <meta charset=\"UTF-8\">\n"
                            + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                            + "        <style>\n"
                            + "            *{\n"
                            + "                padding: 0;\n"
                            + "                margin: 0;\n"
                            + "            }\n"
                            + "            body{\n"
                            + "                background-image: url(./image/z4);\n"
                            + "                background-repeat: no-repeat;\n"
                            + "                background-size: cover;\n"
                            + "            }\n"
                            + "            #pro{\n"
                            + "                width: 370px;\n"
                            + "                height: 450px;\n"
                            + "                background-color: white;\n"
                            + "                border: 2px solid black;\n"
                            + "                margin-left: 500px;\n"
                            + "                margin-top: 60px;\n"
                            + "                border-radius: 30px;\n"
                            + "                box-shadow: 2px 2px 300px black;\n"
                            + "\n"
                            + "            }\n"
                            + "            h1{\n"
                            + "                color: black;\n"
                            + "                font-family: \"Poppins\", system-ui;\n"
                            + "                font-weight: 500;\n"
                            + "                font-style: normal;\n"
                            + "                padding-left: 65px;\n"
                            + "            }\n"
                            + "         \n"
                            + "            #profile{\n"
                            + "                height: 300px;\n"
                            + "                border-radius: 300px;\n"
                            + "                padding-left: 40px;\n"
                            + "            }\n"
                            + "            input{\n"
                            + "                width: 80px;\n"
                            + "                height: 35px;\n"
                            + "                margin-top:20px;\n"
                            + "                margin-left: 150px;\n"
                            + "                font-family: \"Poppins\", system-ui;\n"
                            + "                font-weight: 600;\n"
                            + "                font-style: normal;\n"
                            + "                background-color: white;\n"
                            + "                border: 3px solid blue;\n"
                            + "                border-radius: 10px;\n"
                            + "            }\n"
                            + "            input:hover{\n"
                            + "                cursor: pointer;\n"
                            + "                background-color:  blue;\n"
                            + "                box-shadow: 2px 2px 30px blue;\n"
                            + "                color: white;\n"
                            + "            }\n"
                            + "        </style>\n"
                            + "    </head>\n"
                            + "    <body>\n"
                            + "        <div id=\"pro\">\n"
                            + "        <form action=\"http://localhost:8080/WebApplication/profile\" method=\"post\" >\n"
                            + "            <img src=\"./image/p1\" id=\"profile\">\n"
                            + "            <h1>Welcome  "+c1.getValue()+"</h1>\n"
                            + "            \n"
                            + "        </form>\n"
                            + "        <form action=\"./index.html\" method=\"get\">\n"
                            + "            <input type=\"submit\" value=\"Back\">\n"
                            + "        </form>\n"
                            + "    </div>\n"
                            + "    </body>\n"
                            + "</html>");
                }
            }
        }

    }
}

package ra.com.controller;import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bai6", value = "/Bai6")
public class Bai6 extends HttpServlet {
    private static final String account = "admin";
    private static final String password = "123456789";
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String a = request.getParameter("account");
        String p = request.getParameter("password");
        if(a.equals(account) && p.equals(password)) {
            response.sendRedirect("view/bai3.jsp");
            return;
        }
        response.sendRedirect("view/bai6Error.jsp");
    }
}
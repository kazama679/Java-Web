package ra.com.controller;

import ra.com.model.B2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bai2", value = "/Bai2")
public class Bai2 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        int age;
        try {
            age = Integer.parseInt(request.getParameter("age"));
        }catch (NumberFormatException e){
            age=0;
        }
        String address = request.getParameter("address");
        B2 b2 = new B2(name, age, address);
        request.setAttribute("student", b2);
        request.getRequestDispatcher("view/bai2Comfirm.jsp").forward(request, response);
    }
}
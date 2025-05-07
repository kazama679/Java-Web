package com.data.ss2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserInfoServlet", value = "/bai2")
public class UserInfoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");

        request.setAttribute("name", name);
        request.setAttribute("age", age);

        RequestDispatcher dispatcher = request.getRequestDispatcher("bai2.jsp");
        dispatcher.forward(request, response);
    }
}
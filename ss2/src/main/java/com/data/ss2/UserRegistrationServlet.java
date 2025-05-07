package com.data.ss2;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "UserRegistrationServlet", value = "/UserRegistrationServlet")
public class UserRegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("password", password);

        RequestDispatcher dispatcher = request.getRequestDispatcher("userInfo.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.sendRedirect("bai5.jsp");
    }
}
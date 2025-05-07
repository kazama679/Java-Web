package com.data.ss2;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "RegisterAccountServlet", value = "/RegisterAccountServlet")
public class RegisterAccountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String fullName = request.getParameter("fullName");
        String age = request.getParameter("age");
        String address = request.getParameter("address");
        if (username == null || username.isEmpty() || password == null || password.isEmpty() || fullName == null || fullName.isEmpty()) {
            response.getWriter().println("Đăng ký thất bại! Các trường 'Tên đăng nhập', 'Mật khẩu' và 'Họ tên' là bắt buộc.");
            return;
        }
        response.getWriter().println("Đăng ký tài khoản thành công!");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/baiThucHanh.jsp");
        dispatcher.forward(request, response);
    }
}
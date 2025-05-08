package com.data.ss4;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "BaiTapTrenLop", value = "/BaiTapTrenLop")
public class BaiTapTrenLop extends HttpServlet {
    private static final List<Student> students = new ArrayList<Student>();

    public void init () throws ServletException {
        students.add(new Student("Hà Nội", "Quang", 9));
        students.add(new Student("Hà Nội2", "Quang2", 5));
        students.add(new Student("Hà Nội3", "Quang3", 7));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("students", students);
        request.getRequestDispatcher("baiTapTrenLop.jsp").forward(request, response);
    }

    public void destroy() {
        students.clear();
    }
}
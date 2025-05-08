package com.data.ss4;

import model.Studentbai6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bai6", value = "/Bai6")
public class Bai6 extends HttpServlet {
    private static final List<Studentbai6> students = new ArrayList<Studentbai6>();

    public void init() {
        students.add(new Studentbai6(18, 7.5, 1, "Quang"));
        students.add(new Studentbai6(1, 8.5, 2, "Huyền"));
        students.add(new Studentbai6(20, 5.5, 3, "Quân"));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("students", students);
        request.getRequestDispatcher("bai6.jsp").forward(request, response);
    }

    public void destroy() {
        students.clear();
    }
}
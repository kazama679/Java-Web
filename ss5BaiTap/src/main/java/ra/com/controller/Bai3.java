package ra.com.controller;

import ra.com.model.B3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Bai3", value = "/Bai3")
public class Bai3 extends HttpServlet {
    private static final List<B3> students = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("update".equals(action)) {
            int index = Integer.parseInt(request.getParameter("index"));
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            int age;
            try {
                age = Integer.parseInt(request.getParameter("age"));
            } catch (NumberFormatException e) {
                age = 0;
            }

            if (name.isEmpty() || address.isEmpty() || age == 0) {
                request.getRequestDispatcher("view/bai3Error.jsp").forward(request, response);
                return;
            }

            B3 updated = new B3(name, age, address);
            students.set(index, updated);
            request.setAttribute("students", students);
            request.getRequestDispatcher("view/bai3List.jsp").forward(request, response);

        } else {
            // thêm mới
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            int age;
            try {
                age = Integer.parseInt(request.getParameter("age"));
            } catch (NumberFormatException e) {
                age = 0;
            }

            if (name.isEmpty() || address.isEmpty() || age == 0) {
                request.getRequestDispatcher("view/bai3Error.jsp").forward(request, response);
                return;
            }

            B3 b3 = new B3(name, age, address);
            students.add(b3);
            request.setAttribute("students", students);
            request.getRequestDispatcher("view/bai3List.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        int index = Integer.parseInt(request.getParameter("index"));

        if ("delete".equals(action)) {
            if (index >= 0 && index < students.size()) {
                students.remove(index);
            }
            request.setAttribute("students", students);
            request.getRequestDispatcher("view/bai3List.jsp").forward(request, response);
        } else if ("edit".equals(action)) {
            if (index >= 0 && index < students.size()) {
                B3 student = students.get(index);
                request.setAttribute("student", student);
                request.setAttribute("index", index);
                request.getRequestDispatcher("view/bai3Edit.jsp").forward(request, response);
            }
        }
    }
}
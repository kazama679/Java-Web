package com.data.ss4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "Bai8", value = "/Bai8")
public class Bai8 extends HttpServlet {
    private static final Map<String, Double> revenues = new LinkedHashMap<>();

    public void init() {
        revenues.put("Tháng 1", 1000.0);
        revenues.put("Tháng 2", 2000.0);
        revenues.put("Tháng 3", 3000.0);
        revenues.put("Tháng 4", 4000.0);
        revenues.put("Tháng 5", 5000.0);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("revenues", revenues);
        request.getRequestDispatcher("bai8.jsp").forward(request, response);
    }
}
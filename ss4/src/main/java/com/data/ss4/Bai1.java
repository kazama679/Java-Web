package com.data.ss4;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bai1", value = "/Bai1")
public class Bai1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("laptop đẳng cấp", 1, 1500.0, "Laptop Dell"));
        products.add(new Product("laptop xịn", 2, 800.0, "Headphones Sony"));
        products.add(new Product("Điện thoại thông minh", 3, 150.0, "Smartphone Samsung"));

        request.setAttribute("products", products);
        request.getRequestDispatcher("/bai1.jsp").forward(request, response);
    }
}
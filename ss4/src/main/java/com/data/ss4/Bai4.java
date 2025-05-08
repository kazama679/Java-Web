package com.data.ss4;

import model.ProductBai4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bai4", value = "/Bai4")
public class Bai4 extends HttpServlet {
    public static final List<ProductBai4> products = new ArrayList<ProductBai4>();

    public void init() {
        products.add(new ProductBai4("Mô tả 1", "1", "Sản phẩm 1", 123));
        products.add(new ProductBai4("", "2", "Sản phẩm 2", 0));
        products.add(new ProductBai4("Mô tả 3", "3", "Sản phẩm 3", 333));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("products", products);
        request.getRequestDispatcher("b4.jsp").forward(request, response);
    }

    public void destroy() {
        products.clear();
    }
}
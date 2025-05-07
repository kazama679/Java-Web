package com.data.ss2;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ProductServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    public static List<Product> productList = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String deleteId = request.getParameter("deleteId");
        String updateId = request.getParameter("updateId");
        if (updateId != null) {
            int id = Integer.parseInt(updateId);
            String name = request.getParameter("name");
            double price = Double.parseDouble(request.getParameter("price"));
            for (Product p : productList) {
                if (p.getId() == id) {
                    p.setName(name);
                    p.setPrice(price);
                    break;
                }
            }
        } else if (deleteId != null) {
            int id = Integer.parseInt(deleteId);
            productList.removeIf(p -> p.getId() == id);
        } else {
            String name = request.getParameter("name");
            double price = Double.parseDouble(request.getParameter("price"));
            Product product = new Product(name, price);
            productList.add(product);
        }
        response.sendRedirect("products");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String updateId = request.getParameter("updateId");
        if (updateId != null) {
            int id = Integer.parseInt(updateId);
            for (Product p : productList) {
                if (p.getId() == id) {
                    request.setAttribute("editProduct", p);
                    break;
                }
            }
        }
        request.setAttribute("products", productList);
        request.getRequestDispatcher("productList.jsp").forward(request, response);
    }

}
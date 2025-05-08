package com.data.ss4;

import model.ProductBai4;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bai7", value = "/Bai7")
public class Bai7 extends HttpServlet {
    private static final List<ProductBai4> products = new ArrayList<>();

    public void init() {
        products.add(new ProductBai4("Mô tả 1", "1", "Sản phẩm 1", 100));
        products.add(new ProductBai4("Mô tả 2", "2", "Sản phẩm 2", 200));
        products.add(new ProductBai4("Mô tả 3", "3", "Sản phẩm 3", 300));
        products.add(new ProductBai4("Mô tả 4", "4", "Sản phẩm 4", 400));
        products.add(new ProductBai4("Mô tả 5", "5", "Sản phẩm 5", 500));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String minPriceStr = request.getParameter("minPrice");
        String maxPriceStr = request.getParameter("maxPrice");
        double minPrice = 0;
        double maxPrice = Double.MAX_VALUE;
        if (minPriceStr != null && !minPriceStr.isEmpty()) {
            minPrice = Double.parseDouble(minPriceStr);
        }
        if (maxPriceStr != null && !maxPriceStr.isEmpty()) {
            maxPrice = Double.parseDouble(maxPriceStr);
        }
        List<ProductBai4> filteredProducts = new ArrayList<>();
        for (ProductBai4 product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                filteredProducts.add(product);
            }
        }
        request.setAttribute("filteredProducts", filteredProducts);
        request.setAttribute("minPrice", minPriceStr);
        request.setAttribute("maxPrice", maxPriceStr);
        request.getRequestDispatcher("bai7.jsp").forward(request, response);
    }
}
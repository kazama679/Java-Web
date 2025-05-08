package com.data.ss4;

import model.ProductBai4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Bai5", value = "/Bai5")
public class Bai5 extends HttpServlet {
    private static final List<ProductBai4> products = new ArrayList<>();

    public void init(){
        products.add(new ProductBai4("Mô tả 1", "1", "Sản phẩm 1", 123));
        products.add(new ProductBai4("", "2", "Sản phẩm 2", 0));
        products.add(new ProductBai4("Mô tả 3", "3", "Sản phẩm 3", 333));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("id");
        ProductBai4 findPro = null;
        for(ProductBai4 p: products){
            if(p.getId().equals(id)){
                findPro = p;
                break;
            }
        }
        request.setAttribute("product", findPro);
        request.getRequestDispatcher("/bai5.jsp").forward(request, response);
    }

    public void destroy() {
        products.clear();
    }
}
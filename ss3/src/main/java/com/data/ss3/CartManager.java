package com.data.ss3;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*;

public class CartManager extends HttpServlet {
    private static List<ProductBai10> cart = new ArrayList<>();

    public static void addProduct(ProductBai10 product) {
        for (ProductBai10 p : cart) {
            if (p.getId() == product.getId()) {
                System.out.println("Sản phẩm đã tồn tại trong giỏ hàng.");
                return;
            }
        }
        cart.add(product);
    }

    public static List<ProductBai10> getCart() {
        return cart;
    }

    public static void removeProduct(int id) {
        cart.removeIf(product -> product.getId() == id);
    }

    public static double getTotalPrice() {
        double total = 0;
        for (ProductBai10 p : cart) {
            total += p.getPrice();
        }
        return total;
    }
}
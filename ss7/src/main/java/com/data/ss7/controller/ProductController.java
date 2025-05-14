package com.data.ss7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/{category}")
    public String filterProducts(
            @PathVariable String category,
            @MatrixVariable(pathVar = "category", required = false) Map<String, String> matrixVars,
            Model model) {
        String color = matrixVars.get("color");
        String size = matrixVars.get("size");
        List<String> filteredProducts = new ArrayList<>();
        if ("red".equalsIgnoreCase(color)) {
            filteredProducts.add("Red Shirt");
        }
        if ("M".equalsIgnoreCase(size)) {
            filteredProducts.add("Medium Pants");
        }
        model.addAttribute("category", category);
        model.addAttribute("color", color);
        model.addAttribute("size", size);
        model.addAttribute("products", filteredProducts);
        return "productList";
    }
}
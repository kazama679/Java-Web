package com.data.ss7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class FormController {

    @GetMapping("/show")
    public String showForm() {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(
            @RequestParam("name") String name,
            @RequestParam("phone") String phone,
            @RequestParam("address") String address,
            @RequestParam("feedback") String feedback,
            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("phone", phone);
        model.addAttribute("address", address);
        model.addAttribute("feedback", feedback);
        return "result";
    }
}
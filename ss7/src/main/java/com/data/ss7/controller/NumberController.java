package com.data.ss7.controller;

import com.data.ss7.repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/number")
public class NumberController {

    @Autowired
    private NumberRepository numberService;

    @GetMapping
    public ModelAndView getAll() {
        ModelAndView modelAndView = new ModelAndView("number");

        int total = numberService.getTotal(12,5);
        modelAndView.addObject("total", total);
        return modelAndView;
    }
}
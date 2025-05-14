package com.data.ss7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public ModelAndView getAll() {
        ModelAndView modelAndView = new ModelAndView("bai1");
        return modelAndView;
    }

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public ModelAndView greet(@RequestParam String name) {
        String message = "Hello, " + name + "!";
        ModelAndView modelAndView = new ModelAndView("greet");
        modelAndView.addObject("message", message);
        return modelAndView;
    }
}

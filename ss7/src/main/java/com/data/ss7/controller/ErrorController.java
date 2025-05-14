package com.data.ss7.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {
    @RequestMapping("/error")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ModelAndView handleError() {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("message", "Trang bạn tìm kiếm không tồn tại.");
        return modelAndView;
    }
}
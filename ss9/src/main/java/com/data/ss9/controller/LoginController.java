package com.data.ss9.controller;

import com.data.ss9.model.Customer;
import com.data.ss9.model.Movie;
import com.data.ss9.model.Schedule;
import com.data.ss9.service.CustomerService;
import com.data.ss9.service.MovieService;
import com.data.ss9.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private MovieService movieService;
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("home")
    public String home(Model model) {
        List<Movie> movies = movieService.find_all();
        model.addAttribute("movies", movies);
        return "home";
    }

    @GetMapping("movie/{id}")
    public String detailMovie(Model model, @PathVariable int id) {
        Movie movie = movieService.find_by_id(id);
        List<Schedule> schedules = scheduleService.findAll();
        model.addAttribute("movie", movie);
        model.addAttribute("schedules", schedules);
        return "detailMovie";
    }

    @PostMapping("loginCheck")
    public String loginCheck(@RequestParam String username, @RequestParam String password) {
        List<Customer> customers = customerService.findAll();
        if(customers.stream().anyMatch(c -> c.getUsername().equals(username) && c.getPassword().equals(password))) {
            return "redirect:/home";
        }
        return "login";
    }
}
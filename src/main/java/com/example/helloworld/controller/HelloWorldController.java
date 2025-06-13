package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello from Badreldin Bashir Altayeb!");
        return "index"; // This will resolve to templates/index.html
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World from Badr!";
    }
}
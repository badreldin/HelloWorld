package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String home(Model model) {
        model.addAttribute("message", "Hello from Badreldin with Java 21!");
        return "index"; // Refers to src/main/resources/templates/index.html
    }
}

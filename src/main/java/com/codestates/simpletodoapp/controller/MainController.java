package com.codestates.simpletodoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }
}

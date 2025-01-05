package com.example.myProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {
    @GetMapping({"/saludo/{name}", "/hola/{name}"})
    public String greeting(@PathVariable String name) {
        System.out.println("request executed");
        return "Hola " + name;
    }
}

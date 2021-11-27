package com.example.layout.home.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String goHome() {
        return "view/home";
    }

    @GetMapping("/test")
    public String goTest() {
        return "view/test";
    }

    @GetMapping("/layout")
    public String goLayout() {
        return "layouts/layout";
    }
}

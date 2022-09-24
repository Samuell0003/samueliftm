package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/")
    public String pag() {
        
        return "index";
    }
    @GetMapping("/view")
    public String pag2() {
        return "view";
    }

}

package com.example.condominio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeProprietario {

    @GetMapping("/proprietario")
    public String prop() {
        return "proprietario";
    }

    @GetMapping("/novoproprietario")
    public String novoProp() {
        return "novoproprietario";
    }
    
}

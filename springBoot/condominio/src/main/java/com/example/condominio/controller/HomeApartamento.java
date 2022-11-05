package com.example.condominio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeApartamento {

    @GetMapping("/apto")
    public String apto() {
        return "apartamento";
    }

    @GetMapping("/novoapto")
    public String novoapto() {
        return "novoproprietario";
    }
}

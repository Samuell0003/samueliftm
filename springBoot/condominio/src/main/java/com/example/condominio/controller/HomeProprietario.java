package com.example.condominio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.condominio.model.Proprietario;
import com.example.condominio.repository.RepositoryProprietario;

@Controller
public class HomeProprietario {

    @Autowired
    RepositoryProprietario repository;

    @GetMapping("/proprietario")
    public String prop() {
        return "proprietario";
    }

    @GetMapping("novoproprietario")
    public String form(Model model) {
        model.addAttribute("proprietario", new Proprietario());
        return "novoproprietario";
    }

    @PostMapping("novoproprietario")
    public String gravarProp(Proprietario proprietario) {
        repository.gravar(proprietario);
        return "index";
    }
}

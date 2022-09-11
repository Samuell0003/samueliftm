package com.example.exercicio5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.exercicio5.model.Pessoa;

@Controller
public class Home {
    @GetMapping
    public String home(Model model) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Samuel");
        pessoa.setSobreNome("Lucas");
        model.addAttribute("p", pessoa);
        return "index";
    }
}

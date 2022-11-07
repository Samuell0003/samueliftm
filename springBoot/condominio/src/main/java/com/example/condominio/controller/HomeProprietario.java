package com.example.condominio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.condominio.model.Proprietario;
import com.example.condominio.repository.RepositoryProprietario;

@Controller
public class HomeProprietario {

    @Autowired
    RepositoryProprietario repository;

    @GetMapping("/proprietario")
    public String prop(Model model) {
        List<Proprietario> proprietario = repository.selectFull();
        model.addAttribute("proprietario", proprietario);
        return "paginas/proprietarios";
    }

    @GetMapping("novoproprietario")
    public String form(Model model) {
        model.addAttribute("proprietario", new Proprietario());
        return "paginas/novoproprietario";
    }

    @PostMapping("novoproprietario")
    public String gravarProp(Proprietario proprietario) {
        repository.gravar(proprietario);
        return "paginas/index";
    }

    @GetMapping("excluirProprietario")
    public String excluir(@RequestParam(value = "id", required = true) Integer cod) {
        repository.excluirDB(cod);
        return "redirect:/proprietario";
    }
}

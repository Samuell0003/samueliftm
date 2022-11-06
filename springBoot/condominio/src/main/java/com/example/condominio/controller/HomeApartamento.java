package com.example.condominio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.condominio.model.Apartamento;
import com.example.condominio.model.Proprietario;
import com.example.condominio.repository.RepositoryApartamento;
import com.example.condominio.repository.RepositoryProprietario;

@Controller
public class HomeApartamento {
    @Autowired
    RepositoryProprietario repositoryPro;

    @Autowired
    RepositoryApartamento repositoryApto;

    @GetMapping("/apto")
    public String apto(Model model) {
        List<Apartamento> lista = repositoryApto.aptos();
        model.addAttribute("apartamento", lista);
        return "apartamento";
    }

    @GetMapping("/novoapto")
    public String novoapto(Model model) {

        model.addAttribute("apartamento", new Apartamento());
        List<Proprietario> lista = repositoryPro.selectFull();
        model.addAttribute("proprietario", lista);
    
        return "novoapartamento";
    }

    @PostMapping("/novoapto")
    public String cadastrarApto(Apartamento apto) {
        repositoryApto.gravarApto(apto);
        return "index";
    }

    @GetMapping("excluirAP")
    public String excluirAp(@RequestParam(value = "id", required = true) Integer cod){
        repositoryApto.excluirBD(cod);
        return "redirect:/apto";
    }
}

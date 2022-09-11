package com.example.samueliftm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping
    public String home (Model model) {
        List<Integer> number = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<6; i++){
            number.add(random.nextInt(100));
        }
        model.addAttribute("num", number);
        return "index";
    }
}

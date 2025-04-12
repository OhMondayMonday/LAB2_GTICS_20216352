package com.example.lab2_20216352.controller;

import com.example.lab2_20216352.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/autos")
public class AutoController {
    @Autowired
    private AutoRepository autoRepository;

    @GetMapping
    public String listarAutos(Model model) {
        model.addAttribute("autos", autoRepository.findAll());
        return "autos";
    }
}
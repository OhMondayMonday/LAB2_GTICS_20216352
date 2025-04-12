package com.example.lab2_20216352.controller;

import com.example.lab2_20216352.entity.Seguro;
import com.example.lab2_20216352.repositories.AutoRepository;
import com.example.lab2_20216352.repositories.SeguroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seguros")
public class SeguroController {

    @Autowired
    private SeguroRepository seguroRepository;

    @GetMapping("/nuevo")
    public String mostrarFormularioSeguro(Model model) {
        model.addAttribute("seguro", new Seguro());
        return "nuevoSeguro";
    }

    @PostMapping("/guardar")
    public String guardarSeguro(@ModelAttribute("seguro") Seguro seguro) {
        seguroRepository.save(seguro);
        return "redirect:/seguros";
    }

}

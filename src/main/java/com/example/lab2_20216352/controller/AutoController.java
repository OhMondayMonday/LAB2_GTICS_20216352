package com.example.lab2_20216352.controller;

import com.example.lab2_20216352.entity.Auto;
import com.example.lab2_20216352.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/nuevo")
    public String mostrarFormularioAuto(Model model) {
        model.addAttribute("auto", new Auto());
        return "nuevoAuto";
    }

    @PostMapping("/guardar")
    public String guardarAuto(@ModelAttribute("auto") Auto auto) {
        autoRepository.save(auto);
        return "redirect:/autos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarAuto(@PathVariable("id") Integer id) {
        autoRepository.deleteById(id);
        return "redirect:/autos";
    }
}
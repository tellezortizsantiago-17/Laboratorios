package com.example.petmach_tab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
@GetMapping("/")
public String home(Model model) {
    model.addAttribute("message", "Bienvenido al catálogo de mascotas");
    return "home";
}

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
package com.sofitapp.spring5jokesappv2.controllers;

import com.sofitapp.spring5jokesappv2.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    @Autowired
    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }
    @GetMapping("/")
    public String  getJoke(Model model){
        model.addAttribute("joke",jokesService.getRandomJoke());
        return "index";
    }
}

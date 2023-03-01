package drampas.springframework.jokeapp.controllers;

import drampas.springframework.jokeapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String getBooks(Model model){

        model.addAttribute("joke",jokesService.getJoke());
        return "index";
    }

}

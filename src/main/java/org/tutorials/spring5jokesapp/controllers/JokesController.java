package org.tutorials.spring5jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tutorials.spring5jokesapp.models.Joke;

@Controller
public class JokesController {

    @RequestMapping("/")
    public Joke getJoke()
    {
        return new Joke();
    }
}

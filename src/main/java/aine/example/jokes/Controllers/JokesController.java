package aine.example.jokes.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {


    public JokesController() {
    }

    @RequestMapping("/")
    public String getJoke() {
        return "a mediocre Joke";
    }
}

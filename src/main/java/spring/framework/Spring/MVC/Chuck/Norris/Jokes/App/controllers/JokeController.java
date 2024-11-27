package spring.framework.Spring.MVC.Chuck.Norris.Jokes.App.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.framework.Spring.MVC.Chuck.Norris.Jokes.App.service.JokeService;

@Controller
public class JokeController {

 private final JokeService jokeService;


 @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }



    @RequestMapping("/")
    public String showJoke(Model model){
     model.addAttribute("joke",jokeService.getJoke());

     return  "joke";
    }


}

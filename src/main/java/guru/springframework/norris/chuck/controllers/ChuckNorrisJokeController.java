package guru.springframework.norris.chuck.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.norris.chuck.services.ChuckNorrisJokeServiceImpl;

@Controller
public class ChuckNorrisJokeController {

	private final ChuckNorrisJokeServiceImpl chuckNorrisJokeServiceImpl;

	public ChuckNorrisJokeController(ChuckNorrisJokeServiceImpl chuckNorrisJokeServiceImpl) {
		this.chuckNorrisJokeServiceImpl = chuckNorrisJokeServiceImpl;
	}
	
	@RequestMapping("/")
	public String getChuckNorrisJoke(Model model) {
		String nomAttributDansTemplateThymeleaf = "blagueChuckNorris";
		model.addAttribute(nomAttributDansTemplateThymeleaf, chuckNorrisJokeServiceImpl.getRandomQuote());
		
		String nomRepertoireThymeleaf = "chuck-norris";
		String nomTemplateThymeleaf = "joke";
		String modelPourRetour = nomRepertoireThymeleaf + "/" + nomTemplateThymeleaf;
		return  modelPourRetour;
	}
}

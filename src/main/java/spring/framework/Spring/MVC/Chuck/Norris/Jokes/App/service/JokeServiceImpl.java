package spring.framework.Spring.MVC.Chuck.Norris.Jokes.App.service;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }


    @Override
    public String getJoke() {


        return chuckNorrisQuotes.getRandomQuote();
    }
}

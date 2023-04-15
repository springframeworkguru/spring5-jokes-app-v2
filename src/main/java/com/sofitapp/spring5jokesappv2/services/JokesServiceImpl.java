package com.sofitapp.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class JokesServiceImpl implements JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes=new ChuckNorrisQuotes();
    @Override
    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

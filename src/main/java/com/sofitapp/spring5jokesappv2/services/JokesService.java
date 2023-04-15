package com.sofitapp.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public interface JokesService {
    String getRandomJoke();
}

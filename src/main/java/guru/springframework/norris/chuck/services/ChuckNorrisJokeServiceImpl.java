package guru.springframework.norris.chuck.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrisJokeService {

	@Override
	public String getRandomQuote() {
		return new ChuckNorrisQuotes().getRandomQuote();
	}

}

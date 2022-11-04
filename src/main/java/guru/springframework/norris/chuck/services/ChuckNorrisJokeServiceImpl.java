package guru.springframework.norris.chuck.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrisJokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public ChuckNorrisJokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getRandomQuote() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}

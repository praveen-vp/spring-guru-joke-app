package com.pvp.joke.springgurujokeapp.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * 
 * @author praveen-vp
 * 15-Jul-2018
 *
 */
@Service
public class JokeServiceImp implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeServiceImp(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		
		System.out.println(chuckNorrisQuotes.getRandomQuote());
		return chuckNorrisQuotes.getRandomQuote();
	}

}

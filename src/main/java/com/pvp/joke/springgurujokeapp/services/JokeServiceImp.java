package com.pvp.joke.springgurujokeapp.services;

import org.springframework.beans.factory.annotation.Autowired;
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

	public JokeServiceImp() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		
		System.out.println(chuckNorrisQuotes.getRandomQuote());
		return chuckNorrisQuotes.getRandomQuote();
	}

}

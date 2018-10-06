package com.pvp.joke.springgurujokeapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * 
 * @author praveen-vp 15-Jul-2018
 *
 */
//@Configuration
public class ChuckConfiguration {

//	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return  new ChuckNorrisQuotes();
	}
	
	
}

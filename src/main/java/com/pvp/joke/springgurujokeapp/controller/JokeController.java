package com.pvp.joke.springgurujokeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pvp.joke.springgurujokeapp.services.JokeService;
import com.pvp.joke.springgurujokeapp.services.JokeServiceImp;

/**
 * 
 * @author praveen-vp 15-Jul-2018
 *
 */
@Controller
public class JokeController {

	JokeService jokeService;

	@Autowired
	public JokeController() {
		this.jokeService = new JokeServiceImp();
	}

	@RequestMapping({ "/", "" })
	public String getjoke(Model model) {
		
		model.addAttribute("joke", this.jokeService.getJoke());
		
		return "jokes";
	}

}

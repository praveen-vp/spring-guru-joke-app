package com.pvp.joke.springgurujokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringGuruJokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGuruJokeAppApplication.class, args);
	}
}

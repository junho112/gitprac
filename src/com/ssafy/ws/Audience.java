package com.ssafy.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Audience {
	
	private Movie movie;
	
	@Autowired
	public Audience(Movie movie) {
		super();
		this.movie = movie;
	}

	public void watch() {
		System.out.println(movie.getInfo());
	}
}

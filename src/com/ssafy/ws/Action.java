package com.ssafy.ws;

import org.springframework.stereotype.Component;

@Component
public class Action implements Movie {

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "우웩우엑.";
	}

}
